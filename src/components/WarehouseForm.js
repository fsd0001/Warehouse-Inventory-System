import React, { useState } from "react";
import API from "../services/api";

function WarehouseForm({ refresh }) {

    const [name, setName] = useState("");
    const [location, setLocation] = useState("");

    const save = () => {
        API.post("/warehouses", { name, location }).then(() => {
            alert("Saved");
            refresh();
        });
    };

    return (
        <div className="card p-3 shadow mt-3">
            <h4>Add Warehouse</h4>

            <input className="form-control mb-2" placeholder="Name" onChange={(e)=>setName(e.target.value)}/>
            <input className="form-control mb-2" placeholder="Location" onChange={(e)=>setLocation(e.target.value)}/>

            <button className="btn btn-success" onClick={save}>Save</button>
        </div>
    );
}

export default WarehouseForm;