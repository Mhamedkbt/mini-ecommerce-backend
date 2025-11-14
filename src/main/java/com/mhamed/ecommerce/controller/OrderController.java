package com.mhamed.ecommerce.controller;

import com.mhamed.ecommerce.model.Order;
import com.mhamed.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    List<Order> orders = new ArrayList<>();

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getTheAllOrders();
    }

    @PostMapping
    public Order creteOrder(@RequestBody Order order) {
        orders.add(order);
        return order;
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {
        for(Order o : orders) {
            if (o.getId() == id) {
                orders.remove(o);
                return "✅ Order deleted successfully!";
            }
        }
        return "❌ Order not found!";
    }

}
