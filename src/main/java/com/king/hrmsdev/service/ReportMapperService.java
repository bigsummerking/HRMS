package com.king.hrmsdev.service;


import com.king.hrmsdev.entity.Department;
import com.king.hrmsdev.mapper.ReportMapper;
import com.king.hrmsdev.pojo.DepartMentAverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * creat By ReportMapperService 0n 2019/9/24
 */
@Service
public class ReportMapperService implements ReportMapper {
    private int departmentCount = 7;//部门总个数

    @Resource
    private ReportMapper reportMapper;

    @Autowired
    private ReportMapperService reportMapperService;



    //查询各部门总人数
    @Override
    public Integer QuaryToualByID(int department_id) {
        int count = reportMapper.QuaryToualByID(department_id);
        return count;
    }

    //查询每个部门月旷工次数
    @Override
    public Integer QuaryCheckByID(int department_id) {
        int checkCount = reportMapper.QuaryCheckByID(department_id);
        return checkCount;
    }

    //查询每个部门月总工资
    @Override
    public BigDecimal QuarySlaryByID(int department_id) {
        BigDecimal salaryToutal = reportMapper.QuarySlaryByID(department_id);
        return salaryToutal;
        }

//返回部门名称以及部门总人数
public List<Department> getToutal() {
        List<Department> listDepartment = new ArrayList<>();
        int departmentCount = 7;//部门总个数
        for (int i = 1; i <= departmentCount; i++) {
        Department departMentCount = new Department();
        departMentCount.setCount(reportMapper.QuaryToualByID(i));
        departMentCount.setDepartmentName(reportMapperService.Check(i));
        listDepartment.add(departMentCount);
        }
        return listDepartment;
        }

//返回部门名称，以及员工旷工次数
public List<Department> getCheckToutal() {
        List<Department> listDepartment = new ArrayList<>();
        for (int i = 1; i <= departmentCount; i++) {
        Department departMentCount = new Department();
        if(reportMapper.QuaryCheckByID(i)!=null) {
        departMentCount.setCount(reportMapper.QuaryCheckByID(i));
        }
        departMentCount.setDepartmentName(reportMapperService.Check(i));
        listDepartment.add(departMentCount);
        }
        return listDepartment;
        }

//获取各部门平均薪水
public List<DepartMentAverage> getAverageSalary() {
        List<DepartMentAverage> listDepartment = new ArrayList<>();
        for (int i = 1; i <= departmentCount; i++) {
        DepartMentAverage departmentCheck = new DepartMentAverage();

        if(reportMapperService.QuarySlaryByID(i)!=null && BigDecimal.valueOf(reportMapperService.QuaryToualByID(i))!=null) {
        departmentCheck.setCount(reportMapperService.QuarySlaryByID(i).multiply(BigDecimal.valueOf(reportMapperService.QuaryToualByID(i))));
        }
        departmentCheck.setDepartmentName(reportMapperService.Check(i));
        listDepartment.add(departmentCheck);
        }
        return  listDepartment;
        }
//循环遍历部门ID值
public String Check(int i){
        if(i==1){
        return "工程部";
        }else if(i==2){
        return "事业部";
        }else if(i==3){
        return "秘书部";
        }else if(i==4){
        return  "市场部";
        }else if(i==5){
        return "策划部";
        }else if(i==6){
        return "营销部";
        }else {
        return "人事部";
        }
        }
        }
