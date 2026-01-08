package com.bajaj.trading.controller;

import com.bajaj.trading.service.PortfolioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/portfolio")
public class PortfolioController {

    PortfolioService service = new PortfolioService();

    @GetMapping
    public Object portfolio() {
        return service.getHoldings();
    }
}
