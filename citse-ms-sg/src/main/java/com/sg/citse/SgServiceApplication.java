package com.sg.citse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SgServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgServiceApplication.class, args);
	}

}
