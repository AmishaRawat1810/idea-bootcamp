package com.tw.bootcamp.problem5;

import com.tw.bootcamp.problem5.exception.LimitExceededException;
import com.tw.bootcamp.problem5.model.Bag;
import com.tw.bootcamp.problem5.model.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BagTest {
    @Test
    void shouldAdd1ball() {
        Bag bag = new Bag();
        assertTrue(bag.add(new Ball()));
    }

    @Test
    void shouldNotAddBallAfterReachingLimit() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.add(new Ball());
        }
        assertThrows(LimitExceededException.class, () -> bag.add(new Ball()));
    }
}