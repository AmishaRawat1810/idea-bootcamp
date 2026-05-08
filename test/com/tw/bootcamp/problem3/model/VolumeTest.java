package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldReturnTrueForComparisonOf1GalAnd3_78L() throws InvalidNumberOfUnitsException {
        Volume oneGal = Volume.create(1, VolumeUnit.GAL);
        Volume around4Litres = Volume.create(3.78, VolumeUnit.L);

        assertEquals(oneGal, around4Litres);
    }

    @Test
    void shouldReturnFalseForComparisonOf1GalAnd3L() throws InvalidNumberOfUnitsException {
        Volume oneGal = Volume.create(1, VolumeUnit.GAL);
        Volume threeLitres = Volume.create(3, VolumeUnit.L);

        assertFalse(oneGal.equals(threeLitres));
    }

    @Test
    void shouldThrowError() {
        assertThrows(InvalidNumberOfUnitsException.class,
                () -> Volume.create(-1,
                        VolumeUnit.GAL));
    }

    @Test
    void shouldAdd1GallonAnd1LitreAndReturnAround5Litres() throws InvalidNumberOfUnitsException {
        Volume oneGal = Volume.create(1.0, VolumeUnit.GAL);
        Volume oneLitre = Volume.create(1.0, VolumeUnit.L);
        Volume volumeSum = oneGal.add(oneLitre);

        assertEquals(Volume.create(4.78, VolumeUnit.L), volumeSum);
    }

}