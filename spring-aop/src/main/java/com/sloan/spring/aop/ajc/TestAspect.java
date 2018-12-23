package com.sloan.spring.aop.ajc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/12/23
 **/
@Aspect
public class TestAspect {

    @Around("@annotation(com.sloan.spring.aop.ajc.TestAnnotation)")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("aspect begin...");

//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        Method method = methodSignature.getMethod();
//        Object[] args = joinPoint.getArgs();
//        Object target = joinPoint.getTarget();

        return joinPoint.proceed();

    }
}