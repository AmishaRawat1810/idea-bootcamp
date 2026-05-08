package com.tw.bootcamp.problem3.units;

public enum TemparatureUnit implements Unit {
    F {
        @Override
        public double convertToStandardUnit(double degrees) {
            return degrees;
        }
    }, C {
        @Override
        public double convertToStandardUnit(double degrees) {
            return (degrees * (9.0 / 5.0) + 32);
        }
    };

    public abstract double convertToStandardUnit(double degrees);
}
