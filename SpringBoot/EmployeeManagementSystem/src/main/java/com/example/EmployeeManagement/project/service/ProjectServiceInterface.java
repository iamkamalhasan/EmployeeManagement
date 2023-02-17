package com.example.EmployeeManagement.project.service;

import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.generic.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectServiceInterface extends ServiceInterface<Project> {
    public List<Project> findByStatus(ProjectStatus status);
    public List<Project> findByType(ProjectType type);

}
