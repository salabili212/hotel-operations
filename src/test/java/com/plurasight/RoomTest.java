package com.plurasight;

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
        Room room1 = new Room();

        //Act
        room1.getNumbersOfBeds(3);

        //assert
        assertEquals(3,room1.numbersOfBeds);
    }

    @Test
    void isOccupied() {
        //Arrange
        Room room1 = new Room();

        //Act
        room1.isOccupied();

        //assert
        assertEquals(true,room1.isOccupied);
    }

    @Test
    void isDirty() {
        //Arrange
        Room room1 = new Room();
        room1.isOccupied = true;

        //Act
        room1.isDirty();

        //assert
        assertEquals(true,room1.isDirty);
    }

    @Test
    void isAvailable() {
        //Arrange
        Room room1 = new Room();
        room1.isDirty = false;
        room1.isOccupied = false;

        //Act
        room1.isAvailable();

        //assert
        assertEquals(true,room1.isAvailable);
    }

    @Test
    void getPrice() {

        //Arrange
        Room room1 = new Room();


        //Act
        room1.getPrice("king");

        //assert
        assertEquals(139,room1.price);
    }
}