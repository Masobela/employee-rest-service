package com.example.employeerestservice;

import java.util.Arrays;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees(Arrays.asList(
            new Employee(1, "Neo", "Masobela", "neo@example.com", "Software Engineer"),
            new Employee(2, "Alice", "Smith", "alice@example.com", "Project Manager"),
            new Employee(3, "John", "Doe", "john@example.com", "QA Tester")
        ));
    }

    public Employees getEmployees() {
        return employees;
    }
}
