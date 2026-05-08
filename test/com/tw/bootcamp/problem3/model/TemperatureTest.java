package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.units.TemparatureUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {
    @Test
    void shouldReturnTrueFor212FEqualsTo100C() {
        Temperature temperatureInF = Temperature.create(212, TemparatureUnit.F);
        Temperature temperatureInC = Temperature.create(100, TemparatureUnit.C);

        assertEquals(temperatureInF, temperatureInC);
    }
}