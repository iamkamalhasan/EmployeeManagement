package com.example.EmployeeManagement.jobs.controller;

import com.example.EmployeeManagement.jobs.requests.JobsRequest;
import com.example.EmployeeManagement.jobs.response.JobsResponse;
import com.example.EmployeeManagement.jobs.service.JobsService;
import com.example.EmployeeManagement.project.entity.Project;
import com.example.EmployeeManagement.project.requests.AddProjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/jobs")
public class JobsController {
    @Autowired
    JobsService jobsService;

    @PostMapping("/add/jobs")
    public ResponseEntity<JobsResponse> addEntities(@RequestBody JobsRequest eReq) {
        return new ResponseEntity<>(jobsService.addEntity(eReq), HttpStatus.OK);
    }
    @GetMapping("/find/all")
    public ResponseEntity<List<JobsResponse>> findAllEntity(){
        return new ResponseEntity<List<JobsResponse>>(jobsService.findAllEntity(),HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<JobsResponse> findById(@PathVariable(name = "id")Long id){
        return new ResponseEntity<>(jobsService.findById(id),HttpStatus.OK);
    }
//    @PutMapping("update/jobs")
//    public ResponseEntity<JobsResponse> updateEntity(@RequestBody JobsRequest eReq){
//        return new ResponseEntity<>(jobsService.updateEntity(eReq),HttpStatus.OK);
//    }

}
