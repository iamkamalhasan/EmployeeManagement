package com.example.EmployeeManagement.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Entity
@Data
@Table(name="skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="skills_id")
    private long id;
    private String skills;


}
