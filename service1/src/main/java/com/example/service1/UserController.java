package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/apigateway/weather")
public class UserController {

    @Autowired
    private RestClient restClient;

    @GetMapping("/{type}")
    public ResponseEntity<?> getWeather(@PathVariable String type) {

        Weather w;

        try {
            w = restClient
                    .get()
                    .uri("http://localhost:8080/weather/api/" + type)
                    .retrieve()
                    .body(Weather.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.ok(w);
    }
}