package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {
    ParkingLot parkingLot;

    @BeforeEach
    void setup() {
        parkingLot = ParkingLot.create(1);
    }

    @Test
    void shouldParkACarInTheParkingLot() {
        assertTrue(parkingLot.park());
    }

    @Test
    void shouldNotParkACarInTheParkingLot() {
        parkingLot.park();
        assertFalse(parkingLot.park());
    }
}