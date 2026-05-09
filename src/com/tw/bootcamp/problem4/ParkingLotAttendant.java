package com.tw.bootcamp.problem4;

import java.util.HashMap;

public class ParkingLotAttendant {
    private final HashMap<String, ParkingLot> parkingLots;

    ParkingLotAttendant() {
        parkingLots = new HashMap<>();
    }

    public String addParkingLot(int size) {
        if (size <= 0)
            throw new IllegalArgument("Error: Cannot add a parking " +
                    "lot of given size");

        ParkingLot parkingLot = ParkingLot.create(size);
        String lotId = "P" + (parkingLots.size() + 1);

        parkingLots.put(lotId, parkingLot);
        return "Added parking-lot -> " + lotId;
    }

    public boolean park(String lotId, String vehicleToPark) {
        return parkingLots.get(lotId).park(vehicleToPark);
    }


    public boolean isParkingLotFull(String lotId) {
        return parkingLots.get(lotId).isFull();
    }
}
