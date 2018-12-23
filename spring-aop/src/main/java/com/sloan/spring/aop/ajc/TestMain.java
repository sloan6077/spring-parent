package com.sloan.spring.aop.ajc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/12/23
 **/
public class TestMain {


    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("aop-ajc.xml");

        TestClass testClass = context.getBean(TestClass.class);

        testClass.test();
    }
}
