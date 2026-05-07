package com.tw.bootcamp.problem1.model;

public class Rectangle implements Polygon {

    private final int width;
    private final int length;

    private Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public static Rectangle createRectangle(int width, int length) {
        return new Rectangle(width, length);
    }

    public static Rectangle createSquare(int side) {
        return createRectangle(side, side);
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
