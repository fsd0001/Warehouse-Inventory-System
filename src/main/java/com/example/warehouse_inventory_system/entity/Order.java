package com.example.warehouse_inventory_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String status;

    @ManyToOne
    private Warehouse warehouse;

    public Order(){}

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}