import React, { useState } from "react";
import Navbar from "./components/Navbar";
import ProductForm from "./components/ProductForm";
import ProductList from "./components/ProductList";
import WarehouseForm from "./components/WarehouseForm";
import WarehouseList from "./components/WarehouseList";
import InventoryForm from "./components/InventoryForm";
import InventoryList from "./components/InventoryList";

function App() {

    const [selectedProduct, setSelectedProduct] = useState(null);

    const refresh = () => window.location.reload();

    return (
        <div>

            <Navbar />

            <div className="container mt-4">

                <div className="row">
                    <div className="col-md-4">
                        <ProductForm selectedProduct={selectedProduct} refresh={refresh}/>
                    </div>

                    <div className="col-md-8">
                        <ProductList setSelectedProduct={setSelectedProduct}/>
                    </div>
                </div>

                <WarehouseForm refresh={refresh}/>
                <WarehouseList />

                <InventoryForm refresh={refresh}/>
                <InventoryList />

            </div>

        </div>
    );
}

export default App;