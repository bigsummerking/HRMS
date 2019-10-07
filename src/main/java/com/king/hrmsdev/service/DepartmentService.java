package com.king.hrmsdev.service;

import com.king.hrmsdev.entity.DPRelation;
import com.king.hrmsdev.entity.Department;
import com.king.hrmsdev.entity.Position;
import com.king.hrmsdev.mapper.DPRelationMapper;
import com.king.hrmsdev.mapper.DepartmentMapper;
import com.king.hrmsdev.mapper.PositionMapper;
import com.king.hrmsdev.pojo.Peoplecountindepart;
import com.king.hrmsdev.pojo.Vposition;
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
public class DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private PositionMapper positionMapper;
    @Resource
    private DPRelationMapper dpRelationMapper;


    public List<Department> getAllDepartment(){

        List<Peoplecountindepart> peoplecountindepartslist = departmentMapper.getpeoplecountindepart();
        for(int i=0;i<peoplecountindepartslist.size();i++){
            departmentMapper.updateemployeecount(peoplecountindepartslist.get(i));
        }
        List<Department> alldepartmentslist = departmentMapper.findall();
        return alldepartmentslist;
    }


    public List<Department> findDepartmentBycondition(Department department){
        List<Department> fitdepartmentslist = departmentMapper.findBycondition(department);
        return fitdepartmentslist;
    }

    public int dismissdepart(int id){
        dpRelationMapper.deletebydepartid(id);
        int flag = departmentMapper.dismissdepart(id);
        return flag;
    }

    public int recoverdepart(int id){
        int flag = departmentMapper.recoverdepart(id);
        return flag;
    }

    public int adddepartment(Department department){
        int flag = departmentMapper.adddepartment(department);
        return flag;
    }

    public int updatedepartment (Department department ){
        int flag = departmentMapper.updatedepartment(department);
        return flag;
    }


    public List<Position> getAllPosition(){
        List<Position> allpositionslist = positionMapper.findall();
        return allpositionslist;
    }

    public List<Vposition> findPositionBycondition(Vposition vposition){
        List<Vposition> fitpositionslist = positionMapper.findBycondition(vposition);
        return  fitpositionslist;
    }

    public List<Vposition>  findBydepartmentid(Vposition vposition){
        List<Vposition> fitpositionslist = positionMapper.findBydepartmentid(vposition);
        return  fitpositionslist;
    }


//    public int deleteposition(int id){
//        int flag=0;
//        Vposition vposition=dpRelationMapper.findbyid(id);
//        dpRelationMapper.deletebyid(id);
//        if(dpRelationMapper.findbyposition(vposition.getPosition_id()).isEmpty()){
//            flag = positionMapper.deleteposition(id);
//        }
//        return flag;
//    }

    public int deleteposition(int id){

        int flag = positionMapper.deleteposition(id);

        return flag;
    }

    public int addposition(Position position){
        int flag = positionMapper.addposition(position);
        return flag;
    }

    public int updateposition(Vposition vposition){
        int flag = dpRelationMapper.updateDPRelation(vposition);
        return flag;
    }

    public List<Vposition> getAllVposition(){
        List<Vposition> allvpositionslist = dpRelationMapper.findbyall();
        return  allvpositionslist;
    }

    public int addDPRelation(DPRelation dpRelation){
        int flag = dpRelationMapper.addDPRelation(dpRelation);
        return flag;
    }

    public int finglastid(){
        int id = positionMapper.finglastid();
        return id;
    }
}
