package com.example.warehouse_inventory_system.controller;

import com.example.warehouse_inventory_system.entity.Warehouse;
import com.example.warehouse_inventory_system.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
@CrossOrigin(origins = "http://localhost:3000")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }

    @PostMapping
    public Warehouse createWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.saveWarehouse(warehouse);
    }

    @GetMapping
    public List<Warehouse> getAllWarehouses(){
        return warehouseService.getAllWarehouses();
    }

    @DeleteMapping("/{id}")
    public void deleteWarehouse(@PathVariable Long id){
        warehouseService.deleteWarehouse(id);
    }
}