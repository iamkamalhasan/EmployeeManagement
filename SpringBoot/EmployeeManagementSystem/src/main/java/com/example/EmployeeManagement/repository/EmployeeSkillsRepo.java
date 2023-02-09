package com.example.EmployeeManagement.repository;

import com.example.EmployeeManagement.entity.EmployeeSkills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSkillsRepo extends JpaRepository<EmployeeSkills,Long> {
}
