package com.example.EmployeeManagement.teams.controller;

import com.example.EmployeeManagement.employee.enity.Employee;
import com.example.EmployeeManagement.employeeproject.entity.EmployeeProject;
import com.example.EmployeeManagement.generic.ControllerInterface;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.project.response.ProjectResponse;
import com.example.EmployeeManagement.teams.entity.Teams;
import com.example.EmployeeManagement.teams.requests.AddTeamRequest;
import com.example.EmployeeManagement.teams.response.TeamResponse;
import com.example.EmployeeManagement.teams.service.TeamsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamsController {

    @Autowired
    TeamsServiceInterface teamsServiceInterface;

    @GetMapping("/find-all")
    public ResponseEntity<List<TeamResponse>> findAllEntities() {
        List<Teams> list = teamsServiceInterface.findAllEntity();
        List<TeamResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            TeamResponse eResponse = new TeamResponse(e);
            Long pro_id = null;
            for(EmployeeProject d : e.getEmployeeProjects()){
                Project project = d.getProject();
                pro_id = project.getId();
            }
            eResponse.setProject_id(pro_id);
            responseList.add(eResponse);
        });

        return new ResponseEntity<List<TeamResponse>>(responseList, HttpStatus.OK) ;
    }
    //add teams to projects

    @PostMapping("/add-teams")
    public ResponseEntity<String> addEntity(@RequestBody AddTeamRequest eReq) {
        Teams teams = new Teams();
        teams.setId(eReq.getId());
        teams.setName(eReq.getName());
        teams.setProject(eReq.getProject_id());
        teamsServiceInterface.addEntity(teams);
        return new ResponseEntity<>("team added",HttpStatus.OK);
    }

    @DeleteMapping("/delete-teams/{id}")
    public ResponseEntity<?> deleteEntity(@PathVariable Long Id) {
        teamsServiceInterface.deleteEntity(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/teams")
    public ResponseEntity<Teams> updateEntity(@RequestBody Teams entity) {
        return new ResponseEntity<>(teamsServiceInterface.updateEntity(entity),HttpStatus.OK);
    }


}
