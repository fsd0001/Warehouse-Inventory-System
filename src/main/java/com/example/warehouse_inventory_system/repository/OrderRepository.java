package com.example.warehouse_inventory_system.repository;

import com.example.warehouse_inventory_system.entity.Inventory;
import com.example.warehouse_inventory_system.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
