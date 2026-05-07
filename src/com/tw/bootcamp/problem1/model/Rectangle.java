package com.tw.bootcamp.problem1.model;

public class Rectangle implements Shapes {

    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}
