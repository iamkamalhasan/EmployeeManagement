package com.example.EmployeeManagement.project.requests;

import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateProjectRequest {
    private String name;
    private Long id;
    private ProjectStatus status;
}
