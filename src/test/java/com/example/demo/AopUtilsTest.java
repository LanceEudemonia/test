package com.example.demo;

import com.example.demo.aop.OtherPeople;
import com.example.demo.aop.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;

/**
 * @author: liyi
 * @date: 2020/3/28 上午11:17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AopUtilsTest {
    @Autowired
    private People people;

    @Test
    public void testAop() throws NoSuchMethodException {
        assert (AopUtils.isAopProxy(people));
        assert (AopUtils.isCglibProxy(people));
        System.out.println(people.getClass());
        System.out.println(AopUtils.getTargetClass(people));
        System.out.println(people.getClass().getMethod("life"));
        Method life = AopUtils.getMostSpecificMethod(people.getClass().getMethod("life"), AopUtils.getTargetClass(people));
        System.out.println(life);
    }

    @Test
    public void add() {
        ((OtherPeople)people).addMethod();
    }
}
