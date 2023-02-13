package com.example.EmployeeManagement.entity.entities;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Entity
@Data
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")

    private long id;
    private String department;


}

