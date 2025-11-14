package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.model.Order;
import com.mhamed.ecommerce.repository.OrderRepository;

import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


}
