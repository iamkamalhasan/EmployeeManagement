package com.example.EmployeeManagement.project.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProjectResponse {
    private Long id;
    private String projectName;

    private List<Long> emp_id;

}
