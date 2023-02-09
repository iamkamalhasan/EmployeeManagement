package com.example.EmployeeManagement.services;

import com.example.EmployeeManagement.Exception.EmployeeNotFound;
import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.entity.EmployeeSkills;
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

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public Employee findById(Long id){
        return employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFound("employee not found" + id));
    }
}
