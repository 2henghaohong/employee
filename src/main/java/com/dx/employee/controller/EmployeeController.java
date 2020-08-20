package com.dx.employee.controller;

import com.dx.employee.pojo.Employee;
import com.dx.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/index")
    public String index(){
        return "employee";
    }

    @RequestMapping("/GetEmployeeInfo")
    @ResponseBody
    public List GetEmployeeInfo() {
        List<Employee> employeeList = employeeService.getEmployeeInfo();
        return employeeList;
    }

    @GetMapping("/SearchEmployeeByDate")
    @ResponseBody
    public List SearchEmployeeByDate(@RequestParam String startDate, @RequestParam String endDate) {
        System.out.println(endDate);
        List<Employee> employeeList = employeeService.searchEmployeeByDate(startDate,endDate);
        return employeeList;
    }

}
