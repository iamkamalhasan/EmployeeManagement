package com.example.EmployeeManagement.services.serviceinterface.entityinterface;

import com.example.EmployeeManagement.entity.entities.Employee;

import java.util.List;

public interface EmployeeServicesInterface {
    List<Employee> findAllEmployee();

    Employee addEmployee(Employee employee);

    Employee findById(Long id);
}
