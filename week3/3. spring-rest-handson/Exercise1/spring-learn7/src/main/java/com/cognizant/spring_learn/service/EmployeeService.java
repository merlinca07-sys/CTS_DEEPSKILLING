package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Employee;

@Service
public class EmployeeService {

    private List<Employee> list = new ArrayList<>();

    public EmployeeService() {

        list.add(new Employee(101, "John", "IT", 50000));
        list.add(new Employee(102, "David", "HR", 45000));
        list.add(new Employee(103, "Mary", "Finance", 60000));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    public Employee getEmployee(int id) {

        for (Employee e : list) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }
}