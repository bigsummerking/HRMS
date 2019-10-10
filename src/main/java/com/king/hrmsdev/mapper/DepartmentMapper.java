package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.Department;
import com.king.hrmsdev.pojo.Peoplecountindepart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-12
 * @Description: com.king.hrmsdev.mapper
 * @version:1.0
 */
@Mapper
public interface DepartmentMapper {

     List<Department> findall();
     List<Department> findallused();
     Department findByid(int id);
     List<Department> findBycondition(Department department);
     int dismissdepart(int id);
     int recoverdepart(int id);
     int updatedepartment(Department department);
     int adddepartment(Department department);
     int updateemployeecount(Peoplecountindepart peoplecountindepart);
     List<Peoplecountindepart> getpeoplecountindepart();
}
