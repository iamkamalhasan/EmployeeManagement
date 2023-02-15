package com.example.EmployeeManagement.teams.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="teams")
@Data
@Entity
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    Long Id;
    @Column(name = "team_name")
    String name;
    //@OneToMany(mappedBy = "teams")
}
