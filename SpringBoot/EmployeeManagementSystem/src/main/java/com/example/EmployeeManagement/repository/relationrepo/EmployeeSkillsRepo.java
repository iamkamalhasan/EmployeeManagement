package com.example.EmployeeManagement.repository.relationrepo;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSkillsRepo extends JpaRepository<EmployeeSkills,Long> {
}
