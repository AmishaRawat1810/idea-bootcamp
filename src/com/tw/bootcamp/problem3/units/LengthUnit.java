package com.tw.bootcamp.problem3.units;

public enum LengthUnit {
    MM(0.1),
    CM(1.0),
    FT(30.48),
    IN(2.54);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToStandardUnit(double length) {
        return this.conversionFactor * length;
    }

}
