package com.example.thi_spring_boot.service;

import com.example.thi_spring_boot.entity.Employee;
import com.example.thi_spring_boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
