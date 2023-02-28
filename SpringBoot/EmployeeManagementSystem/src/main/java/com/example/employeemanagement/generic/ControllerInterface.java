package com.example.employeemanagement.generic;

import org.springframework.http.ResponseEntity;

import java.util.List;
public interface ControllerInterface <T>{

    ResponseEntity<List<T>> findAllEntity();

    ResponseEntity<T> addEntity( T entity);

    ResponseEntity<?> deleteEntity( Long Id);

    ResponseEntity<T> updateEntity( T entity);
}
