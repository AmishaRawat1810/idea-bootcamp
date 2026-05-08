package com.tw.bootcamp.problem3;

public class MeasurementUnits {

    private final double units;
    private final double conversionFactorInCm;

    private MeasurementUnits(double units, double conversionFactorInCm) {
        this.units = units;
        this.conversionFactorInCm = conversionFactorInCm;
    }

    public static MeasurementUnits create(double units, double conversionFactorInCm) {
        return new MeasurementUnits(units, conversionFactorInCm);
    }

    public Boolean compare(MeasurementUnits otherUnits) {
        return this.convertToCm() == otherUnits.convertToCm();
    }

    private double convertToCm() {
        return this.units * this.conversionFactorInCm;
    }


}
