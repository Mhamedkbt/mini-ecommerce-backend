package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.model.Order;
import com.mhamed.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getTheAllOrders() {
        return orderRepository.findAll();
    }

    public Order getTheOrderById(Integer id) {
        return orderRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void insertOrder(Order order) {
        orderRepository.save(order);
    }

    public void deleteTheOrderById(int id) {
        orderRepository.deleteById(id);
    }
}
