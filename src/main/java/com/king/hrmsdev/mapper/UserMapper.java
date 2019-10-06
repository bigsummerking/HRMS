package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.mapper
 * @version:1.0
 */
@Mapper
public interface UserMapper {
     User loginCheck(String username);
     List<User> findall();

}
