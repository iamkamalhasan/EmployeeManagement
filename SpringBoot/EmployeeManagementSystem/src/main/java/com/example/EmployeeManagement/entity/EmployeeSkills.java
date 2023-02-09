package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="emp_skills")
public class EmployeeSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_skill_id")
    private long id;
    private String skills;

}
