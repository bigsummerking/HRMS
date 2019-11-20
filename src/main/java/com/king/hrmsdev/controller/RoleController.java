package com.king.hrmsdev.controller;

import com.alibaba.fastjson.JSONObject;
import com.king.hrmsdev.entity.Employee;
import com.king.hrmsdev.entity.Role;
import com.king.hrmsdev.pojo.Roleinfo;
import com.king.hrmsdev.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 2015-2019, XXX有限公司
 * @ClassName: RoleController
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2019/10/10 10:38
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@RestController
public class RoleController {
    @Resource
    private RoleService roleService;

    @RequestMapping(value = "/Findallrole", method = RequestMethod.POST)
    public JSONObject roleList(){
        List<Roleinfo> FindallList = roleService.Findallrole();
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "roleList");
        result.put("allroleinfolist",FindallList);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(result.toJSONString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        return result;
    }
    @RequestMapping(value = "/FindByroleID", method = RequestMethod.POST)
    public Roleinfo FindByroleID(@RequestParam("job_id") int job_id){

        Roleinfo FindByroleIDinfo =roleService.FindByroleID(job_id);
        return FindByroleIDinfo;
    }
    @RequestMapping(value = "/FindRealname", method = RequestMethod.POST)
    public String FindRealname(@RequestParam("realname") String realname){

        String FindRealname=roleService.FindRealname(realname);
        return FindRealname;

    }
    @RequestMapping(value = "/Insertrole", method = RequestMethod.POST)
    public int Insertrole(@RequestParam(value="ename") String ename,
                          @RequestParam(value="sex") String sex,
                          @RequestParam(value="nation") String nation,
                          @RequestParam(value="address") String address,
                          @RequestParam(value="hometown") String hometown,
                          @RequestParam(value="idcard") String idcard,
                          @RequestParam(value="phone") String phone,
                          @RequestParam(value="birth") String birth,
                          @RequestParam(value="education") String education,
                          @RequestParam(value="department") String department,
                          @RequestParam(value="position_name") String position_name,
                          @RequestParam(value="hiredate") String hiredate){

        System.out.println(birth);
        System.out.println(hiredate);
        Employee role =new Employee();
        role.setEname(ename);
        role.setSex(Integer.valueOf(sex));
        role.setNation(nation);
        role.setAddress(address);
        role.setHometown(hometown);
        role.setIdcard(idcard);
        role.setPhone(phone);
        role.setBirth(Date.valueOf(birth));
        role.setEducation(education);
        role.setDepartment_id(Integer.valueOf(department));
        role.setPosition_id(Integer.valueOf(position_name));
        role.setHiredate(Date.valueOf(hiredate));

        int flag = roleService.Insertrole(role);
        return flag;
    }
    @RequestMapping(value = "/Insertinformation", method = RequestMethod.POST)
    public int Insertinformation(@RequestParam(value = "job_id",required=false,defaultValue="") Integer job_id,
                          @RequestParam("realname") String realname,
                          @RequestParam("role_id") int role_id){
        Role role = new Role();

        if (job_id != null) {

            role.setJob_id(job_id);
        }
        role.setJob_id(job_id);
        role.setRealname(realname);
        role.setRole_id(role_id);

        System.out.println("role:" + role);

        int flag = roleService.Insertinformation(role);
        System.out.println("flag:" + flag);
        return flag;

    }
    @RequestMapping(value = "/Updaterole", method = RequestMethod.POST)
    public int Updaterole(@RequestParam("job_id") Integer job_id,
                            @RequestParam("realname") String realname,
                            @RequestParam("role_id") Integer role_id){
        Role role=new Role();

        if (job_id != null) {

            role.setRole_id(role_id);
        }

        role.setJob_id(job_id);
        role.setRealname(realname);
        role.setRole_id(role_id);

        int flag=roleService.Updaterole(role);
        return flag;


    }


    @RequestMapping(value = "/deleterole", method = RequestMethod.POST)
    public int deleterole(@RequestParam("job_id") int job_id){

        int flag=roleService.deleterole(job_id);
        return flag;

    }
    @RequestMapping(value = "/RoleFuzzyrole", method = RequestMethod.POST)
    public List<Roleinfo> RoleFuzzyrole(@RequestParam(value = "job_id",required=false,defaultValue="") Integer job_id,
                                              @RequestParam(value = "role_id",required=false,defaultValue="") Integer role_id,
                                              @RequestParam(value = "realname",required=false) String realname

    ){



        Map map=new HashMap();
        map.put("job_id",job_id);
        map.put("role_id",role_id);
        map.put("realname",realname);

        List list=roleService.RoleFuzzyrole(map);

        return list;

    }
}
