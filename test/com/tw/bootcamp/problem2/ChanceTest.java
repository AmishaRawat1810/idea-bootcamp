package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {

    @Test
    void shouldGetChancesOfTailWhenFlipOneACoin() {
        Chance chance = Chance.create(0.50);
        Chance gettingChances = chance.gettingChances();
        assertEquals(chance, gettingChances);
    }

    @Test
    void shouldGetChancesOfNotTailWhenFlipOneACoin() {
        Chance chance = Chance.create(0.50);
        Chance notGettingChances = chance.notGettingChances();
        assertEquals(Chance.create(0.50), notGettingChances);
    }

    @Test
    void shouldGetChancesOfTailWhenFlipTwoCoins() {
        Chance chance = Chance.create(0.75);
        Chance gettingChances = chance.gettingChances();
        assertEquals(chance, gettingChances);
    }

    @Test
    void shouldGetChancesOfGettingAtLeast1TailWhenFlipTwoCoins() {
        double gettingTailInOneCoin = 0.50;
        Chance chance = Chance.create(gettingTailInOneCoin);
        Chance gettingChances = chance.gettingChances(chance);
        assertEquals(Chance.create(0.75), gettingChances);
    }

    @Test
    void shouldThrowException() {
        assertThrows(InvalidProbability.class,
                () -> Chance.create(-1));
    }
}