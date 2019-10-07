package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.JobChange;
import com.king.hrmsdev.pojo.Vjobchange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-12
 * @Description: com.king.hrmsdev.mapper
 * @version:1.0
 */
@Mapper
public interface JobChangeMapper {
     List<Vjobchange> findall();
     JobChange findByid(int id);
     List<Vjobchange> findBycondition(JobChange jobChange);
     int updatejobchange(JobChange jobChange);
     int deletejobchange(int id);
     int addjobchange(JobChange jobChange);
}
