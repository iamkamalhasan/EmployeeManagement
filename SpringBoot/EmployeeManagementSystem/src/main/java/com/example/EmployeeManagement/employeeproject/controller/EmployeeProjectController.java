package com.example.EmployeeManagement.employeeproject.controller;

import com.example.EmployeeManagement.employee.enity.Employee;
import com.example.EmployeeManagement.employee.service.EmployeeServicesInterface;
import com.example.EmployeeManagement.employeeproject.entity.EmployeeProject;
import com.example.EmployeeManagement.employeeproject.requests.EmployeeProjectRequest;
import com.example.EmployeeManagement.employeeproject.response.EmployeeProjectResponse;
import com.example.EmployeeManagement.employeeproject.service.EmployeeProjectInterface;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.project.service.ProjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee-project-team")
public class EmployeeProjectController {

    @Autowired
    EmployeeProjectInterface employeeProjectInterface;

    @Autowired
    EmployeeServicesInterface employeeServicesInterface;

    @Autowired
    ProjectServiceInterface projectServiceInterface;

    @GetMapping("/find-all")
    public ResponseEntity<List<EmployeeProjectResponse>> findAllEntities() {

        List<EmployeeProject> list = employeeProjectInterface.findAllEntity();
        List<EmployeeProjectResponse> responseList = new ArrayList<>();
        list.forEach(e ->{
            EmployeeProjectResponse eResponse = new EmployeeProjectResponse();
            eResponse.setId(e.getId());
            Employee employee = e.getEmployee();
            Project project = e.getProject();
            eResponse.setEmployee_id(employee.getId());
            eResponse.setProject_id(project.getId());
            responseList.add(eResponse);
        });
        return new ResponseEntity<List<EmployeeProjectResponse>>(responseList, HttpStatus.OK);
    }

    @PostMapping("/add-employee-project")
    public ResponseEntity<String> addEntities(@RequestBody EmployeeProjectRequest eReq){
            Employee employee = employeeServicesInterface.findById(eReq.getEmployee_id());
            Project project = projectServiceInterface.findById(eReq.getProject_id());
            EmployeeProject employeeProject = new EmployeeProject();
            employeeProject.setEmployee(employee);
            employeeProject.setProject(project);
            employeeServicesInterface.updateEntity(employee);
            projectServiceInterface.addEntity(project);
            employeeProjectInterface.addEntity(employeeProject);
        return new ResponseEntity<String>("relation saved", HttpStatus.OK) ;
    }
}
