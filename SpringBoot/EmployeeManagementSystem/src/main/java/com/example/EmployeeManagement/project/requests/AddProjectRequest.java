package com.example.EmployeeManagement.project.requests;

import com.example.EmployeeManagement.project.Enums.ProjectStatus;
import com.example.EmployeeManagement.project.Enums.ProjectType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AddProjectRequest {
    private String name;
    //private List<Long> emp_pro_id;
    private ProjectStatus status;

    private ProjectType type;

}
