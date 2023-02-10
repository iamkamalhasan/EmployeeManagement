package com.example.EmployeeManagement.controller.entitycontroller;

import com.example.EmployeeManagement.controller.ControllerInterface;
import com.example.EmployeeManagement.entity.entities.Skills;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.SkillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillsController implements ControllerInterface<Skills>{

    @Autowired
    private SkillServiceInterface skillService;

    @Override
    @GetMapping("/find-all")
    public ResponseEntity<List<Skills>> findAllEntity() {
        return new ResponseEntity<>(skillService.findAllSkills(), HttpStatus.OK);
    }

    @PostMapping("/add-skill")
    @Override
    public ResponseEntity<Skills> addEntity(Skills entity) {
        return new ResponseEntity<>(skillService.addSkills(entity), HttpStatus.OK);
    }
}
