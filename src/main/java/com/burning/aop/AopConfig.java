package com.burning.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: 配置类
 * @Author:You.Hu
 * @Create:2017-03-31 14:35
 */
@Configuration//配置类
@ComponentScan("com.burning.aop")//扫描com.burning.aop所有的bean
@EnableAspectJAutoProxy//开启Spring对aop的支持
public class AopConfig {
}
