package com.exsim_be.config;

import com.exsim_be.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 贾楠
 * @version 1.0
 * @date 2022-10-07
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**/user/**","/**/auth/logout","/**/file/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
