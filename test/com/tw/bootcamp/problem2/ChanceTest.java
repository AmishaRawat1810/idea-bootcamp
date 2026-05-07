package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

    @Test
    void shouldGetChancesOfTailWhenFlipOneACoin() {
        Chance chance = new Chance();
        int tailChance = chance.getChance(0.5);
        assertEquals(50, tailChance);
    }

    @Test
    void shouldGetChancesOfNotTailWhenFlipOneACoin() {
        Chance chance = new Chance();
        int notTailChance = chance.getChance(0.5);
        assertEquals(50, notTailChance);
    }
}