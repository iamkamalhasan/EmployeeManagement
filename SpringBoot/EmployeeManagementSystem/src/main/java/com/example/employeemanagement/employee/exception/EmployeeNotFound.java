package com.example.employeemanagement.employee.exception;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(String message) {
        super(message);
    }
}
