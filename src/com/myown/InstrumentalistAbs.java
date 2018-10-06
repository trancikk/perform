package com.myown;

public abstract class InstrumentalistAbs  implements Performer{

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument();
    public InstrumentalistAbs() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Plating song" + song);
        getInstrument().play();
    }
}
