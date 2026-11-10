package com.plurasight;

public class Room {
    private int numbersOfBeds;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
    private double price;

    public Room(int numbersOfBeds,boolean isOccupied, boolean isDirty,boolean isAvailable){
        this.numbersOfBeds = numbersOfBeds;
        this.isAvailable = isAvailable;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public boolean isOccupied() {
        if (!isAvailable) isOccupied = true;
        if (isAvailable)  isOccupied = false;
        return isOccupied;
    }

    public boolean isDirty() {
        if(isOccupied) isDirty = true;
        return isDirty;
    }

    public boolean isAvailable() {
        if(!isDirty && !isOccupied) isAvailable = true;
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }


}
