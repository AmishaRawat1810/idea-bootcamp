package com.tw.bootcamp.problem2;

public class Chance {

    public static double getTailOnACoin() {
        return 0.5;
    }

    public static double notGettingTailsOnACoin() {
        return 1 - getTailOnACoin();
    }
}
