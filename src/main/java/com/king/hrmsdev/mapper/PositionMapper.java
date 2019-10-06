package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.Position;
import com.king.hrmsdev.pojo.Vposition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-12
 * @Description: com.king.hrmsdev.mapper
 * @version:1.0
 */
@Mapper
public interface PositionMapper {

     List<Position> findall();
     Position findByid(int id);
     List<Vposition> findBycondition(Vposition vposition);
     int deleteposition(int id);
     int addposition(Position position);
     List<Vposition> findBydepartmentid(Vposition vposition);

}

