package com.example.EmployeeManagement.testcode;

import com.example.EmployeeManagement.entity.entities.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public class EntityService <T,Q extends JpaRepository<T,Long>>{

    Q repo;

    private List<T> findAllEntity(){
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
