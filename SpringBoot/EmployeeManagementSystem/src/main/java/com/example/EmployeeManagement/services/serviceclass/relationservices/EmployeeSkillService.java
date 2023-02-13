package com.example.EmployeeManagement.services.serviceclass.relationservices;

import com.example.EmployeeManagement.Exception.EmployeeNotFound;
import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import com.example.EmployeeManagement.repository.relationrepo.EmployeeSkillsRepo;
import com.example.EmployeeManagement.services.serviceinterface.relationinterface.EmployeeSkillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSkillService implements EmployeeSkillServiceInterface {
    @Autowired
    private EmployeeSkillsRepo employeeSkillRepo;

    @Override
    public List<EmployeeSkills> findAllEmployee(){
        return employeeSkillRepo.findAll();
    }

    @Override
    public EmployeeSkills addEmployeeSkill(Long emp_id, Long skill_id){
        EmployeeSkills employeeSkills = new EmployeeSkills();
        employeeSkills.setSkills_id(skill_id);
        employeeSkills.setEmp_id(emp_id);
        return employeeSkillRepo.save(employeeSkills);
    }


}
