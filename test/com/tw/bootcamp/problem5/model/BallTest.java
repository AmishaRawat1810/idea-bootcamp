package com.tw.bootcamp.problem5.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallTest {
    @Test
    void shouldCreateColorfulBalls() {
        Ball greenBall = new Ball(Colors.GREEN);
        String greenBallString = greenBall.toString();
        assertEquals("Ball color is GREEN", greenBallString);
    }
}