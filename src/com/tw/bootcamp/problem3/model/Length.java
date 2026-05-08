package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.LengthUnit;

public class Length extends Measurement<LengthUnit> implements Addable<Length> {

    private Length(double quantity, LengthUnit unit) {
        super(quantity, unit);
    }

    public static Length create(double quantity, LengthUnit unit) throws InvalidNumberOfUnitsException {
        if (quantity <= 0) throw new InvalidNumberOfUnitsException();
        return new Length(quantity, unit);
    }

    @Override
    public Length add(Length other) throws InvalidNumberOfUnitsException {
        double lengthOfThis = getStandardValue(this);
        double lengthOfOther = getStandardValue(other);

        int lengthSum = (int) Math.ceil(lengthOfOther + lengthOfThis);
        return Length.create(lengthSum, LengthUnit.IN);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Length other = (Length) obj;

        return getStandardValue(this) == getStandardValue(other);
    }
}
