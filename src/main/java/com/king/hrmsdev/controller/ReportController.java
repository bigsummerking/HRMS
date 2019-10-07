package com.king.hrmsdev.controller;


import com.king.hrmsdev.entity.DepartMent;
import com.king.hrmsdev.entity.DepartMentAverage;
import com.king.hrmsdev.service.ReportMapperService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * creat By ReportController 0n 2019/9/24
 */
@RestController
public class ReportController {

    @Resource
    private ReportMapperService reportMapperService;

    @RequestMapping(value = "/department1",method=RequestMethod.POST)
    //返回各部门总人数
    public List<DepartMent> getDepartmentToutal() {
        return reportMapperService.getToutal();
    }
    //返回各部门旷工总数
    @RequestMapping(value = "/department2",method=RequestMethod.POST)
    public List<DepartMent> getDepartMentCheck(){
        return  reportMapperService.getCheckToutal();
    }
    @RequestMapping(value = "/department3",method=RequestMethod.POST)
    //返回部门平均工资
    public List<DepartMentAverage> getDepartmentAvrage(){
        return reportMapperService.getAverageSalary();
    }

}

