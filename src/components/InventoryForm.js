import React, { useEffect, useState } from "react";
import API from "../services/api";

function InventoryForm({ refresh }) {

    const [products, setProducts] = useState([]);
    const [warehouses, setWarehouses] = useState([]);
    const [productId, setProductId] = useState("");
    const [warehouseId, setWarehouseId] = useState("");
    const [quantity, setQuantity] = useState("");

    useEffect(() => {
        API.get("/products").then(res => setProducts(res.data));
        API.get("/warehouses").then(res => setWarehouses(res.data));
    }, []);

    const save = () => {
        API.post("/inventory", {
            product: { id: productId },
            warehouse: { id: warehouseId },
            quantity
        }).then(() => {
            alert("Saved");
            refresh();
        });
    };

    return (
        <div className="card p-3 shadow mt-3">
            <h4>Add Inventory</h4>

            <select className="form-control mb-2" onChange={(e)=>setProductId(e.target.value)}>
                <option>Select Product</option>
                {products.map(p => <option key={p.id} value={p.id}>{p.name}</option>)}
            </select>

            <select className="form-control mb-2" onChange={(e)=>setWarehouseId(e.target.value)}>
                <option>Select Warehouse</option>
                {warehouses.map(w => <option key={w.id} value={w.id}>{w.name}</option>)}
            </select>

            <input className="form-control mb-2" placeholder="Quantity" onChange={(e)=>setQuantity(e.target.value)}/>

            <button className="btn btn-primary" onClick={save}>Save</button>
        </div>
    );
}

export default InventoryForm;