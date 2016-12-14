package com.rsm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ShoppingOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingOrderApplication.class, args);
	}
}
