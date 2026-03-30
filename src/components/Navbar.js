import React from "react";

function Navbar() {
    return (
        <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
            <div className="container">

                <a className="navbar-brand" href="#">
                    Inventory System
                </a>

                <div>
                    <span className="text-white">Dashboard</span>
                </div>

            </div>
        </nav>
    );
}

export default Navbar;