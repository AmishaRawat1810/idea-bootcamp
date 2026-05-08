package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class VolumeTest {
    @Test
    void shouldReturnTrueForComparisonOf1GalAnd3_78L() throws InvalidNumberOfUnitsException {
        Volume oneGal = Volume.create(1, VolumeUnit.GAL);
        Volume around4Litres = Volume.create(3.78, VolumeUnit.L);

        assertTrue(oneGal.equals(around4Litres));
    }
}