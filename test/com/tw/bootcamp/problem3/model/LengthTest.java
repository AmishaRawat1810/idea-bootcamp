package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompare10MMAnd1CMAndReturnTrue() throws InvalidNumberOfUnitsException {
        Length tenMm = Length.create(10.0, LengthUnit.MM);
        Length oneCm = Length.create(1.0, LengthUnit.CM);
        assertTrue(tenMm.equals(oneCm));
    }

    @Test
    void shouldReturnFalseForEqualityCheckOf2FeetAnd12Inches() throws InvalidNumberOfUnitsException {
        Length twoFeet = Length.create(2.0, LengthUnit.FT);
        Length twelveInches = Length.create(12.0, LengthUnit.IN);
        boolean isEqual = twoFeet.equals(twelveInches);
        assertFalse(isEqual);
    }

    @Test
    void shouldReturnTrueForEqualityCheckOf1FeetAnd12Inches() throws InvalidNumberOfUnitsException {
        Length oneFeet = Length.create(1.0, LengthUnit.FT);
        Length twelveInches = Length.create(12.0, LengthUnit.IN);
        boolean isEqual = oneFeet.equals(twelveInches);
        assertTrue(isEqual);
    }

    @Test
    void shouldReturnFalseForEqualityCheckOf5CmAnd2Inches() throws InvalidNumberOfUnitsException {
        Length fiveCentimeter = Length.create(5.0, LengthUnit.CM);
        Length twoInches = Length.create(2.0, LengthUnit.IN);
        boolean isEqual = twoInches.equals(fiveCentimeter);
        assertFalse(isEqual);
    }

    @Test
    void shouldReturnTrueForEqualityCheckOf1CmAnd10mm() throws InvalidNumberOfUnitsException {
        Length oneCentimeter = Length.create(1.0, LengthUnit.CM);
        Length tenMillimeter = Length.create(10.0, LengthUnit.MM);
        boolean isEqual = tenMillimeter.equals(oneCentimeter);
        assertTrue(isEqual);
    }

    @Test
    void shouldThrowErrorForInvalidLength() {
        assertThrows(InvalidNumberOfUnitsException.class,
                () -> Length.create(-1.0,
                        LengthUnit.MM));
    }
}