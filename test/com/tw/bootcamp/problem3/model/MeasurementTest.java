package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    void shouldReturnTrueForEqualityCheckOf1FeetAnd12Inches() throws InvalidLengthException {
        Measurement oneFeet = Measurement.create(1.0, Unit.FT);
        Measurement twelveInches = Measurement.create(12.0, Unit.IN);
        Boolean isEqual = oneFeet.compare(twelveInches);
        assertTrue(isEqual);
    }


    @Test
    void shouldReturnFalseForEqualityCheckOf2FeetAnd12Inches() throws InvalidLengthException {
        Measurement twoFeet = Measurement.create(2.0, Unit.FT);
        Measurement twelveInches = Measurement.create(12.0, Unit.IN);
        Boolean isEqual = twoFeet.compare(twelveInches);
        assertFalse(isEqual);
    }


    @Test
    void shouldReturnFalseForEqualityCheckOf5CmAnd2Inches() throws InvalidLengthException {
        Measurement fiveCentimeter = Measurement.create(5.0, Unit.CM);
        Measurement twoInches = Measurement.create(2.0, Unit.IN);
        Boolean isEqual = twoInches.compare(fiveCentimeter);
        assertFalse(isEqual);
    }

    @Test
    void shouldReturnTrueForEqualityCheckOf1CmAnd10mm() throws InvalidLengthException {
        Measurement oneCentimeter = Measurement.create(1.0, Unit.CM);
        Measurement tenMillimeter = Measurement.create(10.0, Unit.MM);
        Boolean isEqual = tenMillimeter.compare(oneCentimeter);
        assertTrue(isEqual);
    }

    @Test
    void shouldThrowErrorForInvalidLength() {
        assertThrows(InvalidLengthException.class, () -> Measurement.create(-1.0,
                Unit.MM));
    }
}