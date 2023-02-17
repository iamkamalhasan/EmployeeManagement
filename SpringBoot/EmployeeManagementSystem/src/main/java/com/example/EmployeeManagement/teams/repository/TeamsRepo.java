package com.example.EmployeeManagement.teams.repository;

import com.example.EmployeeManagement.project.Enums.ProjectType;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.teams.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamsRepo extends JpaRepository<Teams,Long> {

    List<Teams> findByProject(Long Id);

}
