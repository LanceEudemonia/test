package com.example.demo.druid.controller.config;

import com.example.demo.druid.controller.intecepeter.MyIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: liyi
 * @date: 2020/3/22 下午6:49
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public MyIntercepter myIntercepter() {
        return new MyIntercepter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.myIntercepter()).addPathPatterns("/**");
    }
}
