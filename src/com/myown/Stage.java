package com.myown;

public class Stage {
    private static Stage ourInstance = new Stage();

    public static Stage getInstance() {
        return SigletonStageHolder.stage;
    }

    private Stage() {
    }

    private static class SigletonStageHolder{
        static Stage stage = new Stage();
    }
}
