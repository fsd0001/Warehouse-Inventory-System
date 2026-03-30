import React, { useState, useEffect } from "react";
import API from "../services/api";

function ProductForm({ selectedProduct, refresh }) {

    const [id, setId] = useState(null);
    const [name, setName] = useState("");
    const [sku, setSku] = useState("");
    const [price, setPrice] = useState("");

    useEffect(() => {
        if (selectedProduct) {
            setId(selectedProduct.id);
            setName(selectedProduct.name);
            setSku(selectedProduct.sku);
            setPrice(selectedProduct.price);
        }
    }, [selectedProduct]);

    const handleSubmit = (e) => {
        e.preventDefault();

        const product = { name, sku, price };

        if (id) {
            API.put(`/products/${id}`, product).then(() => {
                alert("Updated");
                refresh();
            });
        } else {
            API.post("/products", product).then(() => {
                alert("Added");
                refresh();
            });
        }
    };

    return (
        <div className="card p-3 shadow">
            <h4>{id ? "Update Product" : "Add Product"}</h4>

            <input className="form-control mb-2" value={name} onChange={(e)=>setName(e.target.value)} placeholder="Name"/>
            <input className="form-control mb-2" value={sku} onChange={(e)=>setSku(e.target.value)} placeholder="SKU"/>
            <input className="form-control mb-2" value={price} onChange={(e)=>setPrice(e.target.value)} placeholder="Price"/>

            <button className="btn btn-primary" onClick={handleSubmit}>
                {id ? "Update" : "Save"}
            </button>
        </div>
    );
}

export default ProductForm;