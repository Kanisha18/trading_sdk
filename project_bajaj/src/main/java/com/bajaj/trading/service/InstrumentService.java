package com.bajaj.trading.service;

import com.bajaj.trading.model.Instrument;
import com.bajaj.trading.repository.InstrumentRepository;
import java.util.List;

public class InstrumentService {
    public List<Instrument> getAll() {
        return InstrumentRepository.instruments;
    }
}
