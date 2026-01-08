package com.bajaj.trading.service;

import com.bajaj.trading.model.PortfolioPosition;
import com.bajaj.trading.repository.PortfolioRepository;
import java.util.Collection;

public class PortfolioService {
    public Collection<PortfolioPosition> getHoldings() {
        return PortfolioRepository.holdings.values();
    }
}
