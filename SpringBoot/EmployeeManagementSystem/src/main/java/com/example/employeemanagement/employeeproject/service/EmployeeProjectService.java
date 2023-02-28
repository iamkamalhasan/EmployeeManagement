package com.example.employeemanagement.employeeproject.service;

import com.example.employeemanagement.employeeproject.entity.EmployeeProject;
import com.example.employeemanagement.employeeproject.repository.EmployeeProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProjectService implements EmployeeProjectInterface {

    @Autowired
    EmployeeProjectRepo employeeProjectRepo;

    @Override
    public List<EmployeeProject> findAllEntity() {
        return employeeProjectRepo.findAll();
    }

    @Override
    public EmployeeProject addEntity(EmployeeProject entity) {
        return employeeProjectRepo.save(entity);
    }

    @Override
    public EmployeeProject removeEntity(Long Id) {
        return null;
    }

    @Override
    public void deleteEntity(Long Id) {
        employeeProjectRepo.deleteById(Id);
    }

    @Override
    public EmployeeProject updateEntity(EmployeeProject entity) {
        return employeeProjectRepo.save(entity);
    }

    @Override
    public EmployeeProject findById(Long Id) {
        return null;
    }

}
