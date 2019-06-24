package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.JSONReadProcess;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Response;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Temp;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass.TempYandex;
import com.github.muhin007.iWeatherProvider.weatherAgregator.WeatherAggregator;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class TempFromYandex {
    private static String city = WeatherAggregator.cityName;
    private double lat;
    private double lon;
    private int tempFromYandex;

    public int getTempFromYandex() {
        parsingTempFromYandex();
        return tempFromYandex;
    }

    private void getCoordinate() {
        String request = "https://api.aerisapi.com/forecasts/" + city + ",?format=json&filter=day&limit=1&client_id=a04yWLdF5v83ZGGqanosb&client_secret=2moGBj8LBRIlJdhaufg9qCxN7IPLCokJ3OjamuKK";
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
    }

    private double getLon() {
        getCoordinate();
        return lon;
    }

    private double getLat() {
        getCoordinate();
        return lat;
    }


    private void parsingTempFromYandex() {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v1/informers?lat=" + getLat() + "&lon=" + getLon())
                .get()
                .addHeader("x-yandex-api-key", "fae0f19b-5270-4466-9444-27ad5cd21e41")
                .build();

        okhttp3.Response resp = null;
        try {
            resp = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String answer = null;
        try {
            answer = resp.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        TempYandex temp = null;
        try {
            temp = mapper.readValue(answer, TempYandex.class);
            tempFromYandex = (int) temp.getFact().getTemp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
