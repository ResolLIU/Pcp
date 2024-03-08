package com.liu.pcp.controller;

import com.liu.pcp.dao.User;
import com.liu.pcp.dao.request.RegistRequest;
import com.liu.pcp.dao.response.Response;
import com.liu.pcp.mapper.UserMapper;
import com.liu.pcp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/regist")
    @ResponseBody
    public Response regist(RegistRequest request){
        return userService.regist(request);
    }
}
