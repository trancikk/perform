package com.myown;

public class Juggler implements Performer {
    private int beanBugs = 3;

    public Juggler() {
    }

    public Juggler(int beanBugs) {
        this.beanBugs = beanBugs;
    }

    public void perform() throws PerformanceException {
        System.out.println("\n Juggling " + beanBugs + " bugs \n");
    }
}
