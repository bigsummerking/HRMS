package com.king.hrmsdev.service;


import com.king.hrmsdev.entity.User;
import com.king.hrmsdev.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-08
 * @Description: com.king.hrms.service
 * @version:1.0
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public String loginCheck(User user){
        String loginflag="";

        User dbuser =userMapper.loginCheck(user.getUsername());

        if(userMapper.loginCheck(user.getUsername())==null){
            loginflag = "nouser";
        }else if(!(dbuser.getPassword().equals(user.getPassword()))){
            loginflag = "errorpass";
        }else if(dbuser.getPassword().equals(user.getPassword())){
            loginflag = "getpass";
        }
        return loginflag;
    }

    public List<User> findall(){
        List<User> userList = userMapper.findall();
        return userList;
    }
}
