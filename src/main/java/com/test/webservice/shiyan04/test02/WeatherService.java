package com.test.webservice.shiyan04.test02;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String weatherUrl = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx/getWeatherbyCityName?theCityName=";

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(weatherUrl + city, String.class);
        return response;
    }
}