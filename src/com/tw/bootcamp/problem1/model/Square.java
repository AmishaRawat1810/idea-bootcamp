package com.tw.bootcamp.problem1.model;

public class Square implements Shapes {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public int calculatePerimeter() {
        return 4 * side;
    }
}
