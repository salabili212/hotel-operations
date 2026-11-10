package com.plurasight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;


    public Reservation(String roomType, int numberOfNights){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
        if (isWeekend){
            price = price + (price * .10);
        }
    }

    public double getPrice() {
        if(this.roomType.equalsIgnoreCase("King")) price = 139.00;
        if (this.roomType.equalsIgnoreCase("double")) price = 124.00;
        return price;
    }

    public void getReservationTotal(){
        System.out.println("The total: " + this.price * this.numberOfNights);
    }
}
