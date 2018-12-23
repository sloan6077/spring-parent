package com.sloan.spring.base.aop;

import com.sloan.spring.aop.ajc.TestAnnotation;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/12/23
 **/
public class TestAopClass {

    @TestAnnotation
    public void test() {

        System.out.println("yo!");
    }
}
