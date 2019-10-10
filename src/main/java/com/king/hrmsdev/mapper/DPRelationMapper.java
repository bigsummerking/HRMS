package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.DPRelation;
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
public interface DPRelationMapper {
    List<Vposition> findbyall();
    List<DPRelation> findbyposition(int id);
    int deletebypositionid(int id);
    int deletebydepartid(int id);
    int deletebyid(int id);
    int addDPRelation(DPRelation dpRelation);
    int updateDPRelation(Vposition vposition);
    Vposition findbyid(int id);

}
