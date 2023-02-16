package com.example.EmployeeManagement.project.response;

import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProjectResponse {
    private Long id;
    private String projectName;
    private ProjectStatus status;
    private List<Long> emp_id;


}
