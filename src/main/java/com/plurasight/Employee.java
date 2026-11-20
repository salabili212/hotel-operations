package com.plurasight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    String employeeId;
    String name;
    String department;
    double payRate = 16;
    int startTime;
    LocalDateTime starTime;
    int hoursWorked;


    public Employee(String name){
        this.name = name;
    }


    public void punchIn(int time){
        this.startTime = time;
    }

    public void punchIn(){
        this.starTime = LocalDateTime.now();

    }

    public void punchOut(int time){
        this.hoursWorked = time - startTime;
    }

    public void punchOut(){
        LocalDateTime endTime = LocalDateTime.now();

        Duration duration = Duration.between(starTime,endTime);

        System.out.println(duration.toMinutes());

    }
    public double getTotalPay(){
        return this.payRate * this.hoursWorked;
    }
    public int getRegularHours(){
        if (hoursWorked > 40) return 40;
        return hoursWorked;
    }
    public int getOvertimeHours(){
        if (hoursWorked > 40) return hoursWorked - 40;
        return 0;
    }


}
