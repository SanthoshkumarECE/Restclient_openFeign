package com.example.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "weather-service", url = "http://localhost:8080/weather/api")
public interface WeatherClient {

    @GetMapping("/one")
    Weather getWeatherOne();

    @GetMapping("/two")
    Weather getWeatherTwo();

}