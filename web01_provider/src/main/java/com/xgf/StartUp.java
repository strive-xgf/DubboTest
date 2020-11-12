package com.xgf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * Dubbo优化细节一
 * 使用main函数启动，用于开发阶段（提高开发效率，减少调试时间）
 * */
public class StartUp {
    public static void main(String[] args) throws IOException {
        //1. 读取dubbo配置
        ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("dubbo-provider.xml");
        //2. 开启服务
        applicationContext.start();
        //3. 让程序阻塞，提供方一直提供服务
        System.in.read();
    }
}
