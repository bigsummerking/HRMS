package com.king.hrmsdev.service;

import com.king.hrmsdev.entity.Employee;
import com.king.hrmsdev.entity.Role;
import com.king.hrmsdev.mapper.RoleMapper;
import com.king.hrmsdev.pojo.Roleinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 2015-2019, XXX有限公司
 * @ClassName: RoleService
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2019/10/10 10:39
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Service
public class RoleService {
    @Resource
    private RoleMapper roleMapper;

    public List<Roleinfo> Findallrole(){
        List<Roleinfo> roleinfoList=roleMapper.Findallrole();
        return roleinfoList;
    }
    public Roleinfo FindByroleID(int job_id){
        Roleinfo role=roleMapper.FindByroleID(job_id);
        return role;
    }
    public String FindRealname(String realname){
        String name=roleMapper.FindRealname(realname);
        return name;
    }
    public int Insertrole(Employee employee){
        int flag=1;
        try {
            roleMapper.Insertrole(employee);
        } catch (Exception e) {
            flag=0;
        }
        finally {
            return flag;
        }
    }
    public int Insertinformation(Role role){
        int flag=1;
        try {
            roleMapper.Insertinformation(role);
        } catch (Exception e) {
            flag=0;
        }
        finally {
            return flag;
        }
    }

    public int Updaterole(Role role){

        int flag=1;
        try {

            roleMapper.Updaterole(role);
        }
        catch (Exception e){
            flag=0;
        }
        finally {
            return flag;
        }

    }//可能有bug

    public int deleterole(int job_id){
        int flag=1;
        try {
            roleMapper.deleterole(job_id);
        } catch (Exception e) {
            flag=0;
        }
        finally {
            return flag;
        }
    }
    public List<Roleinfo> RoleFuzzyrole(Map<String,Object> map){
        Integer job_id = (Integer) map.get("job_id");
        String realname=(String) map.get("realname");



        Map map1=new HashMap();

        map1.put("job_id",job_id);
        map1.put("realname",realname);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");



        List list=roleMapper.RoleFuzzyRole(map1);

        return list;

    }
}
