package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Probability {

    private final double probability;

    private Probability(double value) {
        this.probability = value;
    }

    public static Probability create(double probability) throws ImpossibleProbabilityError {
        if (probability > 1.0 || probability < 0.0)
            throw new ImpossibleProbabilityError();

        return new Probability(probability);
    }

    public Probability or(Probability other) throws ImpossibleProbabilityError {
        double probability =
                this.probability + other.probability - (this.probability * other.probability);
        return create(probability);
    }

    public Probability not() throws ImpossibleProbabilityError {
        return create(1 - probability);
    }

    public Probability and(Probability other) throws ImpossibleProbabilityError {
        return create(this.probability * other.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability probability = (Probability) o;
        return Double.compare(this.probability, probability.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

}
