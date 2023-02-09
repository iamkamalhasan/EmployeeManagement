package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.repository.EmployeeRepo;
import com.example.EmployeeManagement.services.EmployeeSerives;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private EmployeeSerives employeeSerives;
    @GetMapping("/api")
    public List<Employee> findAllEmployee(){
        return employeeSerives.findAllEmployee();
    }
}
