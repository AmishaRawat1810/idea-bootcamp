package com.tw.bootcamp.problem5.model;

public class Ball {

    private final Colors color;

    public Ball(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball color is " + color;
    }

    public Colors getColor() {
        return this.color;
    }
}
