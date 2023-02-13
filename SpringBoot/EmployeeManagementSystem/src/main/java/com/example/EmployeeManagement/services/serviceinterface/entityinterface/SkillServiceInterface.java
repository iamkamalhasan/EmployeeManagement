package com.example.EmployeeManagement.services.serviceinterface.entityinterface;

import com.example.EmployeeManagement.entity.entities.Skills;
import com.example.EmployeeManagement.services.serviceinterface.ServiceInterface;

import java.util.List;

public interface SkillServiceInterface extends ServiceInterface<Skills> {
    Skills findById(Long Id);

}
