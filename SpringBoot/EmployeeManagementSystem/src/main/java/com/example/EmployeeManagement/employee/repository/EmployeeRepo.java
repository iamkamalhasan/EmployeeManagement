package com.example.EmployeeManagement.employee.repository;

import com.example.EmployeeManagement.employee.enity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
