package com.dx.employee.service.impl;

import com.dx.employee.mapper.EmployeeMapper;
import com.dx.employee.pojo.Employee;
import com.dx.employee.pojo.EmployeeExample;
import com.dx.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployeeInfo() {
        return employeeMapper.selectByExample(null);
    }

    @Override
    public List<Employee> searchEmployeeByDate(String startDate, String endDate) {
        List<Employee> list = null;
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEntrydateBetween(startDate,endDate);
        list = employeeMapper.selectByExample(employeeExample);
        return list;
    }
}
