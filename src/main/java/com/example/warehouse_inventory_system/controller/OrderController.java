package com.example.warehouse_inventory_system.controller;

import com.example.warehouse_inventory_system.entity.Order;
import com.example.warehouse_inventory_system.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id){
        orderService.deleteOrder(id);
    }
}