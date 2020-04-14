package com.example.demo.druid.controller.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author: liyi
 * @date: 2020/3/17 下午6:21
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig1 {
    @Bean(name = "dataSource1")
    public DataSource getDataSource(JdbcProperties jdbcProperties) {
        String password = jdbcProperties.getPassword();
        String url = jdbcProperties.getUrl();
        String username = jdbcProperties.getUsername();

        DruidDataSource source = new DruidDataSource();
        source.setUsername(username);
        source.setPassword(password);
        source.setUrl(url);
        return source;
    }
}
