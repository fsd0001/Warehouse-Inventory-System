package com.example.warehouse_inventory_system.service;

import com.example.warehouse_inventory_system.entity.OrderItem;
import com.example.warehouse_inventory_system.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository){
        this.orderItemRepository = orderItemRepository;
    }

    public OrderItem saveOrderItem(OrderItem orderItem){
        return orderItemRepository.save(orderItem);
    }

    public List<OrderItem> getAllOrderItems(){
        return orderItemRepository.findAll();
    }

    public void deleteOrderItem(Long id){
        orderItemRepository.deleteById(id);
    }
}