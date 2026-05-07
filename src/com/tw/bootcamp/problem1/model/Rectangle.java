package com.tw.bootcamp.problem1.model;

public class Rectangle implements Polygon {

    private final double width;
    private final double length;

    private Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public static Rectangle createRectangle(double width, double length) {
        return new Rectangle(width, length);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side, side);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
