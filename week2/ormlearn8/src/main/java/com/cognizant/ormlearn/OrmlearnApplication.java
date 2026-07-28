package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmlearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmlearnApplication.class);

    private static EmployeeService employeeService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmlearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);

        // Uncomment one test at a time

        testGetAllPermanentEmployees();

        // testGetAverageSalary();

        // testGetAverageSalaryByDepartment();

        // testGetAllEmployeesNative();
    }

    /**
     * HQL Query
     */
    public static void testGetAllPermanentEmployees() {

        LOGGER.info("Start");

        List<Employee> employees =
                employeeService.getAllPermanentEmployees();

        LOGGER.debug("Permanent Employees : {}", employees);

        employees.forEach(employee -> {
            LOGGER.debug("Department : {}", employee.getDepartment());
            LOGGER.debug("Skills : {}", employee.getSkillList());
        });

        LOGGER.info("End");
    }

    /**
     * HQL Aggregate Function
     */
    public static void testGetAverageSalary() {

        LOGGER.info("Start");

        double avgSalary =
                employeeService.getAverageSalary();

        LOGGER.debug("Average Salary : {}", avgSalary);

        LOGGER.info("End");
    }

    /**
     * HQL Aggregate Function with Department Id
     */
    public static void testGetAverageSalaryByDepartment() {

        LOGGER.info("Start");

        int departmentId = 1;

        double avgSalary =
                employeeService.getAverageSalary(departmentId);

        LOGGER.debug("Average Salary of Department {} : {}",
                departmentId, avgSalary);

        LOGGER.info("End");
    }

    /**
     * Native SQL Query
     */
    public static void testGetAllEmployeesNative() {

        LOGGER.info("Start");

        List<Employee> employees =
                employeeService.getAllEmployeesNative();

        LOGGER.debug("Employees : {}", employees);

        LOGGER.info("End");
    }

}