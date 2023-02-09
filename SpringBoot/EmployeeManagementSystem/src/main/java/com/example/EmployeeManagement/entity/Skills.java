package com.example.EmployeeManagement.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

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
    @JoinColumn(name="frn_key_skill",referencedColumnName = "skills_id")
    private List<EmployeeSkills> employee_id;
}
