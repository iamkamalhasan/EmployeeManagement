package com.example.EmployeeManagement.services.serviceclass.entityservices;

import com.example.EmployeeManagement.Exception.SkillNotFound;
import com.example.EmployeeManagement.entity.entities.Skills;
import com.example.EmployeeManagement.repository.entityrepo.SkillsRepo;
import com.example.EmployeeManagement.services.serviceinterface.entityinterface.SkillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements SkillServiceInterface {
    @Autowired
    private SkillsRepo skillsRepo;

    @Override
    public List<Skills> findAllEntity(){
        return skillsRepo.findAll();
    }

    @Override
    public Skills findById(Long Id){
        return skillsRepo.findById(Id).orElseThrow(()-> new SkillNotFound("skills not found with id"+ Id));
    }
    @Override
    public Skills addEntity(Skills skills){
        return skillsRepo.save(skills);
    }

}
