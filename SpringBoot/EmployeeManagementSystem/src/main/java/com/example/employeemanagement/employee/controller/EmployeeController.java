package com.example.employeemanagement.employee.controller;
import com.example.employeemanagement.employee.enity.Employee;
import com.example.employeemanagement.employee.repository.EmployeeRepo;
import com.example.employeemanagement.employee.response.EmployeeResponse;
import com.example.employeemanagement.employee.service.EmployeeServicesInterface;
import com.example.employeemanagement.employeeproject.entity.EmployeeProject;
import com.example.employeemanagement.employee.requests.EmployeeRequest;
import com.example.employeemanagement.employeeproject.service.EmployeeProjectInterface;
import com.example.employeemanagement.project.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeServicesInterface employeeSerives;

    @Autowired
    private EmployeeProjectInterface employeeProjectInterface;

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/find-all")
    public ResponseEntity<List<EmployeeResponse>> findAllEntities() {
        List<Employee> list = employeeSerives.findAllEntity();
        List<EmployeeResponse> responseList = new ArrayList<>();
        list.forEach(e -> {
            EmployeeResponse eResponse = new EmployeeResponse();
            eResponse.setId(e.getId());
            eResponse.setEmployeeName(e.getName());
            List<Long> emp_pro_id = new ArrayList<>();
            for(EmployeeProject d : e.getEmployeeProjects()){
                Project project = d.getProject();
                emp_pro_id.add(project.getId());
            }
            eResponse.setProject_id(emp_pro_id);
            responseList.add(eResponse);
        });

        return new ResponseEntity<List<EmployeeResponse>>(responseList, HttpStatus.OK) ;
    }

    @PostMapping("/add-employee")
    public ResponseEntity<Employee> addEntity(@RequestBody EmployeeRequest eReq) {
        Employee employee = new Employee(eReq);
        employee = employeeSerives.addEntity(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }


}
