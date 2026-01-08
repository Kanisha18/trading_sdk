package com.bajaj.trading.controller;

import com.bajaj.trading.model.Order;
import com.bajaj.trading.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    OrderService service = new OrderService();

    @PostMapping
    public Order place(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    @GetMapping("/{orderId}")
    public Order status(@PathVariable String orderId) {
        return service.getOrder(orderId);
    }
}
