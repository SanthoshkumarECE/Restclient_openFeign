package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
@EnableFeignClients
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder.build();
    }
}
