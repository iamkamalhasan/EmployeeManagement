package com.example.EmployeeManagement.teams.service;

import com.example.EmployeeManagement.teams.entity.Teams;
import com.example.EmployeeManagement.teams.repository.TeamsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsService implements TeamsServiceInterface{

    @Autowired
    TeamsRepo teamsRepo;
    @Override
    public List<Teams> findAllEntity() {
        return teamsRepo.findAll();
    }
    @Override
    public Teams addEntity(Teams entity) {
        return teamsRepo.save(entity);
    }

    @Override
    public Teams removeEntity(Long Id) {
        return null;
    }

    @Override
    public void deleteEntity(Long Id) {
        teamsRepo.deleteById(Id);
    }

    @Override
    public Teams updateEntity(Teams entity) {
        return teamsRepo.save(entity);
    }

    @Override
    public Teams findById(Long Id) {
        return null;
    }
}
