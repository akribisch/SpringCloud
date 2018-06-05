package com.ywh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
@EnableEurekaClient
public class SpringcloudProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProviderUserApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping(value = "/hello")
	public String hello(@RequestParam String user){
		return "hello world , I am "+user+" , my port is  "+port;
	}
}
