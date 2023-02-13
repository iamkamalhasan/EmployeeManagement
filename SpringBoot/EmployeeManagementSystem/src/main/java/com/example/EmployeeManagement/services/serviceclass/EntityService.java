package com.example.EmployeeManagement.services.serviceclass;

import com.example.EmployeeManagement.entity.entities.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public class EntityService <T,Q extends JpaRepository<T,Long>>{

    @Autowired
    Q repo;

    public List<T> findAllEntity(){
        return repo.findAll();
    }

    public T addEntity(T entity){
        return repo.save(entity);
    }

    public void deleteEntity(Long Id){
        repo.deleteById(Id);
    }

    public T updateEntity(T entity){
        return repo.save(entity);
    }

}
