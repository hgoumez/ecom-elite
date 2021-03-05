package com.illishop.order.controller;

import com.illishop.order.OrderWithHostName;
import com.illishop.order.model.Order;
import com.illishop.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@Slf4j
public class OrderController {


    @Value("${version}")
    String version;

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/server-name")
    public String getServerName() {
        return System.getenv("server_name");
    }

    @GetMapping("/orders")
    public OrderWithHostName getAllOrders() {
        List<Order> orders = service.getAllOrders();
        return OrderWithHostName.builder()
                .orderList(orders)
                .hostName(System.getenv("HOSTNAME"))
                .build();
    }


    @GetMapping("/version")
    public String getAppVersion() {
        return version;
    }


    @PostConstruct
    public void generateError() throws InterruptedException {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            log.error("division par 0 interdite selon le maestro du Milan AC", e);
        }
    }
}
