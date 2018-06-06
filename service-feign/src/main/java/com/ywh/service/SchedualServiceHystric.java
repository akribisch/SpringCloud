package com.ywh.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@Component
public class SchedualServiceHystric implements SchedualServerHello {
    @Override
    public String sayHelloFromClient(String user) {
        return "there is an error , I am "+user;
    }
}
