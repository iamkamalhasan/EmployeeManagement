package com.example.EmployeeManagement.project.repository;

import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import com.example.EmployeeManagement.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long> {
    List<Project> findByStatus(ProjectStatus status);

    List<Project> findByType(ProjectType type);


}
