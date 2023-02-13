package com.example.EmployeeManagement.controller.entitycontroller;

import com.example.EmployeeManagement.controller.ControllerInterface;
import com.example.EmployeeManagement.entity.entities.Department;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class DepartmentController implements ControllerInterface<Department> {
    @Override
    @GetMapping
    public ResponseEntity<List<Department>> findAllEntity() {
        return null;
    }

    @GetMapping
    @Override
    public ResponseEntity<Department> addEntity(Department entity) {
        return null;
    }
}
