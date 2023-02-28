package com.example.employeemanagement.generic;



import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceInterface<T> {

    List<T> findAllEntity();

    T addEntity( T entity);

    T removeEntity(Long Id);

    void deleteById(Long Id);

    T updateEntity(T entity);

    T findById(Long Id);


}
