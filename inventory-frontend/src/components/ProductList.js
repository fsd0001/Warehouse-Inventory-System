import React, { useEffect, useState } from "react";
import API from "../services/api";

function ProductList({ setSelectedProduct }) {

    const [products, setProducts] = useState([]);

    const load = () => {
        API.get("/products").then(res => setProducts(res.data));
    };

    useEffect(() => {
        load();
    }, []);

    const deleteProduct = (id) => {
        API.delete(`/products/${id}`).then(load);
    };

    return (
        <div className="card p-3 shadow">
            <h4>Products</h4>

            <table className="table table-bordered">
                <thead className="table-dark">
                <tr>
                    <th>Name</th>
                    <th>SKU</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
                </thead>

                <tbody>
                {products.map(p => (
                    <tr key={p.id}>
                        <td>{p.name}</td>
                        <td>{p.sku}</td>
                        <td>{p.price}</td>
                        <td>
                            <button className="btn btn-warning btn-sm me-2" onClick={()=>setSelectedProduct(p)}>Edit</button>
                            <button className="btn btn-danger btn-sm" onClick={()=>deleteProduct(p.id)}>Delete</button>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
}

export default ProductList;