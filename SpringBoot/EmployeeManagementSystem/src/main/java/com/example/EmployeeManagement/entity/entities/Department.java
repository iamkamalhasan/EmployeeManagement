package com.example.EmployeeManagement.entity.entities;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
import jakarta.persistence.*;
import lombok.Data;
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id",referencedColumnName = "department_id")
    private List<Employee> employee_id;


}

