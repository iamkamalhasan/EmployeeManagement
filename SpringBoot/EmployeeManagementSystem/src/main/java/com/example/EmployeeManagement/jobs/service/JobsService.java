package com.example.EmployeeManagement.jobs.service;


import com.example.EmployeeManagement.jobs.entity.Jobs;
import com.example.EmployeeManagement.jobs.requests.JobsRequest;
import com.example.EmployeeManagement.jobs.response.JobsResponse;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.List;

public interface JobsService {
    public List<JobsResponse> findAllEntity();

    public JobsResponse findById(Long Id);

    public JobsResponse updateEntity(Long Id);

    public JobsResponse addEntity(JobsRequest jobsRequest);
}