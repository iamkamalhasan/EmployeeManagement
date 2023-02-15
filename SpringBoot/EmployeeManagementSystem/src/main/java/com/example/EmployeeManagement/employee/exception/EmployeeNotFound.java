package com.example.EmployeeManagement.employee.exception;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(String message) {
        super(message);
    }
}
