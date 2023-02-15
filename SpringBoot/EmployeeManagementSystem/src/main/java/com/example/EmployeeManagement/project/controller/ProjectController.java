package com.example.EmployeeManagement.project.controller;

import com.example.EmployeeManagement.employee.enity.Employee;
import com.example.EmployeeManagement.employee.response.EmployeeResponse;
import com.example.EmployeeManagement.employeeproject.entity.EmployeeProject;
import com.example.EmployeeManagement.employeeproject.service.EmployeeProjectInterface;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.project.requests.AddProjectRequest;
import com.example.EmployeeManagement.project.response.ProjectResponse;
import com.example.EmployeeManagement.project.service.ProjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController{


    @Autowired
    ProjectServiceInterface projectServiceInterface;

    @Autowired
    EmployeeProjectInterface employeeProjectInterface;


    @PostMapping("/add-project")
    public ResponseEntity<Project> addEntities(@RequestBody AddProjectRequest eReq) {
        Project project = new Project(eReq);
        projectServiceInterface.addEntity(project);
//        Employee employee = new Employee();
//        for(Long L: eReq.getEmp_pro_id()){
//            EmployeeProjectTeam employeeProjectTeam = new EmployeeProjectTeam();
//            employeeProjectTeam.setProject(project);
//            employeeProjectTeam.setEmployee(employee);
//            employeeProjectTeamInterface.addEntity(employeeProjectTeam);
//        }
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<ProjectResponse>> findAllEntities() {
        List<Project> list = projectServiceInterface.findAllEntity();
        List<ProjectResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            ProjectResponse eResponse = new ProjectResponse();
            eResponse.setId(e.getId());
            eResponse.setProjectName(e.getProjectName());
            List<Long> emp_id = new ArrayList<>();
            for(EmployeeProject d : e.getEmployeeProjects()){
                emp_id.add(d.getId());
            }
            eResponse.setEmp_id(emp_id);
            responseList.add(eResponse);
        });

        return new ResponseEntity<List<ProjectResponse>>(responseList, HttpStatus.OK) ;
    }

}
