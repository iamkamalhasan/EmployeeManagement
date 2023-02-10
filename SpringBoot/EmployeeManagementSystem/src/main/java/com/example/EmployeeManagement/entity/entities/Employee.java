package com.example.EmployeeManagement.entity.entities;

import com.example.EmployeeManagement.entity.relations.EmployeeSkills;
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
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="frn_key_emp",referencedColumnName = "emp_id")
    private List<EmployeeSkills> employeeSkills_id;

}
