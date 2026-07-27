package com.cognizant.spring_learn.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.model.Employee;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {

        EMPLOYEE_LIST.add(new Employee(101,"John","IT",50000));
        EMPLOYEE_LIST.add(new Employee(102,"David","HR",45000));
        EMPLOYEE_LIST.add(new Employee(103,"Mary","Finance",60000));
        EMPLOYEE_LIST.add(new Employee(104,"James","IT",55000));

    }

    public ArrayList<Employee> getAllEmployees() {

        return EMPLOYEE_LIST;

    }

}