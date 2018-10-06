package com.myown;

public class Coconut {
    Lime lime;

    public void setLime(Lime lime) {
        this.lime = lime;
    }

    public void drinkBoth(){
        System.out.println("drinking cocnut \n");
        lime.drink();

    }


}
