package com.ywh.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/6/4 0004.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String user){
        return restTemplate.getForObject("http://server-user/hello?user="+user,String.class);
    }

    public String helloError(String user){
        return "sorry , I am "+user+" , there is an error";
    }
}
