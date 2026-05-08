package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.VolumeUnit;

import java.util.Objects;

public class Volume {

    private final double quantity;
    private final VolumeUnit unit;

    private Volume(double quantity, VolumeUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static Volume create(double quantity, VolumeUnit unit) throws InvalidNumberOfUnitsException {
        if (quantity <= 0) throw new InvalidNumberOfUnitsException();
        return new Volume(quantity, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        double volumeOfThis = this.unit.convertToStandardUnit(this.quantity);
        double volumeOfOther =
                volume.unit.convertToStandardUnit(volume.quantity);

        return volumeOfThis == volumeOfOther;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }
}
