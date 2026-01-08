package com.bajaj.trading.controller;

import com.bajaj.trading.service.InstrumentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/instruments")
public class InstrumentController {

    InstrumentService service = new InstrumentService();

    @GetMapping
    public Object getAll() {
        return service.getAll();
    }
}
