package com.tw.bootcamp.problem4;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<String> parkingSlots;
    private final int occupiedSlots;

    private ParkingLot(int parkingLotSize) {
        parkingSlots = new ArrayList<>(parkingLotSize);
        occupiedSlots = parkingLotSize;
    }

    public static ParkingLot create(int parkingLotSize) {
        return new ParkingLot(parkingLotSize);
    }

    public boolean park(String vehicleToPark) {
        if (isFull()) return false;

        parkingSlots.add(vehicleToPark);
        return true;
    }

    public boolean isFull() {
        return parkingSlots.size() == occupiedSlots;
    }
}
