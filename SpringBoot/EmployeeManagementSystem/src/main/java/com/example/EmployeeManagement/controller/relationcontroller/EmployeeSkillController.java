package com.example.EmployeeManagement.controller.relationcontroller;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import com.example.EmployeeManagement.services.serviceclass.relationservices.EmployeeSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeSkillController {

    @Autowired
    private EmployeeSkillService employeeSkillsService;
    @PostMapping("/add-employee-skill/{emp_id}/{skill_id}")
    public ResponseEntity<EmployeeSkills> addSkillToEmployee(@PathVariable("emp_id")Long emp_id, @PathVariable("skill_id") Long skill_id){
        return new ResponseEntity<>(employeeSkillsService.addEmployeeSkill(emp_id,skill_id), HttpStatus.OK);
    }
}
