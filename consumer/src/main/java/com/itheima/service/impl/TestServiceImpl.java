package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.TestService;
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String echoA(String a) {
        return "远程调用方法打印："+a;
    }
}
