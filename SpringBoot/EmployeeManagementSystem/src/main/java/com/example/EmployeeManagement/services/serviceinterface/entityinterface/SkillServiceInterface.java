package com.example.EmployeeManagement.services.serviceinterface.entityinterface;

import com.example.EmployeeManagement.entity.entities.Skills;

import java.util.List;

public interface SkillServiceInterface {
    List<Skills> findAllSkills();

    Skills findById(Long Id);

    Skills addSkills(Skills skills);
}
