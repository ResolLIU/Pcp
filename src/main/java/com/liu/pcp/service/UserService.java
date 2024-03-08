package com.liu.pcp.service;

import com.liu.pcp.dao.User;
import com.liu.pcp.dao.request.LoginRequest;
import com.liu.pcp.dao.request.RegistRequest;
import com.liu.pcp.dao.response.Response;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Response login(LoginRequest loginRequest);
    Response regist(RegistRequest registRequest);

    User getUserByUserName(String userName);
    User getUserByEmail(String email);


}
