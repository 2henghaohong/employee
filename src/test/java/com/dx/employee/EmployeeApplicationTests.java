package com.dx.employee;

import com.dx.employee.pojo.Employee;
import com.dx.employee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeeApplicationTests {

    @Autowired
    EmployeeService employeeService;

    @Test
    void contextLoads() {
        List<Employee> list = employeeService.searchEmployeeByDate("1995-1-1","2020-3.23");
        System.out.println(list.size());
    }

}
