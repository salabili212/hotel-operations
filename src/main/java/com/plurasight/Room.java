package com.plurasight;

public class Room {
    int numbersOfBeds;
    boolean isOccupied;
    boolean isDirty;
    double price;


    public Room() {
        this(1, 139.00, false, false);
    }

    public Room(int numbersOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numbersOfBeds = numbersOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public void checkIn(){
        if (isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;
        }
    }
    public void checkOut(){
        isDirty = true;
        isOccupied = false;
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }


    public int getNumberOfBeds() {
        return numbersOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }




}
