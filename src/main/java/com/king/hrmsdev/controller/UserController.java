package com.king.hrmsdev.controller;

import com.king.hrmsdev.entity.User;
import com.king.hrmsdev.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.controller
 * @version:1.0
 */
@RestController
public class UserController {


    @Resource
    private UserService userService;


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public List<User> userList() {
        List<User> userlist = userService.findall();

        return userlist;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value="username") String username,
                        @RequestParam(value="password") String password) {
        System.out.println("username:    "+username);
        System.out.println("password:    "+password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        String loginflag = userService.loginCheck(user);
        return loginflag;
    }
}
