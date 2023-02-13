package com.example.EmployeeManagement.services.serviceclass.entityservices;

import com.example.EmployeeManagement.Exception.EmployeeNotFound;
import com.example.EmployeeManagement.entity.entities.Employee;
import com.example.EmployeeManagement.repository.entityrepo.EmployeeRepo;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.EmployeeServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSerives {

    @Autowired
    private EmployeeRepo employeeRepo;


    public List<Employee> findAllEntity(){
        return employeeRepo.findAll();
    }

    public Employee addEntity(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findById(Long id){
        return employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFound("employee not found" + id));
    }

}

