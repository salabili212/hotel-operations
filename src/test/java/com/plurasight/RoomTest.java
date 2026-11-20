package com.plurasight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        //Arrange
        Room room1 = new Room();

        //Act
        room1.checkIn();

        //assert
        assertEquals(true,room1.isOccupied);

    }

    @Test
    void checkOut() {
        //Arrange
        Room room1 = new Room();

        //Act
        room1.checkOut();

        //assert
        assertFalse(room1.isOccupied);
        assertEquals(true, room1.isDirty);
    }

    @Test
    void cleanRoom() {
        //Arrange
        Room room1 = new Room();

        //Act
        room1.cleanRoom();

        //assert
        assertFalse(room1.isOccupied);
        assertFalse(room1.isDirty);
    }

    @Test
    void getNumbersOfBeds() {
        //Arrange
        Room room1 = new Room(2, 124.00, false, false);

        //assert
        assertEquals(2, room1.getNumberOfBeds());
    }

    @Test
    void isOccupied() {
        //Arrange
        Room room1 = new Room();

        //assert
        Assertions.assertEquals(false,room1.isOccupied());
    }

    @Test
    void isDirty() {
        //Arrange
        Room room1 = new Room();

        //Act
        room1.checkIn();

        //assert
        assertEquals(true,room1.isDirty());
    }

    @Test
    void isAvailable() {
        //Arrange
        Room room1 = new Room();

        //assert
        Assertions.assertEquals(true,room1.isAvailable());
    }

    @Test
    void getPrice() {

        //Arrange
        Room room1 = new Room(2, 124.00, false, false);


        //assert
        assertEquals(124.00, room1.getPrice(), 0.001);
    }
}