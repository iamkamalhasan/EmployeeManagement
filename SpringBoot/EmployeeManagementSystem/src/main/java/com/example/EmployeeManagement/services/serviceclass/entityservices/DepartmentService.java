package com.example.EmployeeManagement.services.serviceclass.entityservices;

import com.example.EmployeeManagement.entity.entities.Department;
import com.example.EmployeeManagement.repository.entityrepo.DepartmentRepo;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.DepartmentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements DepartmentServiceInterface {

    @Autowired
    DepartmentRepo departmentRepo;
    @Override
    public List<Department> findAllEntity() {
        return departmentRepo.findAll();
    }

    @Override
    public Department addEntity(Department entity) {
        return departmentRepo.save(entity);
    }
}
