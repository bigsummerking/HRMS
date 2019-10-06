package com.king.hrmsdev.controller;

import com.alibaba.fastjson.JSONObject;
import com.king.hrmsdev.entity.Employee;
import com.king.hrmsdev.entity.JobChange;
import com.king.hrmsdev.pojo.Vemployee;
import com.king.hrmsdev.pojo.Vjobchange;
import com.king.hrmsdev.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-22
 * @Description: com.king.hrmsdev.controller
 * @version:1.0
 */
@RestController
public class EmployeeManageController {
    @Resource
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "/getallEmployee", method = RequestMethod.POST)
    public JSONObject getAllEmployee(){
        List<Vemployee> allemployeeslist = employeeService.getAllEmployee();
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "getAllEmployee");
        result.put("allemployeeslist", allemployeeslist);

        System.out.println("******");
        System.out.println(result.toJSONString());
        System.out.println("******");

        return result;
    }

    @RequestMapping(value = "/getfitEmployee", method = RequestMethod.POST)
    public List<Employee> findEmployeeBycondition(@RequestParam(value="job_id") String job_id,
                                                  @RequestParam(value="ename") String  ename,
                                                  @RequestParam(value="sex") String sex,
                                                  @RequestParam(value="department_id") String department_id,
                                                  @RequestParam(value="workstate") String workstate){
        Employee employee = new Employee();
        employee.setEname(ename);

        if(!(job_id.equals("") ||job_id.equals(null))){
            int id = Integer.valueOf(job_id);
            employee.setJob_id(id);
        }
        if(!(sex.equals("") ||sex.equals(null))){
            int esex = Integer.valueOf(sex);
            employee.setSex(esex);
        }
        if(!(department_id.equals("") ||department_id.equals(null))){
            int id = Integer.valueOf(department_id);
            employee.setDepartment_id(id);
        }
        if(!(workstate.equals("") ||workstate.equals(null))){
            int eworkstate = Integer.valueOf(workstate);
            employee.setWorkstate(eworkstate);
        }

        List<Employee> fitemployeeslist = employeeService.findEmployeeBycondition(employee);

        return fitemployeeslist;
    }

    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public int updateEmployee(Employee employee){
        int flag = employeeService.updateEmployee(employee);
        return flag;
    }
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public int addEmployee(@RequestParam(value="ename") String ename,
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
        Employee employee =new Employee();
        employee.setEname(ename);
        employee.setSex(Integer.valueOf(sex));
        employee.setNation(nation);
        employee.setAddress(address);
        employee.setHometown(hometown);
        employee.setIdcard(idcard);
        employee.setPhone(phone);
        employee.setBirth(Date.valueOf(birth));
        employee.setEducation(education);
        employee.setDepartment_id(Integer.valueOf(department));
        employee.setPosition_id(Integer.valueOf(position_name));
        employee.setHiredate(Date.valueOf(hiredate));

        int flag = employeeService.addEmployee(employee);
        return flag;
    }
    @RequestMapping(value = "/dismissEmployee", method = RequestMethod.POST)
    public int dismissEmployee(@RequestParam(value="job_id") int job_id){
        int flag = employeeService.dismissEmployee(job_id);
        return flag;
    }

    @RequestMapping(value = "/recoverEmployee", method = RequestMethod.POST)
    public int recoverEmployee(@RequestParam(value="job_id") int job_id){
        int flag = employeeService.recoverEmployee(job_id);
        return flag;
    }

    @RequestMapping(value = "/getAllJobChange", method = RequestMethod.POST)
    public List<Vjobchange> getAllJobChange(){
        List<Vjobchange> alljobChangeslist = employeeService.getAllJobChange();
        return  alljobChangeslist;
    }

    @RequestMapping(value = "/getfitJobChange", method = RequestMethod.POST)
    public List<JobChange> findJobChangeBycondition(@RequestParam(value="change_id") String change_id,
                                                  @RequestParam(value="job_id") String  job_id,
                                                  @RequestParam(value="beforedp_id") String beforedp_id,
                                                  @RequestParam(value="changetime") Date changetime) throws ParseException {
        JobChange jobChange = new JobChange();


        if(!(change_id.equals("") ||change_id.equals(null))){
            int id = Integer.valueOf(change_id);
            jobChange.setChange_id(id);
        }
        if(!(job_id.equals("") ||job_id.equals(null))){
            int id = Integer.valueOf(job_id);
            jobChange.setJob_id(id);
        }
        if(!(beforedp_id.equals("") ||beforedp_id.equals(null))){
            int id = Integer.valueOf(beforedp_id);
            jobChange.setBeforedp_id(id);
        }
        jobChange.setChangetime(changetime);

        List<JobChange> fitjobChangeslist = employeeService.findJobChangeBycondition(jobChange);

        return fitjobChangeslist;
    }

    @RequestMapping(value = "/updatejobchange", method = RequestMethod.POST)
    public int updatejobchange(JobChange jobChange){
        int flag = employeeService.updatejobchange(jobChange);
        return flag;
    }
    @RequestMapping(value = "/deletejobchange", method = RequestMethod.POST)
    public int deletejobchange(int id){
        int flag = employeeService.deletejobchange(id);
        return flag;
    }
    @RequestMapping(value = "/addjobchange", method = RequestMethod.POST)
    public int addjobchange(JobChange jobChange){
        int flag = employeeService.addjobchange(jobChange);
        return flag;
    }


}
