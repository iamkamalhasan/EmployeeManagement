package com.example.EmployeeManagement.services.serviceinterface;

import com.example.EmployeeManagement.entity.entities.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ServiceInterface<T> {

    List<T> findAllEntity();

    T addEntity(T entity);


}
