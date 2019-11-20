package com.king.hrmsdev.controller;


import com.alibaba.fastjson.JSONObject;
import com.king.hrmsdev.entity.Department;
import com.king.hrmsdev.pojo.DepartMentAverage;
import com.king.hrmsdev.service.ReportMapperService;
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
    private ReportMapperService reportMapperService;

    @RequestMapping(value = "/getDepartmentToutal",method=RequestMethod.POST)
    //返回各部门总人数
    public JSONObject getDepartmentToutal() {
        List<Department>  list= reportMapperService.getToutal();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("departmentCount",list);
        return  jsonObject;
    }
    //返回各部门旷工总数
    @RequestMapping(value = "/department2",method=RequestMethod.POST)
    public List<Department> getDepartMentCheck(){
        return  reportMapperService.getCheckToutal();
    }
    @RequestMapping(value = "/department3",method=RequestMethod.POST)
    //返回部门平均工资
    public List<DepartMentAverage> getDepartmentAvrage(){
        return reportMapperService.getAverageSalary();
    }

}

