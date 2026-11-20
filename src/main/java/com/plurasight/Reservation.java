package com.plurasight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights) {
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

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        double price;

        if ("King".equalsIgnoreCase(roomType)) {
            price = 139.00;
        } else if ("Double".equalsIgnoreCase(roomType)) {
            price = 124.00;
        } else {
            throw new IllegalArgumentException("Room type must be King or Double.");
        }

        if (isWeekend) {
            price *= 1.10;
        }

        return price;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}