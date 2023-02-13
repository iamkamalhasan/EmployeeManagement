package com.example.EmployeeManagement.services.serviceinterface.entityinterface;

import com.example.EmployeeManagement.entity.entities.Employee;
import com.example.EmployeeManagement.services.serviceinterface.ServiceInterface;

import java.util.List;

public interface EmployeeServicesInterface extends ServiceInterface<Employee> {

    Employee findById(Long id);
}
