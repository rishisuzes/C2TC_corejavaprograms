package com.risabhan.assignment.employees;

/**
 * Represents a generic Employee.
 * Demonstrates encapsulation and access modifiers.
 */
public class Employee {
    private String name;          // private: only inside this class
    private int employeeId;       // private
    protected double salary;      // protected: accessible in subclasses and same package

    /**
     * Constructs an Employee with the given details.
     *
     * @param name       The employee's name
     * @param employeeId The employee's ID
     * @param salary     The employee's salary
     */
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    /** @return employee's name */
    public String getName() {
        return name;
    }

    /** @return employee's ID */
    public int getEmployeeId() {
        return employeeId;
    }

    /** @return employee's salary */
    public double getSalary() {
        return salary;
    }

    /** @param salary new salary to set */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** Displays employee details */
    public void displayInfo() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
    }
}
