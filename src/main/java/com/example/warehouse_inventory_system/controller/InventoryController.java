package com.example.warehouse_inventory_system.controller;

import com.example.warehouse_inventory_system.entity.Inventory;
import com.example.warehouse_inventory_system.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "http://localhost:3000")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory){
        return inventoryService.saveInventory(inventory);
    }

    @GetMapping
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllInventory();
    }

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable Long id){
        inventoryService.deleteInventory(id);
    }
}