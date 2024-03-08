package com.liu.pcp.dao.request;

import lombok.Data;

@Data
public class RegistRequest extends Request{
    private String userName;
    private String email;
    private String password;
}
