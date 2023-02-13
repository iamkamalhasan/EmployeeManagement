package com.example.EmployeeManagement.controller.entitycontroller;

import com.example.EmployeeManagement.controller.ControllerInterface;
import com.example.EmployeeManagement.entity.entities.Skills;
import com.example.EmployeeManagement.repository.entityrepo.SkillsRepo;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.SkillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillsController implements ControllerInterface<Skills>{

    @Autowired
    private SkillServiceInterface skillService;
    @Autowired
    private SkillsRepo skillsRepo;

    @Override
    @GetMapping("/find-all")
    public ResponseEntity<List<Skills>> findAllEntity() {
        return new ResponseEntity<>(skillService.findAllEntity(), HttpStatus.OK);
    }

    @Override
    @PostMapping("/add-skills")
    public ResponseEntity<Skills> addEntity(@RequestBody Skills entity) {
        return new ResponseEntity<>(skillService.addEntity(entity), HttpStatus.OK);
    }

}
