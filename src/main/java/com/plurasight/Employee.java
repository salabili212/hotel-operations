package com.plurasight;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
    private final String employeeId;
    private final String name;
    private final String department;
    private final double payRate;

    private double hoursWorked;
    private int startTime = -1;
    private LocalDateTime clockInTime;

    public Employee(String name) {
        this("", name, "", 16.00, 0);
    }

    public Employee(String employeeId, String name, String department,
                    double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void punchIn(int time) {
        validateHour(time);

        if (startTime != -1 || clockInTime != null) {
            throw new IllegalStateException("Already punched in.");
        }

        startTime = time;
    }

    public void punchOut(int time) {
        validateHour(time);

        if (startTime == -1) {
            throw new IllegalStateException("Use punchIn(int) first.");
        }

        int shiftHours = time - startTime;
        if (shiftHours < 0) {
            shiftHours += 24; // The shift ended after midnight.
        }

        hoursWorked += shiftHours;
        startTime = -1;
    }

    public void punchIn() {
        if (startTime != -1 || clockInTime != null) {
            throw new IllegalStateException("Already punched in.");
        }

        clockInTime = LocalDateTime.now();
    }

    public void punchOut() {
        if (clockInTime == null) {
            throw new IllegalStateException("Use punchIn() first.");
        }

        Duration shift = Duration.between(clockInTime, LocalDateTime.now());
        hoursWorked += shift.toMinutes() / 60.0;
        clockInTime = null;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    private void validateHour(int time) {
        if (time < 0 || time > 23) {
            throw new IllegalArgumentException("Enter an hour from 0 to 23.");
        }
    }
}