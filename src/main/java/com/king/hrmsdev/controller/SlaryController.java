package com.king.hrmsdev.controller;

import com.king.hrmsdev.entity.EmployReword;
import com.king.hrmsdev.entity.Employees;
import com.king.hrmsdev.entity.Position;
import com.king.hrmsdev.entity.Salary;
import com.king.hrmsdev.service.SlaryMapperService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * creat By SlaryController 0n 2019/9/24
 */
@RestController
public class SlaryController {

        @Resource
        private SlaryMapperService slaryMapperService;

        @RequestMapping(value = "/user1", method = RequestMethod.POST)
        //查询员工的考勤信息
        public EmployReword QuaryRewordByID(@RequestParam("job_id") int job_id) {
            EmployReword er = slaryMapperService.QuaryRewordByID(job_id);
            return er;
        }
        @RequestMapping(value = "/user2", method = RequestMethod.POST)
        //查询员工的职位和基本工资
        public Position QuaryPositionByJobID(@RequestParam("job_id") int job_id){
          Position position=  slaryMapperService.QuaryPositionByJobID(job_id);
          return  position;
        }
        @RequestMapping(value = "/user3", method = RequestMethod.POST)
         //查询员工的部门
        public String QuaryDepartmentByJobID(@RequestParam("job_id") int job_id){
           String department= slaryMapperService.QuaryDepartmentByJobID(job_id);

        return  department;
      }
        @RequestMapping(value = "/user4", method = RequestMethod.POST)
        //查询员工的基本信息
        public Employees QuaryALL(@RequestParam("job_id") int job_id){
            Employees el=slaryMapperService.QuaryALL(job_id);
            return  el;
        }
     @RequestMapping(value = "/user5", method = RequestMethod.POST)
         //向数据库添加薪水纪录
        public  void AddSalary(@RequestParam("job_id") int job_id){
            slaryMapperService.AddSalary(job_id);
        }

}
