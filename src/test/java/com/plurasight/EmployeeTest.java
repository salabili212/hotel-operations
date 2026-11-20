package com.plurasight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    void punchIn() {
        //Arrange
        Employee suliman = new Employee("Suliman");

        //Act
        suliman.punchIn(12);

        //Assert
        Assertions.assertEquals(12,suliman.startTime);

    }

    @Test
    void punchOut() {
        //Arrange
        Employee dave = new Employee("Dave");
        dave.startTime = 8;

        //Act
        dave.punchOut(20);

        //Assert
        Assertions.assertEquals(12,dave.hoursWorked);
    }

    @Test
    void getTotalPay() {
        //Arrange
        Employee tai = new Employee("Tai");
        tai.hoursWorked = 12;

        //Act
        double totalPay = tai.getTotalPay();

        //Assert
        assertEquals(192,totalPay);


    }

    @Test
    void getRegularHours() {
        Employee suli = new Employee("Suli");
        suli.hoursWorked = 40;

        int expected = suli.getRegularHours();

        assertEquals(40,expected);


    }

    @Test
    void getOvertimeHours() {
        Employee suli = new Employee("Suli");
        suli.hoursWorked = 50;

        int expected = suli.getOvertimeHours();

        assertEquals(10,expected);
    }
}