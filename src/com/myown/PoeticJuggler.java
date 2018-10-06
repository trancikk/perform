package com.myown;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }
    public  PoeticJuggler(int beanBugs, Poem poem){
        super(beanBugs);
        this.poem = poem;

    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("\n While reciting.. \n");
        poem.recite();
    }
}
