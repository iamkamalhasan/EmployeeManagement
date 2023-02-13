package com.example.EmployeeManagement.entity.entities;


import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="skills_id")
    private long id;
    private String skills;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="skills_id",referencedColumnName = "skills_id")
    private List<EmployeeSkills> employee_id;
}
