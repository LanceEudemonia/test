package com.example.demo.druid.controller.config;

import com.example.demo.aop.ITPeople;
import com.example.demo.aop.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: liyi
 * @date: 2020/3/28 上午11:07
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {
    @Bean
    public People target() {
        return new ITPeople();
    }
}
