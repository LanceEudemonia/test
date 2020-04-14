package com.example.demo.druid.controller.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: liyi
 * @date: 2020/3/17 下午6:19
 */
@Data
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String username;
    private String password;
}
