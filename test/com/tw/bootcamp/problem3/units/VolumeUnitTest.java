package com.tw.bootcamp.problem3.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VolumeUnitTest {
    @Test
    void shouldConvertLToStandard() {
        double literToStandardUnit = VolumeUnit.L.convertToStandardUnit(1);
        assertEquals(1, literToStandardUnit);
    }

    @Test
    void shouldConvertGalToStandard() {
        double galToStandardUnit = VolumeUnit.GAL.convertToStandardUnit(1);
        assertEquals(3.78, galToStandardUnit);
    }
}