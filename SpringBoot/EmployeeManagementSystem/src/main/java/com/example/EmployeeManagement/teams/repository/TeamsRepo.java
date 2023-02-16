package com.example.EmployeeManagement.teams.repository;

import com.example.EmployeeManagement.teams.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsRepo extends JpaRepository<Teams,Long> {

}
