package com.tw.bootcamp.problem4;

public class ParkingLot {
    private final int parkingLotSize;
    private int occupiedParkingSpots = 0;

    private ParkingLot(int parkingLotSize) {
        this.parkingLotSize = parkingLotSize;
    }

    public static ParkingLot create(int parkingLotSize) {
        return new ParkingLot(parkingLotSize);
    }

    public boolean park() {
        if (occupiedParkingSpots == parkingLotSize) return false;
        occupiedParkingSpots += 1;
        return true;
    }
}
