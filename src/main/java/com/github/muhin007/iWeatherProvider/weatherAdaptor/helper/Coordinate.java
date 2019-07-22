package com.github.muhin007.iWeatherProvider.weatherAdaptor.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Response;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Temp;

import java.io.IOException;

public class Coordinate {
    private double lon;
    private double lat;
    public double getLon() {
        return lon;
    }
    public double getLat() {
        return lat;
    }

    public void getCoordinate(String cityName) {
        String request = "https://api.aerisapi.com/forecasts/" + cityName + ",?format=json&filter=day&limit=1&client_id=a04yWLdF5v83ZGGqanosb&client_secret=2moGBj8LBRIlJdhaufg9qCxN7IPLCokJ3OjamuKK";
        String result = JSONReadProcess.performRequest(request);
        ObjectMapper mapper = new ObjectMapper();
        Temp temp = null;
        try {
            temp = mapper.readValue(result, Temp.class);
        } catch (IOException e) {
            System.out.println("ошибка чтения данных сайта");
            e.printStackTrace();
        }
        assert temp != null;
        for (Response response : temp.getResponse()) {
            lon = response.getLoc().getLong();
            lat = response.getLoc().getLat();
        }
    }
}
