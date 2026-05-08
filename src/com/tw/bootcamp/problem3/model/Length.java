package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.LengthUnit;

import java.util.Objects;

public class Length {
    private final double quantity;
    private final LengthUnit unit;

    private Length(double quantity, LengthUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static Length create(double quantity, LengthUnit unit) throws InvalidNumberOfUnitsException {
        if (quantity <= 0) throw new InvalidNumberOfUnitsException();
        return new Length(quantity, unit);
    }

    private double getLength(Length length) {
        return length.unit.convertToStandardUnit(length.quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Length other = (Length) obj;

        return getLength(this) == getLength(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }

    public Length add(Length other) {
        double lengthOfThis = getLength(this);
        double lengthOfOther = getLength(other);

        int lengthSum = (int) Math.ceil(lengthOfOther + lengthOfThis);
        return new Length(lengthSum, LengthUnit.IN);
    }
}
