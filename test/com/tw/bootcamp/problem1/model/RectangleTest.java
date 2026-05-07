package com.tw.bootcamp.problem1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setup() {
        rectangle = new Rectangle(5, 4);
    }

    @Test
    void shouldCalculateAreaOfRectangle() {
        int area = rectangle.calculateArea();
        assertEquals(20, area);
    }

    @Test
    void shouldCalculatePerimeter() {
        int perimeter = rectangle.calculatePerimeter();
        assertEquals(18, perimeter);
    }
}