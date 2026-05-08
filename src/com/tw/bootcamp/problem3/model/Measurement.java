package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;
import com.tw.bootcamp.problem3.units.Unit;

public class Measurement<T extends Unit> {
    private final double quantity;
    private final T unit;

    Measurement(double quantity, T unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static <T extends Unit> Measurement create(double quantity, T unit) throws InvalidNumberOfUnitsException {
        if (quantity <= 0) throw new InvalidNumberOfUnitsException();
        return new Measurement<>(quantity, unit);
    }

    public double getStandardValue(Measurement volume) {
        return volume.unit.convertToStandardUnit(volume.quantity);
    }
}
