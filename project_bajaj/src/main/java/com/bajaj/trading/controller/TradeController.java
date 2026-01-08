package com.bajaj.trading.controller;

import com.bajaj.trading.service.TradeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trades")
public class TradeController {

    TradeService service = new TradeService();

    @GetMapping
    public Object trades() {
        return service.getTrades();
    }
}
