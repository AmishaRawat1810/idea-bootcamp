package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {

    private final double probability;

    private Chance(double value) {
        this.probability = value;
    }

    public static Chance create(double probability) {
        if (probability > 1.0 || probability < 0.0)
            throw new InvalidProbability(
                    "Error: Invalid Probability");

        return new Chance(probability);
    }

    public Chance gettingChances() {
        return this;
    }

    public Chance notGettingChances() {
        return create(1 - probability);
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(probability, chance.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }
}
