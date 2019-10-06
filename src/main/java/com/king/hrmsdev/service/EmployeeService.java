package com.king.hrmsdev.service;

import com.king.hrmsdev.entity.Employee;
import com.king.hrmsdev.entity.JobChange;
import com.king.hrmsdev.mapper.EmployeeMapper;
import com.king.hrmsdev.mapper.JobChangeMapper;
import com.king.hrmsdev.pojo.Vemployee;
import com.king.hrmsdev.pojo.Vjobchange;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-22
 * @Description: com.king.hrmsdev.service
 * @version:1.0
 */
@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private JobChangeMapper jobChangeMapper;

    public List<Vemployee> getAllEmployee(){
        List<Vemployee> allemployeeslist = employeeMapper.findall();
        return allemployeeslist;
    }

    public List<Employee> findEmployeeBycondition(Employee employee){
        List<Employee> fitemployeeslist = employeeMapper.findBycondition(employee);
        return fitemployeeslist;
    }
    public int updateEmployee(Employee employee){
        int flag = employeeMapper.updateEmployee(employee);
        return flag;
    }
    public int addEmployee(Employee employee){
        int flag = employeeMapper.addEmployee(employee);
        return flag;
    }
    public int dismissEmployee(int id){
        int flag = employeeMapper.dismissEmployee(id);
        return flag;
    }

    public int recoverEmployee(int id){
        int flag = employeeMapper.recoverEmployee(id);
        return flag;
    }

    public List<Vjobchange> getAllJobChange(){
        List<Vjobchange> alljobChangeslist = jobChangeMapper.findall();
        return alljobChangeslist;
    }

    public List<JobChange> findJobChangeBycondition(JobChange jobChange){
        List<JobChange> fitjobChangeslist = jobChangeMapper.findBycondition(jobChange);
        return fitjobChangeslist;
    }

    public int updatejobchange(JobChange jobChange){
        int flag = jobChangeMapper.updatejobchange(jobChange);
        return flag;

    }
    public int deletejobchange(int id){
        int flag = jobChangeMapper.deletejobchange(id);
        return flag;
    }
    public int addjobchange(JobChange jobChange){
        int flag = jobChangeMapper.addjobchange(jobChange);
        return flag;
    }


}
