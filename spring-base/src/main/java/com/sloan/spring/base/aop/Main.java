package com.sloan.spring.base.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/12/23
 **/
public class Main {


    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("test-aop.xml");

        TestAopClass testAopClass = context.getBean(TestAopClass.class);

        testAopClass.test();
    }
}
