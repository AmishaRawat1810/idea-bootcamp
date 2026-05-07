package com.tw.bootcamp.problem1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    Rectangle rectangle;
    Rectangle square;

    @BeforeEach
    void setup() {
        rectangle = Rectangle.createRectangle(5, 4);
        square = Rectangle.createSquare(4);
    }

    @Test
    void shouldCalculateAreaOfRectangle() {
        double area = rectangle.calculateArea();
        assertEquals(20, area);
    }

    @Test
    void shouldCalculatePerimeter() {
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(18, perimeter);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        double perimeter = square.calculatePerimeter();
        assertEquals(16, perimeter);
    }

    @Test
    void shouldCalculateAreaOfSquare() {
        double area = square.calculateArea();
        assertEquals(16, area);
    }
}