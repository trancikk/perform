package com.myown;

public class Illusionist implements Performer {
    private MagicBox magicBox;
    String magicWords;

    public MagicBox getMagicBox() {
        return magicBox;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public String getMagicWords() {

        return magicWords;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public Illusionist() {
    }

    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("\n There is " + magicBox.getContent() + " in the box! \n");
    }
}
