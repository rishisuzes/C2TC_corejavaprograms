package com.risabhan.assignment.employees;

/**
 * Represents a Manager, subclass of Employee.
 */
public class Manager extends Employee {

    private String department;

    /**
     * Constructs a Manager.
     *
     * @param name       Manager's name
     * @param employeeId Manager's ID
     * @param salary     Manager's salary
     * @param department Department managed
     */
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    /** @return department name */
    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
