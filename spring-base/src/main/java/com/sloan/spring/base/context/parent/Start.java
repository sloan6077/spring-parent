package com.sloan.spring.base.context.parent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wukong
 **/
public class Start {


    public static void main(String[] args) {

        ApplicationContext parent = new ClassPathXmlApplicationContext("config-parent.xml");
        ApplicationContext child = new ClassPathXmlApplicationContext(new String[]{"config-child.xml"},parent);
    }
}
