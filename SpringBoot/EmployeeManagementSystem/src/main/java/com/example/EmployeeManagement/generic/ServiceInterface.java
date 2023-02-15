package com.example.EmployeeManagement.generic;



import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceInterface<T> {

    List<T> findAllEntity();

    T addEntity( T entity);

    T removeEntity(Long Id);

    void deleteEntity(Long Id);

    T updateEntity(T entity);

    T findById(Long Id);


}
