package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.units.TemparatureUnit;

import java.util.Objects;

public class Temperature {

    private final double degrees;
    private final TemparatureUnit unit;

    private Temperature(double degrees, TemparatureUnit unit) {
        this.degrees = degrees;
        this.unit = unit;
    }

    public static Temperature create(double quantity, TemparatureUnit unit) {
        return new Temperature(quantity, unit);
    }

    private double getDegrees(Temperature temperature) {
        return temperature.unit.convertToStandardUnit(temperature.degrees);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Temperature other = (Temperature) obj;

        return getDegrees(this) == getDegrees(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(degrees, unit);
    }
}
