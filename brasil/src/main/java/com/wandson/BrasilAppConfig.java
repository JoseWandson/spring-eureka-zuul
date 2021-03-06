package com.wandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BrasilAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(BrasilAppConfig.class, args);
    }

}