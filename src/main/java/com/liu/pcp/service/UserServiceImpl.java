package com.liu.pcp.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liu.pcp.dao.User;
import com.liu.pcp.dao.request.LoginRequest;
import com.liu.pcp.dao.request.RegistRequest;
import com.liu.pcp.dao.response.Response;
import com.liu.pcp.mapper.UserMapper;
import com.liu.pcp.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Response login(LoginRequest loginRequest) {
        String userName = loginRequest.getUserName();
        String password = loginRequest.getPassword();
        return new Response("", "");
    }

    @Override
    public Response regist(RegistRequest registRequest) {
        String userName = registRequest.getUserName();
        String password = registRequest.getPassword();
        String email = registRequest.getEmail();
        int check = Utils.checkUserName(userName);
        if (check == -1) {
            return new Response("用户名中不得有特殊字符", "001");
        }
        if (check == -2) {
            return new Response("用户名过长", "002");
        }

        if (!Utils.checkEmail(email)) {
            return new Response("邮箱不合法", "003");
        }
        User user = getUserByUserName(userName);
        if (user != null) {
            return new Response("用户名已被使用", "004");
        }
        user = getUserByEmail(email);
        if (user != null) {
            return new Response("邮箱已被使用", "004");
        }
        User newUser = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        if (userMapper.insert(user)==1){
            return new Response("注册成功", "200");
        }else{
            return new Response("注册失败", "500");
        }
    }

    @Override
    public User getUserByUserName(String userName) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", userName);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public User getUserByEmail(String email) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email", email);
        return userMapper.selectOne(queryWrapper);
    }
}
