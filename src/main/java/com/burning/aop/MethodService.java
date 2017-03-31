package com.burning.aop;

import org.springframework.stereotype.Service;
/**
 * @Description: 农大学子的行为
 * @Author:You.Hu
 * @Create:2017-03-31 13:58
 */
@Service //申明为Spring的bean
public class MethodService {

        //吃饭
        public void eat(){
            System.out.println("开始吃饭！");
        }
         //看電影
         public void movie(){
             System.out.println("开始看電影！");
         }
}
