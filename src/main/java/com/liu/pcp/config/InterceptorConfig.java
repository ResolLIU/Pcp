package com.liu.pcp.config;

import com.liu.pcp.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                //其他接口token验证
                .addPathPatterns("/user/test")
                //所有用户都放心
                .excludePathPatterns("/user/login");
    }
}
