package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.JSONReadProcess;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Period;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Response;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Temp;

import java.io.IOException;

public class WeatherAdaptorAerisapi{
    private int tempFromAerisapi;

    public int getTempFromAerisapi(String cityName) {

        String request = "https://api.aerisapi.com/forecasts/" + cityName + ",?format=json&filter=day&limit=1&client_id=a04yWLdF5v83ZGGqanosb&client_secret=2moGBj8LBRIlJdhaufg9qCxN7IPLCokJ3OjamuKK";
        String result = JSONReadProcess.performRequest(request);
        ObjectMapper mapper = new ObjectMapper();
        Temp temp = null;
        try {
            temp = mapper.readValue(result, Temp.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert temp != null;
        for (Response response : temp.getResponse()) {
            for (Period period : response.getPeriods()) {
                tempFromAerisapi = (int) period.getMaxTempC();
            }
        }
        return tempFromAerisapi;
    }

}
