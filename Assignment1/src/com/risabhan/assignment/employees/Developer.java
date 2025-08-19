package com.risabhan.assignment.employees;

/**
 * Represents a Developer, subclass of Employee.
 */
public class Developer extends Employee {

    private String programmingLanguage;

    /**
     * Constructs a Developer.
     *
     * @param name                Developer's name
     * @param employeeId          Developer's ID
     * @param salary              Developer's salary
     * @param programmingLanguage Developer's primary language
     */
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    /** @return programming language */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
