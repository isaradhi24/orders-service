package com.example.orders_service;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @GetMapping("/orders")
    public Map<String, String> getOrders() {
        return Map.of(
            "service", "orders-service",
            "message", "Orders API is running",
            "version", "v1"
        );
    }
}
