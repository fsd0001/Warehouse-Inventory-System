package com.example.warehouse_inventory_system.controller;


import com.example.warehouse_inventory_system.entity.OrderItem;
import com.example.warehouse_inventory_system.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService){
        this.orderItemService = orderItemService;
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem){
        return orderItemService.saveOrderItem(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems(){
        return orderItemService.getAllOrderItems();
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Long id){
        orderItemService.deleteOrderItem(id);
    }
}