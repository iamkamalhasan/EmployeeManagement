package com.example.EmployeeManagement.entity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long employee_id;
    @Column(name="emp_name")
    private String name;
    @Column(name="dep_id")
    private Long department_id;
    @Column(name="des_id")
    private Long designation_id;
    @Column(name="emp_phoneNum")
    private String phoneNumber;
    @Column(name="emp_email")
    private String email;
    @Column(name="emp_DOB")
    private LocalDate dateOfBirth;
    @Column(name="emp_address")
    private String address;
    @Column(name="emp_status")
    private String status;
    @Column(name="emp_join_date")
    private LocalDate joinDate;
    @Column(name="emp_left_date")
    private LocalDate leftDate;
    @JsonIgnore
    private Date dataEnteredDateTime = new Date();

}
