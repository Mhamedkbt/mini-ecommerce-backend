package com.mhamed.ecommerce.controller;

import com.mhamed.ecommerce.model.Order;
import com.mhamed.ecommerce.repository.OrderRepository;
import com.mhamed.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;
    List<Order> orders = new ArrayList<>();

    private final OrderService orderService;

    public OrderController(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getTheAllOrders();
    }

    @GetMapping("{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.getTheOrderById(id);
    }

    @PostMapping
    public void addNewOrder(@RequestBody Order order) {
        orderService.insertOrder(order);
    }

//    @PostMapping
//    public Order creteOrder(@RequestBody Order order) {
//        orders.add(order);
//        return order;
//    }

//    @DeleteMapping("/{id}")
//    public String deleteOrder(@PathVariable int id) {
//        for(Order o : orders) {
//            if (o.getId() == id) {
//                orders.remove(o);
//                return "✅ Order deleted successfully!";
//            }
//        }
//        return "❌ Order not found!";
//    }

    @DeleteMapping("{id}")
    public void deleteOrderById(@PathVariable int id) {
        orderService.deleteTheOrderById(id);

    }

}
