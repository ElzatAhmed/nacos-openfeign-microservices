package org.elzatahmed.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoodbyeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodbyeProviderApplication.class, args);
    }

}
