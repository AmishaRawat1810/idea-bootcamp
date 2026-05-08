package com.tw.bootcamp.problem3.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemparatureUnitTest {
    @Test
    void shouldConvert212FToF() {
        double value = TemparatureUnit.F.convertToStandardUnit(212);
        assertEquals(212, value);
    }

    @Test
    void shouldConvert100CTo1F() {
        double value = TemparatureUnit.C.convertToStandardUnit(100);
        assertEquals(212, value);
    }
}