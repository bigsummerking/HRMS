package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.Employee;
import com.king.hrmsdev.entity.Role;
import com.king.hrmsdev.pojo.Roleinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 2015-2019, XXX有限公司
 * @ClassName: RoleMapper
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2019/10/10 10:38
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Mapper
public interface RoleMapper {
    public List<Roleinfo> Findallrole();//查询所有role

    public Roleinfo FindByroleID(int job_id);//通过员工ID查询员工信息

    public String FindRealname(String realname);//通过员工姓名查询员工信息

    public int Insertinformation(Role job_id);//插入role表信息

    public int Insertrole(Employee job_id);//插入role表信息

    public int Updaterole(Role job_id);//通过工号id修改role数据//可能有bug

    public int deleterole(int role_id);//通过role_id删除role数据

    public List<Roleinfo> RoleFuzzyRole(Map map);//模糊条件查询
}
