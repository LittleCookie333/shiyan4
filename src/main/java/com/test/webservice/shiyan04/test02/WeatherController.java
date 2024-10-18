package com.test.webservice.shiyan04.test02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "http://localhost:63342") // 允许跨域请求
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/forecast")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}