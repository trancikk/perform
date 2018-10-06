package com.myown;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Component("audience")
public class Audience {

    public void takeSeats(){
        System.out.println("Take seats \n");
    }

    public void turnOffCells(){
        System.out.println("Cells turn off \n");
    }

    public void applaud(){}{
        System.out.println("CLAP CLAP \n");
    }

    public void demandReturn(){
        System.out.println("Give my money back \n");
    }
}
