package com.example.warehouse_inventory_system.repository;

import com.example.warehouse_inventory_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
