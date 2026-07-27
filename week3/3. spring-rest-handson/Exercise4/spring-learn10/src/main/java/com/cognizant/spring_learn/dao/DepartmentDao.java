package com.cognizant.spring_learn.dao;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.model.Department;

@Repository
public class DepartmentDao {

    private static ArrayList<Department> DEPARTMENT_LIST;

    @SuppressWarnings("unchecked")
    public DepartmentDao() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        DEPARTMENT_LIST =
                (ArrayList<Department>) context.getBean("departmentList");

        context.close();
    }

    public ArrayList<Department> getAllDepartments() {

        System.out.println("DepartmentDao : getAllDepartments()");

        return DEPARTMENT_LIST;

    }

}