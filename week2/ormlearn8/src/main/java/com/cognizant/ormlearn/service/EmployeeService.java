package com.cognizant.ormlearn.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getAllPermanentEmployees(){

        return repository.getAllPermanentEmployees();

    }

    public double getAverageSalary(){

        return repository.getAverageSalary();

    }

    public double getAverageSalary(int id){

        return repository.getAverageSalary(id);

    }

    public List<Employee> getAllEmployeesNative(){

        return repository.getAllEmployeesNative();

    }

} 