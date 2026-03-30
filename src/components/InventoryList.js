import React, { useEffect, useState } from "react";
import API from "../services/api";

function InventoryList() {

    const [data, setData] = useState([]);

    useEffect(() => {
        API.get("/inventory").then(res => setData(res.data));
    }, []);

    return (
        <div className="card p-3 shadow mt-3">
            <h4>Inventory</h4>

            <table className="table">
                <thead className="table-dark">
                <tr>
                    <th>Product</th>
                    <th>Warehouse</th>
                    <th>Qty</th>
                </tr>
                </thead>

                <tbody>
                {data.map(i => (
                    <tr key={i.id}>
                        <td>{i.product?.name}</td>
                        <td>{i.warehouse?.name}</td>
                        <td>{i.quantity}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
}

export default InventoryList;