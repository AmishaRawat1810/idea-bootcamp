package com.tw.bootcamp.problem5.model;

import com.tw.bootcamp.problem5.exception.LimitExceededException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAdd1ball() {
        Bag bag = new Bag();
        assertTrue(bag.add(new Ball(Colors.YELLOW)));
    }

    @Test
    void shouldNotAddBallAfterReachingLimit() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.add(new Ball(Colors.RED));
        }
        assertThrows(LimitExceededException.class, () -> bag.add(new Ball(Colors.YELLOW)));
    }

    @Test
    void shouldDisplaySummary() {
        Bag bag = new Bag();
        bag.add(new Ball(Colors.YELLOW));
        String summary = bag.summary();
        String expected = """
                YELLOW: 1
                
                Total: 1""";
        assertEquals(expected, summary);
    }
}
