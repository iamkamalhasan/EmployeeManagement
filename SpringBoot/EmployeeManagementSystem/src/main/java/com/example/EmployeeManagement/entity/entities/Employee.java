package com.example.EmployeeManagement.entity.entities;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="employee")
public class  Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    @Column(name="name")
    private String name;


}
