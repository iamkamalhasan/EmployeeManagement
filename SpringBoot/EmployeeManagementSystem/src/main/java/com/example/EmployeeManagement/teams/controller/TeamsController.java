package com.example.EmployeeManagement.teams.controller;

import com.example.EmployeeManagement.generic.ControllerInterface;
import com.example.EmployeeManagement.teams.entity.Teams;
import com.example.EmployeeManagement.teams.service.TeamsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamsController implements ControllerInterface<Teams> {

    @Autowired
    TeamsServiceInterface teamsServiceInterface;
    @GetMapping("/find-all")
    @Override
    public ResponseEntity<List<Teams>> findAllEntity()
    {
        return new ResponseEntity<>(teamsServiceInterface.findAllEntity(), HttpStatus.OK);
    }

    @PostMapping("/add-teams")
    @Override
    public ResponseEntity<Teams> addEntity(Teams entity) {

        return new ResponseEntity<>(teamsServiceInterface.addEntity(entity),HttpStatus.OK);
    }

    @DeleteMapping("/delete-teams/{id}")
    @Override
    public ResponseEntity<?> deleteEntity(@PathVariable Long Id) {
        teamsServiceInterface.deleteEntity(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/teams")
    @Override
    public ResponseEntity<Teams> updateEntity(Teams entity) {
        return new ResponseEntity<>(teamsServiceInterface.updateEntity(entity),HttpStatus.OK);
    }
}
