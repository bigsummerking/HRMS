package com.king.hrmsdev.service;



import com.king.hrmsdev.mapper.ReportMapper;
import com.king.hrmsdev.pojo.ReportSalary;
import com.king.hrmsdev.pojo.employee_counts;
import com.king.hrmsdev.pojo.employee_salary;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * creat By ReportMapperService 0n 2019/9/24
 */
@Service
public class ReportService implements ReportMapper {

    @Resource
    private ReportMapper reportMapper;


    //查询各部门总人数
    @Override
    public List<employee_counts> depart_employee_count() {
        List<employee_counts> countsList = reportMapper.depart_employee_count();
        return countsList;
    }

    @Override
    public List<employee_salary> depart_employee_salary() {
        List<employee_salary> salaryList = reportMapper.depart_employee_salary();
        return salaryList;
    }

    @Override
    public List<ReportSalary> employee_salaryTop5() {
        List<ReportSalary> Top5List = reportMapper.employee_salaryTop5();
        return Top5List;
    }


}
