package com.plurasight;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("My Hotel", 3, 10);

        System.out.println(hotel.bookRoom(2, true));      // true
        System.out.println(hotel.getAvailableSuites());  // 1
        System.out.println(hotel.bookRoom(2, true));      // false, only 1 suite left
        System.out.println(hotel.bookRoom(1, false));   // true
        System.out.println(hotel.getAvailableRooms());  // 9
//        Reservation reservation = new Reservation("King", 2);
//        reservation.setWeekend(true);
//        System.out.printf("Total: $%.2f%n", reservation.getReservationTotal());
//        Employee employee = new Employee("Suliman");
//        employee.punchIn();
//        employee.punchOut();


    }




}
