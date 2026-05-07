package com.tw.bootcamp.problem1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    Square square;

    @BeforeEach
    void setup() {
        square = new Square(5);
    }

    @Test
    void shouldCalculateAreaOfSquare() {
        int area = square.calculateArea();

        assertEquals(25, area);
    }
    
    @Test
    void shouldCalculatePerimeterOfSquare() {
        int perimeter = square.calculatePerimeter();
        assertEquals(20, perimeter);
    }
}