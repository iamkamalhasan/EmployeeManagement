package com.example.EmployeeManagement.services.serviceinterface.relationinterface;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import com.example.EmployeeManagement.services.serviceclass.relationservices.EmployeeSkillService;

import java.util.List;

public interface EmployeeSkillServiceInterface{
    List<EmployeeSkills> findAllEmployee();

    EmployeeSkills addEmployeeSkill(Long emp_id, Long skill_id);
}
