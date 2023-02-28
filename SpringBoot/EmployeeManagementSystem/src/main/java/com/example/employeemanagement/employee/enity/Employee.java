package com.example.employeemanagement.employee.enity;

import com.example.employeemanagement.employeeproject.entity.EmployeeProject;
import com.example.employeemanagement.employee.requests.EmployeeRequest;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
public class  Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeProject> employeeProjects;

    public Employee(EmployeeRequest req){
        this.name = req.getName();
    }
}
