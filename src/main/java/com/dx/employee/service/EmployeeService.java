package com.dx.employee.service;

import com.dx.employee.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployeeInfo();

    public List<Employee> searchEmployeeByDate(String startDate,String endDate);
}
