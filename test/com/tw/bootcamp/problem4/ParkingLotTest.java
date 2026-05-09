package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void shouldAllowParkingACar() {
        ParkingLotAttendant parkingLotAttendant =
                new ParkingLotAttendant();
        String msg = parkingLotAttendant.addParkingLot(1);
        boolean isParked = parkingLotAttendant.park("P1", "car");

        assertEquals("Added parking-lot -> P1", msg);
        assertTrue(isParked);
    }

    @Test
    void shouldThrowErrorCreatingInvalidSizeParkingLot() {
        ParkingLotAttendant parkingLotAttendant =
                new ParkingLotAttendant();
        assertThrows(IllegalArgument.class,
                () -> parkingLotAttendant.addParkingLot(-10));
    }

    @Test
    void shouldReturnTrueForParkingLotIsFull() {
        ParkingLotAttendant parkingLotAttendant =
                new ParkingLotAttendant();
        String msg = parkingLotAttendant.addParkingLot(1);
        parkingLotAttendant.park("P1", "car1");
        boolean isParkingLotFull = parkingLotAttendant.isParkingLotFull("P1");

        assertEquals("Added parking-lot -> P1", msg);
        assertTrue(isParkingLotFull);
    }

    @Test
    void shouldReturnFalseForParkingLotIsFull() {
        ParkingLotAttendant parkingLotAttendant =
                new ParkingLotAttendant();
        parkingLotAttendant.addParkingLot(1);
        parkingLotAttendant.addParkingLot(2);
        boolean isParkingLotFull = parkingLotAttendant.isParkingLotFull("P2");
        assertFalse(isParkingLotFull);
    }

}
