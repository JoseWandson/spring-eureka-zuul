package com.wandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HolandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolandaApplication.class, args);
	}

}
