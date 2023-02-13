package com.example.EmployeeManagement.controller.entitycontroller;

import com.example.EmployeeManagement.controller.ControllerInterface;
import com.example.EmployeeManagement.entity.entities.Department;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.DepartmentServiceInterface;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements ControllerInterface<Department> {

    @Autowired
    DepartmentServiceInterface departmentServiceInterface;
    @Override
    @GetMapping("/find-all")
    public ResponseEntity<List<Department>> findAllEntity() {
        return new ResponseEntity<>(departmentServiceInterface.findAllEntity(), HttpStatus.OK) ;
    }

    @PostMapping("/add-department")
    @Override
    public ResponseEntity<Department> addEntity(Department entity) {
        return new ResponseEntity<>(departmentServiceInterface.addEntity(entity), HttpStatus.OK) ;
    }

}
