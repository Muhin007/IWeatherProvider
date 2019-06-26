package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Period;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Response;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Temp;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.Error;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.JSONReadProcess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class WeatherAdaptorAerisapi implements WeatherAdaptor {

    public List<Integer> temp = new ArrayList<>();

    @Override
    public int getTemp(String cityName) {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            String request = "https://api.aerisapi.com/forecasts/" + cityName + ",?format=json&filter=day&limit=1&client_id=a04yWLdF5v83ZGGqanosb&client_secret=2moGBj8LBRIlJdhaufg9qCxN7IPLCokJ3OjamuKK";
            String result = JSONReadProcess.performRequest(request);
            ObjectMapper mapper = new ObjectMapper();
            Temp temp = null;
            try {
                temp = mapper.readValue(result, Temp.class);
            } catch (IOException e) {
                System.out.println("Ошибка получения данных от сайта. Попробуйте позднее.");
                System.exit(0);
                e.printStackTrace();
            }
            assert temp != null;
            int tempFromAerisapi = 0;
            for (Response response : temp.getResponse()) {
                for (Period period : response.getPeriods()) {
                    tempFromAerisapi = (int) period.getMaxTempC();
                }
            }
            return tempFromAerisapi;
        });
        int temp = 0;
        temp = Error.exceptionFuture(future, temp);
        writeTemp(temp);
        return temp;
    }

    @Override
    public void writeTemp(int cityTemp) {
        temp.add(cityTemp);
    }
}
