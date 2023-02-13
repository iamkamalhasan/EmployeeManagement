package com.example.EmployeeManagement.entity.entities;


import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="skills")
@Data
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="skills_id")
    private long id;

    @Column(name = "skills")
    private String skills;

}

