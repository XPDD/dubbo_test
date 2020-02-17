package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Reference
    TestService testService;
    @RequestMapping("/test")
    @ResponseBody
    public String echo(String a){
        return testService.echoA(a);
    }
}
