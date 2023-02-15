package com.example.EmployeeManagement.employee.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeResponse {
    private Long id;
    private String employeeName;
    private List<Long> emp_pro_id;
}
