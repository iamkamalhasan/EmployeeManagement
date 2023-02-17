package com.example.EmployeeManagement.employeeproject.entity;

import com.example.EmployeeManagement.employee.enity.Employee;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.teams.entity.Teams;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "EmployeeProjectTeam")
@Entity
public class EmployeeProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name= "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Teams teams;
}
