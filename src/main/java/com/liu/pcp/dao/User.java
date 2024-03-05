package com.liu.pcp.dao;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Time;


@Data
@TableName("`pcp_user`")
public class User {
    private int id;
    private Time createTime;
    private Time updateTime;
    private String userId;
    private String userName;
    private String password;
    private String email;
    private int gender;
    private int age;
    private String address;
    private String userTime;
    private String userInfo;
    private int type;

}
