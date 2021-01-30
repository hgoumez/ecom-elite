package com.illishop.order.controller;

import com.illishop.order.model.Order;
import com.illishop.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }
}
