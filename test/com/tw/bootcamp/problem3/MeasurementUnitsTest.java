package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MeasurementUnitsTest {
    
    @Test
    void shouldReturnTrueForEqualityCheckOf1FeetAnd12Inches() {
        MeasurementUnits feet = MeasurementUnits.create(1.0, 30.48);
        MeasurementUnits inches = MeasurementUnits.create(12.0, 2.54);
        Boolean isEqual = feet.compare(inches);
        assertTrue(isEqual);
    }
}