package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

    @Test
    void shouldGetChancesOfTailWhenFlipOneACoin() {
        Chance chance = new Chance(50.0);
        double tailChance = chance.getProbability();
        assertEquals(50.0, tailChance);
    }

    @Test
    void shouldGetChancesOfNotTailWhenFlipOneACoin() {
        Chance chance = new Chance(50.0);
        double notTailChance = chance.getProbability();
        assertEquals(50.0, notTailChance);
    }
}