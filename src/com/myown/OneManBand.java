package com.myown;

import java.util.Collection;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (Instrument instrument: instruments
             ) {
            instrument.play();
        }

    }
    private Collection<Instrument> instruments;

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
