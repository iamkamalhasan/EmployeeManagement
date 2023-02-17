package com.example.EmployeeManagement.teams.requests;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class AddTeamRequest {
    private Long id;
    private Long project_id;
    private String name;

}
