package com.liu.pcp.dao.request;

import lombok.Data;

@Data
public class LoginRequest extends Request{
    private String userName;
    private String password;
}
