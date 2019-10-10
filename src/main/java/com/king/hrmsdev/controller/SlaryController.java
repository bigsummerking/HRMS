package com.king.hrmsdev.controller;

import com.king.hrmsdev.entity.Employees;
import com.king.hrmsdev.pojo.SalaryList;
import com.king.hrmsdev.service.SlaryMapperService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

/**
 * creat By SlaryController 0n 2019/9/24
 */
@RestController
public class SlaryController {

        @Resource
        private SlaryMapperService slaryMapperService;

        @RequestMapping(value = "/deleteSalary", method = RequestMethod.POST)
        public  void DeleteSalary(@RequestParam(value = "job_id") Integer job_id){
            slaryMapperService.deleteSalary(job_id);
        }
        @RequestMapping(value = "/FindallSalary", method = RequestMethod.POST)
        //查询所有数据
        public List<SalaryList> FindallSalary(){
            List<SalaryList> lists=slaryMapperService.QuaryAllSalary();
            return  lists;
    }

        @RequestMapping(value = "/AddSalary", method = RequestMethod.POST)
         //向数据库添加薪水纪录
        public void AddSalary(@RequestParam("job_id") Integer job_id,
                              @RequestParam("time")Date date){
            slaryMapperService.AddSalary(job_id,date);
        }

        @RequestMapping(value = "/QuarySalaryList", method = RequestMethod.POST)
        public List<SalaryList> QuarySalaryList(@RequestParam(value = "job_id",required=false) Integer job_id,
                                                @RequestParam(value = "ename",required = false) String ename,
                                                @RequestParam(value="time" ,required = false) String time){
            Employees employees=new Employees();

            employees.setJob_id(job_id);
            employees.setTime(time);
            System.out.println("time==========="+time);
            System.out.println(time);
            if (ename!=""||ename!=null) {
                employees.setEname(ename);
            }
            List<SalaryList>  list=slaryMapperService.QuarySalary(employees);

//
//                if (slaryMapperService.QuaryReword(employees) != null) {
//                    Salary salary = slaryMapperService.QuaryReword(employees);
//                    salaryList.setFinalMoney(salary.getFinasalary());
//                    salaryList.setCheckMoney(salary.getFinasalary().subtract(slaryMapperService.QuaryPositionByJobID(Integer.valueOf(job_id)).getSalary()));
//
//                }
//                salaryList.setJob_id(Integer.valueOf(job_id));
//                salaryList.setEname(slaryMapperService.QuaryALL(Integer.valueOf(job_id)).getEname());
//                salaryList.setPosition(slaryMapperService.QuaryPositionByJobID(Integer.valueOf(job_id)).getPosition());
//                salaryList.setDepartment(slaryMapperService.QuaryDepartmentByJobID(Integer.valueOf(job_id)));
//                salaryList.setBaseMoney(slaryMapperService.QuaryPositionByJobID(Integer.valueOf(job_id)).getSalary());
//
//                int sex = slaryMapperService.QuaryALL(Integer.valueOf(job_id)).getSex();
//                if (sex == 0) {
//                    String ssex = "男";
//                    salaryList.setSex(ssex);
//                } else {
//                    String ssex = "女";
//                    salaryList.setSex(ssex);
//                }
//                System.out.println(salaryList);
//                List.add(salaryList);

            return list;
    }
}
