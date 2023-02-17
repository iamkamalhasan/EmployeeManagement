package com.example.EmployeeManagement.teams.service;

import com.example.EmployeeManagement.generic.ServiceInterface;
import com.example.EmployeeManagement.teams.entity.Teams;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamsServiceInterface extends ServiceInterface<Teams> {

    public List<Teams> findByProject(Long Id);
}
