package com.bajaj.trading.model;

import java.util.UUID;

public class Order {
    public String orderId = UUID.randomUUID().toString();
    public String symbol;
    public String side; // BUY / SELL
    public String orderType; // MARKET / LIMIT
    public int quantity;
    public double price;
    public String status; // NEW, PLACED, EXECUTED, CANCELLED
}
