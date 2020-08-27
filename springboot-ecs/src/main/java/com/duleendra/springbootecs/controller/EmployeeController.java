package com.duleendra.springbootecs.controller;

import com.duleendra.springbootecs.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(1L, "John", "Dave"));
        employees.add(new Employee(2L, "Mark", "Anthony"));
        employees.add(new Employee(3L, "Anna", "Lina"));

        return employees;
    }
}
