package com.it.cloud.microservicediscoveryeureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaApplication {

	public static void main(String[] args) {
        System.out.println("eureka server hello world");
        SpringApplication.run(MicroserviceDiscoveryEurekaApplication.class, args);
	}

}
