package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.Employee;
import com.king.hrmsdev.pojo.Vemployee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.mapper
 * @version:1.0
 */
@Mapper
public interface EmployeeMapper {
     List<Vemployee> findall();
     Employee findByid(int id);
     List<Vemployee> findBycondition(Employee employee);
     int updateEmployee(Employee employee);
     int addEmployee(Employee employee);
     int dismissEmployee (int  id);
     int recoverEmployee (int  id);
     int updateEmployeefordepartment(Map map);
}
