package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeasurementTest {

    @Test
    void shouldReturnTrueForEqualityCheckOf1FeetAnd12Inches() {
        Measurement oneFeet = Measurement.create(1.0, Unit.FT);
        Measurement twelveInches = Measurement.create(12.0, Unit.IN);
        Boolean isEqual = oneFeet.compare(twelveInches);
        assertTrue(isEqual);
    }


    @Test
    void shouldReturnFalseForEqualityCheckOf2FeetAnd12Inches() {
        Measurement twoFeet = Measurement.create(2.0, Unit.FT);
        Measurement twelveInches = Measurement.create(12.0, Unit.IN);
        Boolean isEqual = twoFeet.compare(twelveInches);
        assertFalse(isEqual);
    }


    @Test
    void shouldReturnFalseForEqualityCheckOf5CmAnd2Inches() {
        Measurement fiveCentimeter = Measurement.create(5.0, Unit.CM);
        Measurement twoInches = Measurement.create(2.0, Unit.IN);
        Boolean isEqual = twoInches.compare(fiveCentimeter);
        assertFalse(isEqual);
    }

}