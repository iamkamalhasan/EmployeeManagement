package com.example.EmployeeManagement.services;

import com.example.EmployeeManagement.Exception.EmployeeNotFound;
import com.example.EmployeeManagement.Exception.SkillNotFound;
import com.example.EmployeeManagement.entity.Skills;
import com.example.EmployeeManagement.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillsRepo skillsRepo;

    public List<Skills> findAllSkills(){
        return skillsRepo.findAll();
    }
    public Skills findById(Long Id){
        return skillsRepo.findById(Id).orElseThrow(()-> new SkillNotFound("skills not found with id"+ Id));
    }
    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }

}
