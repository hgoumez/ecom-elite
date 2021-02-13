package com.illishop.order.controller;

import com.illishop.order.model.Order;
import com.illishop.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@Slf4j
public class OrderController {


    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/server-name")
    public String getServerName() {
        return System.getenv("server_name");
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }


    @PostConstruct
    public void generateError() {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            log.error("division par 0 interdite selon le maestro du Milan AC", e);
        }
    }
}
