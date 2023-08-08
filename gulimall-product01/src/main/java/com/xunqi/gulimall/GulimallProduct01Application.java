package com.xunqi.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.xunqi.gulimall.product.dao")
@SpringBootApplication
public class GulimallProduct01Application {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProduct01Application.class, args);
	}

}
