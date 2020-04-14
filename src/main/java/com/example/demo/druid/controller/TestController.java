package com.example.demo.druid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author: liyi
 * @date: 2020/3/17 下午1:38
 */
@RestController
public class TestController {
    @Resource(name = "dataSource1")
    private DataSource dataSource;


    @GetMapping("/hello1")
    public String hello() {

        return "hello world" + dataSource;
    }

    @RequestMapping("/hello2")
    public String hello2() {

        return "hello world";
    }
}
