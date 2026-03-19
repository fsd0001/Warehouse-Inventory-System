package com.example.warehouse_inventory_system.repository;

import com.example.warehouse_inventory_system.entity.Inventory;
import com.example.warehouse_inventory_system.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository  extends JpaRepository<Inventory, Long> {
}
