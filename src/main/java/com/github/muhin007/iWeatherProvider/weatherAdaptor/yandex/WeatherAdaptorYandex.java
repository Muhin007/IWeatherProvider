package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.Coordinate;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.Error;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass.TempYandex;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class WeatherAdaptorYandex implements WeatherAdaptor {

    private Coordinate coordinate = new Coordinate();
    private double lat = coordinate.getLat();
    private double lon = coordinate.getLon();
    private int tempYandex;

    @Override
    public int getTemp(String  cityName) {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            coordinate.getCoordinate(String.valueOf(cityName));
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
                System.out.println("Ошибка получения данных от сайта. Попробуйте позднее.");
                e.printStackTrace();
            }

            String answer = null;
            try {
                assert resp != null;
                assert resp.body() != null;
                answer = resp.body().string();
            } catch (IOException e) {
                System.out.println("Ошибка получения данных от сайта. Попробуйте позднее.");
                System.exit(0);
                e.printStackTrace();
            }
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            TempYandex tempYandex;
            try {
                tempYandex = objectMapper.readValue(answer, TempYandex.class);
                this.tempYandex = (int) tempYandex.getFact().getTemp();
            } catch (IOException e) {
                System.out.println("Ошибка получения данных от сайта. Попробуйте позднее.");
                System.exit(0);
                e.printStackTrace();
            }
            return this.tempYandex;
        });
        int temp = 0;
        temp = Error.exceptionFuture(future, temp);
        return temp;
    }
}
