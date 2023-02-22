package com.example.EmployeeManagement.jobs.requests;

import com.example.EmployeeManagement.jobs.entity.Jobs;
import com.example.EmployeeManagement.jobs.response.JobsResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class JobsRequest {
    private long id;

    private String jobName;

    private String startDate;

    private String endDate;

    private int estimatedHours;

    private int ratePerHour;

    private String billable;

    private String job_Status;


}
