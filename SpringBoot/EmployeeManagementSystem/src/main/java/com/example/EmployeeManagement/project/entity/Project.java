package com.example.EmployeeManagement.project.entity;

import com.example.EmployeeManagement.employeeproject.entity.EmployeeProject;
import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import com.example.EmployeeManagement.project.requests.AddProjectRequest;
import com.example.EmployeeManagement.project.requests.UpdateProjectRequest;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="project")
public class Project{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private long id;
    @Column(name = "pro_name")
    String projectName;

    @Enumerated(EnumType.STRING)
    ProjectStatus status;

    @Enumerated(EnumType.STRING)
    ProjectType type;

    @OneToMany(mappedBy = "project")
    private List<EmployeeProject> employeeProjects;

    public Project(AddProjectRequest req){
        this.projectName = req.getName();
    }
    public Project(UpdateProjectRequest req){
        this.id = req.getId();
    }


}
