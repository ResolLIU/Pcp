package com.liu.pcp.controller;

import com.liu.pcp.dao.User;
import com.liu.pcp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/regist")
    @ResponseBody
    public String hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        User user = new User();
        user.setId(1);
        user.setUserId("1");
        user.setUserName("1");
        user.setEmail("1");
        user.setPassword("!");
        user.setType(1);
        userMapper.insert(user);
        return userMapper.selectOne(null).getUserName();
    }
}
