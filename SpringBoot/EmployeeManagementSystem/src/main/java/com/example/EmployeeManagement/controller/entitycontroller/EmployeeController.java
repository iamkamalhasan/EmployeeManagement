package com.example.EmployeeManagement.controller.entitycontroller;

import com.example.EmployeeManagement.controller.ControllerInterface;
import com.example.EmployeeManagement.entity.entities.Employee;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.EmployeeServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements ControllerInterface<Employee>{

    @Autowired
    private EmployeeServicesInterface employeeSerives;

    @Override
    @GetMapping("/find-all")
    public ResponseEntity<List<Employee>> findAllEntity() {

        return new ResponseEntity<>(employeeSerives.findAllEntity(), HttpStatus.OK) ;
    }

    @Override
    @PostMapping("/add-employee")
    public ResponseEntity<Employee> addEntity(Employee entity) {
        return new ResponseEntity<>(employeeSerives.addEntity(entity), HttpStatus.OK);
    }


}
