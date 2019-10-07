package com.king.hrmsdev.service;




import com.king.hrmsdev.entity.*;
import com.king.hrmsdev.mapper.SlaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * creat By SlaryMapperService 0n 2019/9/21
 */
@Service
public class SlaryMapperService {

    @Autowired
    private SlaryMapperService slaryMapperService;

    @Resource
    private SlaryMapper slaryMapper;

    //通过员工查询考勤信息
    public  EmployReword QuaryRewordByID(int job_id){
        EmployReword er=slaryMapper.QuaryRewordByID(job_id);
        return  er;
    }
    //查询员工的职位和基本工资
    public Position QuaryPositionByJobID(int job_id){
        Position position =slaryMapper.QuaryPositionByJobID(job_id);
        return  position;
    }
    //查询员工的部门
    public String QuaryDepartmentByJobID(int job_id){
    String department=slaryMapper.QuaryDepartmentByJobID(job_id);
    return  department;
    }
    //查询员工的基本信息
    public  Employees QuaryALL(int job_id){
        Employees baseMessage=slaryMapper.QuaryALL(job_id);
        return  baseMessage;
    }
    //计算员工当前工资
    public BigDecimal getSlary(int job_id){
        int overtime;//统计当月加班时间
        int late;//统计迟到次数
        int leaveearly;//统计早退次数
        int leave;//统计请假次数
        int absenteeism;//统计旷工次数
        BigDecimal baseMoney;//职位基础工资
        BigDecimal totalMoney;//总工资
        baseMoney= slaryMapper.QuaryPositionByJobID(job_id).getSalary();
        overtime =slaryMapper.QuaryRewordByID(job_id).getOvertime();
        late=slaryMapper.QuaryRewordByID(job_id).getLate();
        leave=slaryMapper.QuaryRewordByID(job_id).getLeave();
        leaveearly=slaryMapper.QuaryRewordByID(job_id).getLeaveearly();
        absenteeism=slaryMapper.QuaryRewordByID(job_id).getAbsenteeism();
        int money=overtime*22-late*10-leaveearly*20-leave*50-absenteeism*100;
        totalMoney=baseMoney.add(BigDecimal.valueOf(money));
        return  totalMoney;
    }
    //提交员工薪水纪录
    public  void AddSalary(int job_id){
        //获取当前年月
        Calendar cal = Calendar.getInstance();
        String year = String.valueOf(cal.get(Calendar.YEAR));
        String month =  String.valueOf (cal.get(Calendar.MONTH )+1);
        String dateTime=year+'-'+month+"-01";
        Date date=Date.valueOf(dateTime);
        //获取月薪
        BigDecimal bigDecimal= slaryMapperService.getSlary(job_id);
        //添加Salary对象
        Salary salary=new Salary(job_id,bigDecimal,date);
        //存进数据库
        slaryMapper.AddSalary(salary);
   }
   //当job_id的值为空时查询薪资表所有记录
   public List<SalaryList> getSalaryList(int job_id){
        List<SalaryList> salaryLists=new ArrayList<>();
        SalaryList salaryList =new SalaryList();
        if(slaryMapperService.QuaryALL(job_id)!=null){
            salaryList.setEname(slaryMapperService.QuaryALL(job_id).getEname());
        }

    return  salaryLists;
   }
}

