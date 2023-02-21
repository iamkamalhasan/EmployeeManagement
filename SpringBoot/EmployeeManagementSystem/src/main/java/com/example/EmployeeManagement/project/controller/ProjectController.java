package com.example.EmployeeManagement.project.controller;
import com.example.EmployeeManagement.employee.enity.Employee;
import com.example.EmployeeManagement.employeeproject.entity.EmployeeProject;
import com.example.EmployeeManagement.employeeproject.service.EmployeeProjectInterface;
import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.project.requests.AddProjectRequest;
import com.example.EmployeeManagement.project.requests.UpdateProjectRequest;
import com.example.EmployeeManagement.project.response.ProjectEmpoyeeResponse;
import com.example.EmployeeManagement.project.response.ProjectResponse;
import com.example.EmployeeManagement.project.service.ProjectServiceInterface;
import com.example.EmployeeManagement.teams.entity.Teams;
import com.example.EmployeeManagement.teams.service.TeamsServiceInterface;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/project")
public class ProjectController{


    @Autowired
    ProjectServiceInterface projectServiceInterface;

    @Autowired
    EmployeeProjectInterface employeeProjectInterface;


    @Autowired
    TeamsServiceInterface teamsServiceInterface;
    @PostMapping("/add-project")
    public ResponseEntity<Project> addEntities(@RequestBody AddProjectRequest eReq) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Project project = new Project(eReq);
        //String startDate = simpleDateFormat.format(eReq.getStartDate());
        //String endDate = simpleDateFormat.format(eReq.getEndDate());
        project.setStatus(eReq.getStatus());
        project.setType(eReq.getType());
        project.setStartDate(eReq.getStartDate());
        project.setEndDate(eReq.getEndDate());
        project.setValuation(eReq.getValuation());
        projectServiceInterface.addEntity(project);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }


    @PutMapping("/update-project")
    public ResponseEntity<String> updateEntities(@RequestBody UpdateProjectRequest eReq) {
        Project project = projectServiceInterface.findById(eReq.getId());
//        String pattern = "MM-dd-yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
          System.out.println(eReq);
        if(eReq.getName()!=null){
            project.setProjectName(eReq.getName());
        }
        if(eReq.getStatus()!=null){
            project.setStatus(eReq.getStatus());
        }
        if(eReq.getType()!=null){
            project.setType(eReq.getType());
        }
        if(eReq.getStartDate()!=null){
            //String date = simpleDateFormat.format(eReq.getStartDate());
            project.setStartDate(eReq.getStartDate());
        }
        if(eReq.getEndDate()!=null){
            //String date = simpleDateFormat.format(eReq.getEndDate());
            project.setEndDate(eReq.getEndDate());
        }
        if(eReq.getValuation()!=null){
            project.setValuation(eReq.getValuation());
        }
        projectServiceInterface.updateEntity(project);
        return new ResponseEntity<>("project updated", HttpStatus.OK);
    }

    //returns all project with details
    @GetMapping("/find-all")
    public ResponseEntity<List<ProjectResponse>> findAllEntities() {
        List<Project> list = projectServiceInterface.findAllEntity();
        List<ProjectResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            ProjectResponse eResponse = new ProjectResponse(e);
            List<Long> emp_id = new ArrayList<>();
            for(EmployeeProject d : e.getEmployeeProjects()){
                Employee employee = d.getEmployee();
                emp_id.add(employee.getId());
            }
            eResponse.setEmployee_id(emp_id);
            responseList.add(eResponse);
        });

        return new ResponseEntity<List<ProjectResponse>>(responseList, HttpStatus.OK) ;
    }

    //returns details of project
    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> findById(@PathVariable Long id){
        Project project = projectServiceInterface.findById(id);
        ProjectResponse eResponse = new ProjectResponse(project);
        List<Long> emp_id = new ArrayList<>();
        for(EmployeeProject d : project.getEmployeeProjects()){
            Employee employee = d.getEmployee();
            emp_id.add(employee.getId());
        }
        eResponse.setEmployee_id(emp_id);
        return new ResponseEntity<ProjectResponse>(eResponse, HttpStatus.OK) ;
    }

   // returns all employee in a project
    @GetMapping("find-all/employee/{id}")
    public ResponseEntity<List<ProjectEmpoyeeResponse>> findAllEmployeeProject(@PathVariable Long id){
        Project project = projectServiceInterface.findById(id);
        List<ProjectEmpoyeeResponse> employeeList = new ArrayList<>();
        for(EmployeeProject d : project.getEmployeeProjects()){
            Employee employee = d.getEmployee();
            ProjectEmpoyeeResponse projectEmpoyeeResponse = new ProjectEmpoyeeResponse();
            projectEmpoyeeResponse.setName(employee.getName());
            projectEmpoyeeResponse.setId(employee.getId());
            employeeList.add(projectEmpoyeeResponse);
        }
        return new ResponseEntity<List<ProjectEmpoyeeResponse>>(employeeList, HttpStatus.OK) ;
    }

    //return all projects based on status
    @GetMapping("find-all/status/{status}")
    public ResponseEntity<List<ProjectResponse>> findByStatus(@PathVariable("status") ProjectStatus status){
        List<Project> list = projectServiceInterface.findByStatus(status);
        List<ProjectResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            ProjectResponse eResponse = new ProjectResponse(e);
            List<Long> emp_id = new ArrayList<>();
            for(EmployeeProject d : e.getEmployeeProjects()){
                Employee employee = d.getEmployee();
                emp_id.add(employee.getId());
            }
            eResponse.setEmployee_id(emp_id);
            responseList.add(eResponse);
        });
        return new ResponseEntity<List<ProjectResponse>>(responseList, HttpStatus.OK) ;
    }

    //return all projects based on type
    @GetMapping("find-all/type/{type}")
    public ResponseEntity<List<ProjectResponse>> findByType(@PathVariable("type") ProjectType type){
        List<Project> list = projectServiceInterface.findByType(type);
        List<ProjectResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            ProjectResponse eResponse = new ProjectResponse(e);
            List<Long> emp_id = new ArrayList<>();
            for(EmployeeProject d : e.getEmployeeProjects()){
                Employee employee = d.getEmployee();
                emp_id.add(employee.getId());
            }
            eResponse.setEmployee_id(emp_id);
            responseList.add(eResponse);
        });
        return new ResponseEntity<List<ProjectResponse>>(responseList, HttpStatus.OK) ;
    }

    //return all teams in project

    @GetMapping("find-all/teams/{id}")
    public ResponseEntity<List<Teams>> findAllTeams(@PathVariable Long id){
        List<Teams>list = teamsServiceInterface.findByProject(id);
        return new ResponseEntity<List<Teams>>(list, HttpStatus.OK) ;
    }

}
