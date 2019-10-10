package com.king.hrmsdev.controller;

import com.alibaba.fastjson.JSONObject;
import com.king.hrmsdev.entity.DPRelation;
import com.king.hrmsdev.entity.Department;
import com.king.hrmsdev.entity.Position;
import com.king.hrmsdev.pojo.Vposition;
import com.king.hrmsdev.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-22
 * @Description: com.king.hrmsdev.controller
 * @version:1.0
 */

@RestController
public class DepartmentManageController {

    @Resource
    private DepartmentService departmentService;

    @ResponseBody
    @RequestMapping(value = "/getallDepartment", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public JSONObject  getAllDepartmentused(){
        List<Department> alldepartmentslistused = departmentService.findallused();

        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "getAllDepartment");
        result.put("alldepartmentslist", alldepartmentslistused);
        System.out.println(result.toJSONString());

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/getallDepartments", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public JSONObject  getAllDepartment(){
        List<Department> alldepartmentslist = departmentService.getAllDepartment();

        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "getAllDepartment");
        result.put("alldepartmentslist", alldepartmentslist);

        System.out.println("******");
        System.out.println(result.toJSONString());
        System.out.println("******");

        return result;
    }

    @RequestMapping(value = "/getfitDepartment", method = RequestMethod.POST)
    public List<Department> findDepartmentBycondition(@RequestParam(value="department_id",required = false) String department_id,
                                                      @RequestParam(value="department_name",required = false) String  department_name,
                                                      @RequestParam(value="department_manager",required = false) String department_manager,
                                                      @RequestParam(value="department_state",required = false) String department_state){
        System.out.println("******");
        System.out.println("department_id--->"+department_id);
        System.out.println("department_name--->"+department_name);
        System.out.println("department_manager--->"+department_manager);
        System.out.println("department_state--->"+department_state);
        System.out.println("******");
        Department department =new Department();
        if(!(department_id.equals("") ||department_id.equals(null))){
            int id = Integer.valueOf(department_id);
            department.setDepartment_id(id);
        }
        if(!(department_state.equals("") ||department_state.equals(null))){
            int state = Integer.valueOf(department_state);
            department.setState(state);
        }else{
            //如果状态未接收，默认状态404不存在
            department.setState(404);
        }
        if(!(department_name.equals("") ||department_name.equals(null))){
            department.setDepartment(department_name);
        }
        if(!(department_manager.equals("") ||department_manager.equals(null))){
            department.setManager(department_manager);
        }

        List<Department> fitdepartmentslist = departmentService.findDepartmentBycondition(department);
        return fitdepartmentslist;
    }

    @RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
    public int adddepartment(@RequestParam(value="department_name") String department_name,
                             @RequestParam(value="manager") String manager){
        Department department =new Department();
        department.setDepartment(department_name);
        department.setManager(manager);
        int flag = departmentService.adddepartment(department);
        return flag;
    }

    @RequestMapping(value = "/updateDepartment", method = RequestMethod.POST)
    public int updateemployeecount(@RequestParam(value="department_id") int department_id,
                                   @RequestParam(value="department_name") String department_name,
                                   @RequestParam(value="manager") String manager){
        Department department =new Department();
        department.setDepartment_id(department_id);
        department.setDepartment(department_name);
        department.setManager(manager);
        int flag = departmentService.updatedepartment(department);
        return flag;
    }

    @RequestMapping(value = "/dismissDepartment", method = RequestMethod.POST)
    public int dismissdepart(@RequestParam(value="department_id") int department_id){
        int flag = departmentService.dismissdepart(department_id);
        return flag;
    }

    @RequestMapping(value = "/recoverDepartment", method = RequestMethod.POST)
    public int recoverdepart(@RequestParam(value="department_id") int department_id){
        int flag = departmentService.recoverdepart(department_id);
        return flag;
    }



    @RequestMapping(value = "/getfitPosition", method = RequestMethod.POST)
    public List<Vposition> findPositionBycondition(@RequestParam(value="relationship_id",required =false) String relationship_id,
                                                  @RequestParam(value="department_name",required =false) String department_name,
                                                  @RequestParam(value="position_name",required =false) String position_name){
        Vposition vposition = new Vposition();

        if(!(relationship_id.equals("") ||relationship_id.equals(null))){
            int id = Integer.valueOf(relationship_id);
            vposition.setRelationship_id(id);
        }

        vposition.setDepartment_name(department_name);
        vposition.setPosition_name(position_name);

        System.out.println(vposition);

        List<Vposition> fitpositionslist = departmentService.findPositionBycondition(vposition);

        return fitpositionslist;
    }


    @RequestMapping(value = "/getPositionByDepartmentId", method = RequestMethod.POST)
    public List<Vposition> findBydepartmentid(@RequestParam(value="department_id",required =false) String department_id){

        Vposition vposition1 = new Vposition();

        if(!(department_id.equals("") ||department_id.equals(null))){
            int id = Integer.valueOf(department_id);
            System.out.println("部门号  "+id);
            vposition1.setDepartment_id(id);
        }

        System.out.println(vposition1);

        List<Vposition> positionslist = departmentService.findBydepartmentidinused(vposition1);

        return positionslist;
    }

//    @RequestMapping(value = "/deleteposition", method = RequestMethod.POST)
//    public int deleteposition(@RequestParam(value="relationship_id") int relationship_id){
//        int flag = departmentService.deleteposition(relationship_id);
//        return flag;
//    }

    @RequestMapping(value = "/deleteposition", method = RequestMethod.POST)
    public int deleteposition(@RequestParam(value="position_id") int position_id){
        int flag = departmentService.deleteposition(position_id);
        return flag;
    }

    @RequestMapping(value = "/addposition", method = RequestMethod.POST)
    public int addposition(@RequestParam(value="position_name") String position_name,
                           @RequestParam(value="salary") String salary,
                           @RequestParam(value="department_id") int department_id){

        BigDecimal position_alary =new BigDecimal(salary);

        Position position =new Position();
        position.setPosition(position_name);
        position.setSalary(position_alary);
        departmentService.addposition(position);
        int position_id = departmentService.finglastid();
        System.out.println("position_id:"+position_id);

        DPRelation dpRelation =new DPRelation();
        dpRelation.setPosition_id(position_id);
        dpRelation.setDepartment_id(department_id);
        int flag = departmentService.addDPRelation(dpRelation);
        return flag;
    }

    @RequestMapping(value = "/updateposition", method = RequestMethod.POST)
    public int updateposition(@RequestParam(value="relationship_id") int relationship_id,
                              @RequestParam(value="position_name") String position_name,
                              @RequestParam(value="department_id") int department_id,
                              @RequestParam(value="salary") String salary){

        BigDecimal position_alary =new BigDecimal(salary);

        Vposition vposition =new Vposition();
        vposition.setRelationship_id(relationship_id);
        vposition.setPosition_name(position_name);
        vposition.setDepartment_id(department_id);
        vposition.setSalary(position_alary);

        int flag = departmentService.updateposition(vposition);

        return flag;
    }

    @ResponseBody
    @RequestMapping(value = "/getallPosition", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public JSONObject  getAllVposition(){
        List<Vposition> allvpositionslist = departmentService.getAllVposition();

        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "getAllVposition");
        result.put("allvpositionslist", allvpositionslist);

        System.out.println("******");
        System.out.println(result.toJSONString());
        System.out.println("******");

        return result;
    }



}
