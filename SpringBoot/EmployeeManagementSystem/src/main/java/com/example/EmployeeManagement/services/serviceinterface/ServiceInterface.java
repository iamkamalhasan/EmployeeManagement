package com.example.EmployeeManagement.services.serviceinterface;

import com.example.EmployeeManagement.entity.entities.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceInterface<T> {

    List<T> findAllEntity();

    T addEntity(T entity);


}
