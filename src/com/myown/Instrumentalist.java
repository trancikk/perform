package com.myown;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("\n Playing song: " + song + "\n");
        instrument.play();
    }
    private String song;
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;

    }

    public void setSong(String song) {
        this.song = song;
    }
}
