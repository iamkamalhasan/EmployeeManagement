package com.example.EmployeeManagement.jobs.repository;

import com.example.EmployeeManagement.jobs.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepo extends JpaRepository<Jobs,Long> {

}
