package com.liu.pcp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liu.pcp.mapper")
public class PcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcpApplication.class, args);
    }

}
