package com.tw.bootcamp.problem3.units;

public enum VolumeUnit {
    L(1.0), GAL(3.78);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToStandardUnit(double length) {
        return this.conversionFactor * length;
    }

}
