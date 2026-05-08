package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.Unit;

import java.util.Objects;

public class Measurement<T extends Unit> {

    private final double quantity;
    private final T unit;

    private Measurement(double quantity, T unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static <T extends Unit> Measurement create(double quantity, T unit) throws InvalidNumberOfUnitsException {
        if (quantity <= 0) throw new InvalidNumberOfUnitsException();
        return new Measurement<T>(quantity, unit);
    }

    private double getGeneric(Measurement volume) {
        return volume.unit.convertToStandardUnit(volume.quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Measurement other = (Measurement) obj;

        return getGeneric(this) == getGeneric(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }

    public <T extends Unit> Measurement add(Measurement other, T stdUnit) {
        double volumeOfThis = getGeneric(this);
        double volumeOfOther = getGeneric(other);

        double volumeSum = volumeOfOther + volumeOfThis;
        return new Measurement(Math.round(volumeSum * 100.0) / 100.0, stdUnit);
    }
}
