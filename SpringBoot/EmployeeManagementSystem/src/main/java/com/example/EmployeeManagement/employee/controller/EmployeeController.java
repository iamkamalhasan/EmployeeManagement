package com.example.EmployeeManagement.employee.controller;

import com.example.EmployeeManagement.employee.enity.Employee;
import com.example.EmployeeManagement.employee.repository.EmployeeRepo;
import com.example.EmployeeManagement.employee.response.EmployeeResponse;
import com.example.EmployeeManagement.employee.service.EmployeeServicesInterface;
import com.example.EmployeeManagement.employeeproject.entity.EmployeeProject;
import com.example.EmployeeManagement.employee.requests.EmployeeRequest;
import com.example.EmployeeManagement.employeeproject.service.EmployeeProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServicesInterface employeeSerives;

    @Autowired
    private EmployeeProjectInterface employeeProjectInterface;

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/find-all")
    public ResponseEntity<List<EmployeeResponse>> findAllEntities() {
        List<Employee> list = employeeSerives.findAllEntity();
        List<EmployeeResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            EmployeeResponse eResponse = new EmployeeResponse();
            eResponse.setId(e.getId());
            eResponse.setEmployeeName(e.getName());
            List<Long> emp_pro_id = new ArrayList<>();
            for(EmployeeProject d : e.getEmployeeProjects()){
                emp_pro_id.add(d.getId());
            }
            eResponse.setEmp_pro_id(emp_pro_id);
            responseList.add(eResponse);
        });

        return new ResponseEntity<List<EmployeeResponse>>(responseList, HttpStatus.OK) ;
    }

    @PostMapping("/add-employee")
    public ResponseEntity<Employee> addEntity(@RequestBody EmployeeRequest eReq) {
        Employee employee = new Employee(eReq);
        employee = employeeSerives.addEntity(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }


}
