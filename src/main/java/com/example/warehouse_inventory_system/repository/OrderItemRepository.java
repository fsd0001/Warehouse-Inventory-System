package com.example.warehouse_inventory_system.repository;

import com.example.warehouse_inventory_system.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
