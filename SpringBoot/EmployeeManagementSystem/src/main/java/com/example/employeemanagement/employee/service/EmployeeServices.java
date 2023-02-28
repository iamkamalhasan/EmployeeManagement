package com.example.employeemanagement.employee.service;

import com.example.employeemanagement.employee.enity.Employee;
import com.example.employeemanagement.employee.exception.EmployeeNotFound;
import com.example.employeemanagement.employee.repository.EmployeeRepo;
import com.example.employeemanagement.employeeproject.repository.EmployeeProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices implements EmployeeServicesInterface {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private EmployeeProjectRepo employeeProjectRepo;

    @Override
    public List<Employee> findAllEntity(){
        return employeeRepo.findAll();
    }

    @Override
    public Employee addEntity(Employee employee){
        return employeeRepo.save(employee);
    }

    @Override
    public Employee removeEntity(Long Id) {
        return null;
    }

    @Override
    public void deleteById(Long Id) {
        employeeRepo.deleteById(Id);
    }

    @Override
    public Employee updateEntity(Employee entity) {
        return employeeRepo.save(entity);
    }

    @Override
    public Employee findById(Long Id) {
        return employeeRepo.findById(Id).orElseThrow(() -> new EmployeeNotFound("employee nod found with" + Id));
    }

}

