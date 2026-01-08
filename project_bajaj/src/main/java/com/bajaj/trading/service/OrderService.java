package com.bajaj.trading.service;

import com.bajaj.trading.model.*;
import com.bajaj.trading.repository.*;

public class OrderService {

    public Order placeOrder(Order order) {
        if (order.quantity <= 0)
            throw new RuntimeException("Quantity must be > 0");

        order.status = "PLACED";
        OrderRepository.orders.put(order.orderId, order);

        // Immediate execution
        order.status = "EXECUTED";

        Trade trade = new Trade();
        trade.tradeId = order.orderId;
        trade.orderId = order.orderId;
        trade.symbol = order.symbol;
        trade.quantity = order.quantity;
        trade.price = order.price;

        TradeRepository.trades.add(trade);

        // Update portfolio
        PortfolioPosition holding =
                PortfolioRepository.holdings.getOrDefault(order.symbol, new PortfolioPosition());

        holding.symbol = order.symbol;
        holding.quantity += order.quantity;
        holding.averagePrice = order.price;
        holding.currentValue = holding.quantity * order.price;

        PortfolioRepository.holdings.put(order.symbol, holding);

        return order;
    }

    public Order getOrder(String orderId) {
        return OrderRepository.orders.get(orderId);
    }
}