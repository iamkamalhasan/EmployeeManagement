package com.example.employeemanagement.employee.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeResponse {
    private Long id;
    private String employeeName;
    private List<Long> project_id;
}
