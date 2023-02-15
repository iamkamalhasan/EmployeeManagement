package com.example.EmployeeManagement.project.repository;

import com.example.EmployeeManagement.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long> {
}
