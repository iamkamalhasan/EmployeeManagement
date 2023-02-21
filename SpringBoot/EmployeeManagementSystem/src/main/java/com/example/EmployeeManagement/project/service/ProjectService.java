package com.example.EmployeeManagement.project.service;

import com.example.EmployeeManagement.employee.exception.EmployeeNotFound;
import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.project.exception.ProjectNotFound;
import com.example.EmployeeManagement.project.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements ProjectServiceInterface {

    @Autowired
    ProjectRepo projectRepo;
    @Override
    public List<Project> findAllEntity() {
        return projectRepo.findAll();
    }

    @Override
    public Project addEntity(Project entity) {
        return projectRepo.save(entity);
    }

    @Override
    public Project removeEntity(Long Id) {
        return null;
    }

    @Override
    public void deleteEntity(Long Id) {
        projectRepo.deleteById(Id);
    }

    @Override
    public Project updateEntity(Project entity) {
        return projectRepo.save(entity);
    }

    @Override
    public List<Project> findByStatus(ProjectStatus status){
        return projectRepo.findByStatus(status);
    }

    @Override
    public List<Project> findByType(ProjectType type) {
        return projectRepo.findByType(type);
    }

    @Override
    public Project findById(Long Id) {
        return projectRepo.findById(Id).orElseThrow(() -> new ProjectNotFound("project nod found with" + Id));
    }

}