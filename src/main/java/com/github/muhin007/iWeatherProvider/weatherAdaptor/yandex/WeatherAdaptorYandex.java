package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.JSONReadProcess;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Response;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Temp;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass.TempYandex;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class WeatherAdaptorYandex {
    private double lat;
    private double lon;
    private int tempYandex;

    public int getTempFromYandex(String cityName) {
        String request = "https://api.aerisapi.com/forecasts/" + cityName + ",?format=json&filter=day&limit=1&client_id=a04yWLdF5v83ZGGqanosb&client_secret=2moGBj8LBRIlJdhaufg9qCxN7IPLCokJ3OjamuKK";
        String result = JSONReadProcess.performRequest(request);
        ObjectMapper mapper = new ObjectMapper();
        Temp temp = null;
        try {
            temp = mapper.readValue(result, Temp.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Response response : temp.getResponse()) {
            lon = response.getLoc().getLong();
            lat = response.getLoc().getLat();
        }


        OkHttpClient client = new OkHttpClient();

        Request req = new Request.Builder()
                .url("https://api.weather.yandex.ru/v1/informers?lat=" + lat + "&lon=" + lon)
                .get()
                .addHeader("x-yandex-api-key", "fae0f19b-5270-4466-9444-27ad5cd21e41")
                .build();

        okhttp3.Response resp = null;
        try {
            resp = client.newCall(req).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String answer = null;
        try {
            answer = resp.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        TempYandex tempYandex = null;
        try {
            tempYandex = objectMapper.readValue(answer, TempYandex.class);
            this.tempYandex = (int) tempYandex.getFact().getTemp();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.tempYandex;
    }
}
