package com.example.warehouse_inventory_system.service;

import com.example.warehouse_inventory_system.entity.Order;
import com.example.warehouse_inventory_system.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}