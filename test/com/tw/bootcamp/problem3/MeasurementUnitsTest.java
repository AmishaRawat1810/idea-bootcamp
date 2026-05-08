package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeasurementUnitsTest {

    @Test
    void shouldReturnTrueForEqualityCheckOf1FeetAnd12Inches() {
        MeasurementUnits oneFeet = MeasurementUnits.create(1.0, 30.48);
        MeasurementUnits twelveInches = MeasurementUnits.create(12.0, 2.54);
        Boolean isEqual = oneFeet.compare(twelveInches);
        assertTrue(isEqual);
    }


    @Test
    void shouldReturnFalseForEqualityCheckOf2FeetAnd12Inches() {
        MeasurementUnits twoFeet = MeasurementUnits.create(2.0, 30.48);
        MeasurementUnits twelveInches = MeasurementUnits.create(12.0, 2.54);
        Boolean isEqual = twoFeet.compare(twelveInches);
        assertFalse(isEqual);
    }


    @Test
    void shouldReturnFalseForEqualityCheckOf5CmAnd2Inches() {
        MeasurementUnits fiveCentimeter = MeasurementUnits.create(5.0, 1.0);
        MeasurementUnits twoInches = MeasurementUnits.create(2.0, 2.54);
        Boolean isEqual = twoInches.compare(fiveCentimeter);
        assertFalse(isEqual);
    }


}