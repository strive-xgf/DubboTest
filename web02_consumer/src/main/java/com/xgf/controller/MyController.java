package com.xgf.controller;


import com.alibaba.dubbo.config.annotation.Reference;

import com.xgf.service.IHelloWordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyController {
    //要去调用provider中的Service，要求先注入Service
    //1 复制provider工程的service接口
    //2 使用注入，但是不使用spring的autowire,而使用是dubbo的@Service配对的 @Reference注解


    //使用xml注入
    //@Autowired
    // @Qualifier("helloWordService")
    //check = true,loadbalance = "random" 配置负载均衡，配置在消费方（默认值random）
    @Reference(check = true,loadbalance = "random")
    IHelloWordService iHelloWordService;    //去provider取对象，用@Reference注解

    @RequestMapping(path = "/test01",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String test01(String name){
       String result =  iHelloWordService.sayHello(name);
       return result;    //ResponseBody将r返回结果转成json
    }

}
