package com.risabhan.assignment.utilities;

import com.risabhan.assignment.employees.Employee;

/**
 * Utility class for Employee operations.
 * Demonstrates usage of access modifiers across packages.
 */
public class EmployeeUtilities {

    /**
     * Increases the salary of an Employee by a given percentage.
     *
     * @param employee   The employee whose salary will be increased
     * @param percentage The percentage increase
     */
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary updated for " + employee.getName() + ": " + newSalary);
    }

    /**
     * Displays employee details.
     *
     * @param employee The employee whose details will be displayed
     */
    public static void showEmployeeDetails(Employee employee) {
        employee.displayInfo();
    }
}
