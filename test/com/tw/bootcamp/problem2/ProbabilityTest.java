package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {

    @Test
    void shouldGetChancesOfTailWhenFlipOneACoin() throws ImpossibleProbabilityError {
        Probability probabilityOfGettingTail = Probability.create(0.50);
        assertEquals(Probability.create(0.50), probabilityOfGettingTail);
    }

    @Test
    void shouldGetChancesOfNotTailWhenFlipOneACoin() throws ImpossibleProbabilityError {
        Probability probability = Probability.create(0.50);
        Probability notGettingChances = probability.not();
        assertEquals(Probability.create(0.50), notGettingChances);
    }

    @Test
    void shouldGetChancesOfTailWhenFlipTwoCoins() throws ImpossibleProbabilityError {
        Probability probabilityOfGettingTails = Probability.create(0.50);
        Probability probabilityOfGettingBothTails =
                probabilityOfGettingTails.and(probabilityOfGettingTails);
        assertEquals(Probability.create(0.25), probabilityOfGettingBothTails);
    }

    @Test
    void shouldGetChancesOfGettingAtLeast1TailWhenFlipTwoCoins() throws ImpossibleProbabilityError {
        Probability probabilityOfGettingTail = Probability.create(0.50);
        Probability chancesOfGettingAtLeastOneTail =
                probabilityOfGettingTail.or(probabilityOfGettingTail);
        assertEquals(Probability.create(0.75), chancesOfGettingAtLeastOneTail);
    }

    @Test
    void shouldThrowException() {
        assertThrows(ImpossibleProbabilityError.class,
                () -> Probability.create(-1));
    }
}