package com.example.EmployeeManagement.timesheet.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="teams")
@Data
@Entity
public class TimeSheet {

    @Column(name="approval_status")
    private String status;

    
}
