package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

    @Test
    void shouldGetChanceOfGettingTailsOnACoin() {
        assertEquals(0.5, Chance.getTailOnACoin());
    }

    @Test
    void shouldGetChanceOfNotGettingTailsOnACoin() {
        assertEquals(0.5, Chance.notGettingTailsOnACoin());
    }

}