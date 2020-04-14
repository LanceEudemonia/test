package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author: liyi
 * @date: 2020/3/27 下午6:04
 */
@Component
@Aspect
public class Advice {
    @Before("execution(* com.example.demo.aop.People.*(..))")
    public void adivice() {
        System.out.println("--aspect begin");
    }

    @DeclareParents(value = "com.example.demo.aop.People+", defaultImpl = OtherPeopleImpl.class)
    public OtherPeople otherPeople;

}
