package com.example.employeerestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeManager manager = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return manager.getEmployees();
    }
}

