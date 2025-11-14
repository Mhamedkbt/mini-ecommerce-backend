package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.repository.OrderRepository;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }



}
