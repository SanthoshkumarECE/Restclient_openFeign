package com.example.service2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather/api")
public class WeatherController {

    @GetMapping("/{type}")
    public ResponseEntity<?> getWeatherOne(@PathVariable String type) {

        Weather w;

        if (type.equals("one")) {
            w = new Weather(1, "Sunny", "15 km/h", 0, "32°C");
        } else if (type.equals("two")) {
            w = new Weather(2, "Cloudy", "10 km/h", 5, "27°C");
        } else {
            return ResponseEntity.badRequest().body("Invalid type: " + type);
        }

        return ResponseEntity.ok(w);
    }

}