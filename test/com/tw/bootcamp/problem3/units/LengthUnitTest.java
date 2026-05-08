package com.tw.bootcamp.problem3.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthUnitTest {
    @Test
    void shouldConvertMMToStandard() {
        double mmToStandardUnit = LengthUnit.MM.convertToStandardUnit(1);
        assertEquals(0.039, mmToStandardUnit);
    }

    @Test
    void shouldConvertCMToStandard() {
        double cmToStandardUnit = LengthUnit.CM.convertToStandardUnit(1);
        assertEquals(0.39, cmToStandardUnit);
    }

    @Test
    void shouldConvertFTToStandard() {
        double cmToStandardUnit = LengthUnit.FT.convertToStandardUnit(1);
        assertEquals(12, cmToStandardUnit);
    }
    
    @Test
    void shouldConvertInToStandard() {
        double cmToStandardUnit = LengthUnit.IN.convertToStandardUnit(1);
        assertEquals(1, cmToStandardUnit);
    }
}