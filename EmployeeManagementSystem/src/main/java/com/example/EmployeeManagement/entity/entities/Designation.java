package com.example.EmployeeManagement.entity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="des_id")
    private Long designation_id;
    @Column(name="des_name")
    private String designationName;
    @JsonIgnore
    private Date dataEnteredDateTime = new Date();
}
