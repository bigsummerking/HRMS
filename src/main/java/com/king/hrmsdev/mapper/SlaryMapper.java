package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;


/**
 * creat By SlaryMapper 0n 2019/9/21
 */
@Mapper
public interface SlaryMapper {
     EmployReword QuaryRewordByID(int job_id);//查询员工的考勤信息
    Position  QuaryPositionByJobID(int job_id);//查询员工的职位和基本工资
    String QuaryDepartmentByJobID(int job_id);//查询员工的部门
    Employees QuaryALL(int job_id);//查询员工的基本信息
    void  AddSalary(Salary salary);//向数据库添加薪水纪录

}
