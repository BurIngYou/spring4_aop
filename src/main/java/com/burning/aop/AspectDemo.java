package com.burning.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description: 切面
 * @Author:You.Hu
 * @Create:2017-03-31 14:05
 */
@Aspect//定义切面
@Component
public class AspectDemo {

    @Before("execution(* com.burning.aop.MethodService.*(..))")//execution切入的路径(在里面方法执行之前先执行这个)
    public void before(JoinPoint joinPoint){

        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        //获得方法
        Method  method =  signature.getMethod();
        System.out.println("想"+method.getName()+"身上有钱没");
        System.out.println("找室友借点钱");

    }
}
