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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        double lengthOfThis = this.unit.convertToStandardUnit(this.quantity);
        double lengthOfOther = length.unit.convertToStandardUnit(length.quantity);

        return lengthOfThis == lengthOfOther;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }

    public Length add(Length other) throws InvalidNumberOfUnitsException {
        double lengthOfThis = this.unit.convertToStandardUnit(this.quantity);
        double lengthOfOther = other.unit.convertToStandardUnit(other.quantity);
        int lengthSum = (int) Math.ceil(lengthOfOther + lengthOfThis);
        return Length.create(lengthSum, LengthUnit.IN);
    }
}
