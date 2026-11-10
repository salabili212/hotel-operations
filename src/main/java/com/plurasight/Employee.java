package com.plurasight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;


    public Employee(String employeeId, String name, String department,double payRate,int hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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
