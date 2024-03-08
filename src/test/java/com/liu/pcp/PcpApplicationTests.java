package com.liu.pcp;

import com.liu.pcp.dao.User;
import com.liu.pcp.mapper.UserMapper;
import com.liu.pcp.service.UserService;
import com.liu.pcp.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PcpApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {

    }

}
