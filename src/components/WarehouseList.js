import React, { useEffect, useState } from "react";
import API from "../services/api";

function WarehouseList() {

    const [data, setData] = useState([]);

    useEffect(() => {
        API.get("/warehouses").then(res => setData(res.data));
    }, []);

    return (
        <div className="card p-3 shadow mt-3">
            <h4>Warehouses</h4>

            <table className="table">
                <thead className="table-dark">
                <tr>
                    <th>Name</th>
                    <th>Location</th>
                </tr>
                </thead>

                <tbody>
                {data.map(w => (
                    <tr key={w.id}>
                        <td>{w.name}</td>
                        <td>{w.location}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
}

export default WarehouseList;