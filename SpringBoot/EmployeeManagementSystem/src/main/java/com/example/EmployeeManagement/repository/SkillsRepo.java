package com.example.EmployeeManagement.repository;

import com.example.EmployeeManagement.entity.Skills;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long> {

}
