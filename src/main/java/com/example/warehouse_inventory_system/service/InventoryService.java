package com.example.warehouse_inventory_system.service;

import com.example.warehouse_inventory_system.entity.Inventory;
import com.example.warehouse_inventory_system.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository){
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory saveInventory(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventory(){
        return inventoryRepository.findAll();
    }

    public void deleteInventory(Long id){
        inventoryRepository.deleteById(id);
    }
}