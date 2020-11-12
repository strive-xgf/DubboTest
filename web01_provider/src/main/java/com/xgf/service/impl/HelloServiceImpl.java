package com.xgf.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.xgf.service.IHelloWordService;

//当前的服务类对象由spring管理
//但是此处不使用spring的@Service注解 ，应该使用具有RPC功能的dubbo的@Service注解（导包）
//开启Dubbo负载均衡，配置在提供方，默认值random，三个配置值（random, roundrobin, leastactive）
@Service(interfaceClass = IHelloWordService.class,loadbalance = "random")
public class HelloServiceImpl implements IHelloWordService {
    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }
}
