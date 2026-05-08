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

    private double getVolume(Volume volume) {
        return volume.unit.convertToStandardUnit(volume.quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Volume other = (Volume) obj;

        return getVolume(this) == getVolume(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }

    public Volume add(Volume other) {
        double volumeOfThis = getVolume(this);
        double volumeOfOther = getVolume(other);

        double volumeSum = volumeOfOther + volumeOfThis;
        return new Volume(Math.round(volumeSum * 100.0) / 100.0, VolumeUnit.L);
    }
}
