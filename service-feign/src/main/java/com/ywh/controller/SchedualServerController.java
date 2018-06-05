package com.ywh.controller;

import com.ywh.service.SchedualServerHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@RestController
public class SchedualServerController {

    @Autowired
    SchedualServerHello schedualServerHello;

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam String user){
        return schedualServerHello.sayHelloFromClient(user);
    }
}
