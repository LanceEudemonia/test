//package com.example.demo.druid.controller.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
///**
// * @author: liyi
// * @date: 2020/3/17 下午6:13
// */
//@Data
//@PropertySource(value = "classpath:jdbc.properties"
//)
//@Configuration
//public class JdbcConfig {
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean
//    public DataSource getDataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setUsername(username);
//        druidDataSource.setUrl(url);
//        druidDataSource.setPassword(password);
//        return druidDataSource;
//
//    }
//}
