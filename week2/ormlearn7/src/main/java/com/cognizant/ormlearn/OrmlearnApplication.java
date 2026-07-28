package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmlearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmlearnApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmlearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);

        LOGGER.info("Inside Main");

        

        testGetEmployee();

        testAddEmployee();

        testGetDepartment();

    }

    /**
     * Hands-on 4
     * Test Many-to-One Mapping
     */
    private static void testGetEmployee() {

        LOGGER.info("Start");

        Employee employee = employeeService.get(1);

        LOGGER.debug("Employee : {}", employee);

        LOGGER.debug("Department : {}", employee.getDepartment());

        LOGGER.info("End");
    }

    /**
     * Hands-on 4
     * Add Employee
     */
    private static void testAddEmployee() {

        LOGGER.info("Start");

        Department department = departmentService.get(3);

        Employee employee = new Employee();

        employee.setName("Alex");
        employee.setSalary(65000);
        employee.setPermanent(true);
        employee.setDepartment(department);

        employeeService.save(employee);

        LOGGER.info("Employee Added Successfully");

        LOGGER.info("End");
    }

    /**
     * Hands-on 5
     * Test One-to-Many Mapping
     */
    private static void testGetDepartment() {

        LOGGER.info("Start");

        Department department = departmentService.get(1);

        LOGGER.debug("Department : {}", department);

        LOGGER.debug("Employees : {}", department.getEmployeeList());

        LOGGER.info("End");
    }

}