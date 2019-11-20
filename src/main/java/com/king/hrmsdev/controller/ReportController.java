package com.king.hrmsdev.controller;


import com.alibaba.fastjson.JSONObject;
import com.king.hrmsdev.pojo.ReportSalary;
import com.king.hrmsdev.pojo.employee_check;
import com.king.hrmsdev.pojo.employee_counts;
import com.king.hrmsdev.pojo.employee_salary;
import com.king.hrmsdev.service.ReportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * creat By ReportController 0n 2019/9/24
 */
@RestController
public class ReportController {

    @Resource
    private ReportService reportService;

    @RequestMapping(value = "/getEmployeecounts",method=RequestMethod.POST)
    //返回各部门总人数
    public JSONObject getEmployeecounts() {
        List<employee_counts>  list= reportService.depart_employee_count();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Employeecounts",list);
        return  jsonObject;
    }

    @RequestMapping(value = "/getEmployeesalary",method=RequestMethod.POST)
    //返回各部门总人数
    public JSONObject getEmployeesalary() {
        List<employee_salary>  list= reportService.depart_employee_salary();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Employeesalary",list);
        return  jsonObject;
    }

    @RequestMapping(value = "/getEmployeesalaryTop5",method=RequestMethod.POST)
    //返回各部门总人数
    public JSONObject getEmployeesalaryTop5() {
        List<ReportSalary>  list= reportService.employee_salaryTop5();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("EmployeesalaryTop5",list);
        return  jsonObject;
    }


    @RequestMapping(value = "/getEmployeecheck",method=RequestMethod.POST)
    //返回各部门总人数
    public JSONObject getEmployeecheck() {
        List<employee_check>  list= reportService.employee_echeck();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Employeecheck",list);
        return  jsonObject;
    }





}

