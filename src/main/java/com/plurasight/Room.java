package com.plurasight;

public class Room {
    int numbersOfBeds;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;
    double price;

//    public Room(int numbersOfBeds,boolean isOccupied, boolean isDirty,boolean isAvailable){
//        this.numbersOfBeds = numbersOfBeds;
//        this.isAvailable = isAvailable;
//        this.isOccupied = isOccupied;
//        this.isDirty = isDirty;
//    }

    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
    }
    public void checkOut(){
        isDirty = true;
        isOccupied = false;
    }

    public void cleanRoom(){
        isDirty = false;
        isOccupied = false;
    }


    public int getNumbersOfBeds(int number) {
        this.numbersOfBeds = number;
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

    public double getPrice(String roomType) {
        if(roomType.equals("king")) price = 139.00;
        if (roomType.equals("double")) price = 124.00;
        return price;
    }


}
