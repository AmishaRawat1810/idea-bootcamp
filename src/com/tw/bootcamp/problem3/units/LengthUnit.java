package com.tw.bootcamp.problem3.units;

public enum LengthUnit {
    MM(0.039),
    CM(0.39),
    FT(12.0),
    IN(1.0);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToStandardUnit(double length) {
        return this.conversionFactor * length;
    }

}
