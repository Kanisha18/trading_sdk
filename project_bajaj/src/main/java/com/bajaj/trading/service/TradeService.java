package com.bajaj.trading.service;

import com.bajaj.trading.model.Trade;
import com.bajaj.trading.repository.TradeRepository;
import java.util.List;

public class TradeService {
    public List<Trade> getTrades() {
        return TradeRepository.trades;
    }
}
