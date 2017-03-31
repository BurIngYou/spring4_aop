package com.burning.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: main
 * @Author:You.Hu
 * @Create:2017-03-31 14:38
 */
public class Main {
    public static void main(String [] args){

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AopConfig.class);
        MethodService methodService = context.getBean(MethodService.class);
        //吃饭
        methodService.eat();
        //看电影
        methodService.movie();


    }
}
