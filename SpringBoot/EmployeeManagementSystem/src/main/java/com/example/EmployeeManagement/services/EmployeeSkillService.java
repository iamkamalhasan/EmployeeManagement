package com.example.EmployeeManagement.services;

import com.example.EmployeeManagement.Exception.EmployeeNotFound;
import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.entity.EmployeeSkills;
import com.example.EmployeeManagement.repository.EmployeeRepo;
import com.example.EmployeeManagement.repository.EmployeeSkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSkillService {
    @Autowired
    private EmployeeSkillsRepo employeeSkillRepo;

    public List<EmployeeSkills> findAllEmployee(){
        return employeeSkillRepo.findAll();
    }

    public EmployeeSkills addEmployeeSkill(Long emp_id,Long skill_id){
        EmployeeSkills employeeSkills = new EmployeeSkills();
        employeeSkills.setFrn_key_skill(skill_id);
        employeeSkills.setFrn_key_emp(emp_id);
        return employeeSkillRepo.save(employeeSkills);
    }
    public EmployeeSkills findById(Long id){
        return employeeSkillRepo.findById(id).orElseThrow(() -> new EmployeeNotFound("skill did not match with employee" + id));
    }
}
