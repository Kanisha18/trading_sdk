package com.bajaj.trading.repository;

import com.bajaj.trading.model.Instrument;
import java.util.*;

public class InstrumentRepository {
    public static List<Instrument> instruments = new ArrayList<>();

    static {
        Instrument i1 = new Instrument();
        i1.symbol = "TCS";
        i1.exchange = "NSE";
        i1.instrumentType = "EQUITY";
        i1.lastTradedPrice = 3800;

        Instrument i2 = new Instrument();
        i2.symbol = "INFY";
        i2.exchange = "NSE";
        i2.instrumentType = "EQUITY";
        i2.lastTradedPrice = 1500;

        instruments.add(i1);
        instruments.add(i2);
    }
}
