package com.example.EmployeeManagement.project.requests;

import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UpdateProjectRequest {
    private String name;
    private Long id;
    private ProjectStatus status;
    private ProjectType type;
    private String startDate;
    private String endDate;

    private Long valuation;
}
