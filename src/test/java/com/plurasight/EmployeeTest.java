package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void punchOutAddsBothShifts() {
        Employee employee = new Employee("Suliman");

        employee.punchIn(8);
        employee.punchOut(12); // 4 hours

        employee.punchIn(9);
        employee.punchOut(14); // 5 more hours

        assertEquals(9.0, employee.getRegularHours(), 0.001);
    }

    @Test
    void getTotalPay() {
        Employee tai = new Employee("1", "Tai", "Front Desk", 16.00, 12);

        assertEquals(192.0, tai.getTotalPay(), 0.001);
    }

    @Test
    void getRegularHours() {
        Employee suli = new Employee("2", "Suli", "Front Desk", 16.00, 50);

        assertEquals(40.0, suli.getRegularHours(), 0.001);
    }

    @Test
    void getOvertimeHours() {
        Employee suli = new Employee("2", "Suli", "Front Desk", 16.00, 50);

        assertEquals(10.0, suli.getOvertimeHours(), 0.001);
    }
}