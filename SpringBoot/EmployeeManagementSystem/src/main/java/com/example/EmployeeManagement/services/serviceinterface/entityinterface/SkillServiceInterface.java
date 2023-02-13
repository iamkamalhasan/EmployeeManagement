package com.example.EmployeeManagement.services.serviceinterface.entityinterface;

import com.example.EmployeeManagement.entity.entities.Skills;
import com.example.EmployeeManagement.services.serviceinterface.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SkillServiceInterface extends ServiceInterface<Skills> {
    Skills findById(Long Id);

}
