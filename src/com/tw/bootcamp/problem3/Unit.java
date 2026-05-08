package com.tw.bootcamp.problem3;

public enum Unit {
    CM(1.0),
    FT(30.48),
    IN(2.54);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double length) {
        return this.conversionFactor * length;
    }

}
