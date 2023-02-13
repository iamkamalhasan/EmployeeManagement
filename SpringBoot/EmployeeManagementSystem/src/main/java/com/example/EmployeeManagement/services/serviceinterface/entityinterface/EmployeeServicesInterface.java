package com.example.EmployeeManagement.services.serviceinterface.entityinterface;

import com.example.EmployeeManagement.entity.entities.Employee;
import com.example.EmployeeManagement.services.serviceinterface.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServicesInterface extends ServiceInterface<Employee> {

    Employee findById(Long id);
}
