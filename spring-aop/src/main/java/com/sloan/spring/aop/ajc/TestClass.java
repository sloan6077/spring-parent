package com.sloan.spring.aop.ajc;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/12/23
 **/
public class TestClass {

    @TestAnnotation
    public void test() {

        System.out.println("test");
    }
}
