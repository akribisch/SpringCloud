package com.ywh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@FeignClient(value = "server-user")
public interface SchedualServerHello {

    @RequestMapping(value = "/hello")
    String sayHelloFromClient(@RequestParam(value = "user") String user);
}
