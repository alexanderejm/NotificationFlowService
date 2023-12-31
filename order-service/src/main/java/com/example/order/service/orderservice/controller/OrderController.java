package com.example.order.service.orderservice.controller;

import com.example.order.service.orderservice.model.Order;
import com.example.order.service.orderservice.service.OrderService;
import com.example.order.service.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order orderDetails) {
        // Additional validation and processing logic can be added here
        orderService.placeOrder(orderDetails);
        return ResponseEntity.ok("Order placed successfully.");
    }
}