package com.example.EmployeeManagement.services;

import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSerives {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }
}
