package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping
    public List<Employee> getEmployees()
    {
        return service.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id)
    {
        return service.getEmployee(id);
    }

}