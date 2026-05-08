package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidLengthException;

import java.util.Objects;

public class Measurement {

    private final double length;
    private final Unit unit;

    private Measurement(double length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public static Measurement create(double length, Unit unit) throws InvalidLengthException {
        if (length <= 0) throw new InvalidLengthException();

        return new Measurement(length, unit);
    }

    public Boolean compare(Measurement other) {
        double thisBaseValue = this.unit.convertToBase(this.length);
        double otherBaseValue = other.unit.convertToBase(other.length);

        return thisBaseValue == otherBaseValue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return Double.compare(length, that.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }
}
