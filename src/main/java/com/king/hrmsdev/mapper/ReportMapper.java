package com.king.hrmsdev.mapper;

import com.king.hrmsdev.pojo.ReportSalary;
import com.king.hrmsdev.pojo.employee_check;
import com.king.hrmsdev.pojo.employee_salary;
import org.apache.ibatis.annotations.Mapper;

import com.king.hrmsdev.pojo.employee_counts;

import java.util.List;

/**
 * creat By ReportMapper 0n 2019/9/21
 */
@Mapper
public interface ReportMapper {
    List<employee_counts> depart_employee_count();
    List<employee_salary> depart_employee_salary();
    List<ReportSalary> employee_salaryTop5();
    List<employee_check> employee_echeck();


}
