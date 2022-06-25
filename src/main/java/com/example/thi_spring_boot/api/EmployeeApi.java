package com.example.thi_spring_boot.api;

import com.example.thi_spring_boot.entity.Employee;
import com.example.thi_spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeApi {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }
}
