package com.xgf.service;


//需要拷贝provider的service接口到consumer里面，而且要求文件路径一致【***】
//不然的话不能知道要调用的类有些什么方法
public interface IHelloWordService {

    public String sayHello(String name);
}
