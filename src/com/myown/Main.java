package com.myown;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Performer performer = (Performer) applicationContext.getBean("duke");
        Performer kenny = (Performer) applicationContext.getBean("kenny");
        Performer jonny = (Performer) applicationContext.getBean("john");
        Performer hank = (Performer) applicationContext.getBean("hank");
        Performer carl = (Performer) applicationContext.getBean("carl");
        Performer ben = (Performer) applicationContext.getBean("ben");
        Performer cool = (Performer) applicationContext.getBean("cool");
        Performer kik = (Performer) applicationContext.getBean("kik");
        Performer henry = (Performer) applicationContext.getBean("henry");
        Performer stevie = (Performer) applicationContext.getBean("steve");
        Instrumentalist jo = new Instrumentalist();
        Coconut coconut = (Coconut) applicationContext.getBean("coconut");

        try {
            performer.perform();
            kenny.perform();
            jonny.perform();
            hank.perform();
            carl.perform();
            cool.perform();
            ben.perform();
            kik.perform();
            henry.perform();
            stevie.perform();
            jo.perform();
            coconut.drinkBoth();
        } catch (PerformanceException performanceException){
            performanceException.printStackTrace();
        }

    }
}
