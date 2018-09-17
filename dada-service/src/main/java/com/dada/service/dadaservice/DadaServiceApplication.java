package com.dada.service.dadaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DadaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DadaServiceApplication.class, args);
    }
}
