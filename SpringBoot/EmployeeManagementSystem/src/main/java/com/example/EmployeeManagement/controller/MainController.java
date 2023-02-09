package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.entity.EmployeeSkills;
import com.example.EmployeeManagement.entity.Skills;
import com.example.EmployeeManagement.repository.EmployeeRepo;
import com.example.EmployeeManagement.repository.EmployeeSkillsRepo;
import com.example.EmployeeManagement.services.EmployeeSerives;
import com.example.EmployeeManagement.services.EmployeeSkillService;
import com.example.EmployeeManagement.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private EmployeeSerives employeeSerives;

    @Autowired
    private SkillService skillService;
    @Autowired
    private EmployeeSkillService employeeSkillsService;

    @GetMapping("/api")
    public List<Employee> findAllEmployee(){
        return employeeSerives.findAllEmployee();
    }

    @PostMapping("/api/add-employee")
    public Employee addEmployee(Employee employee){
        return employeeSerives.addEmployee(employee);
    }

    @GetMapping("/api/skill")
    public List<Skills> findAllSkills(){
        return skillService.findAllSkills();
    }

    @PostMapping("/api/add-skill")
    public Skills addSkill(Skills skills){
        return skillService.addSkills(skills);
    }
    @PostMapping("/api/add-skill-employee/{emp_id}/{skill_id}")
    public EmployeeSkills addSkillToEmployee(@PathVariable("emp_id")Long emp_id,@PathVariable("skill_id") Long skill_id){
        return employeeSkillsService.addEmployeeSkill(emp_id,skill_id);
    }

}
