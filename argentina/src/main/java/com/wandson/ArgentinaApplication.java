package com.wandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ArgentinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArgentinaApplication.class, args);
	}

}
