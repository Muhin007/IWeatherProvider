package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private WeatherAdaptorAerisapi wAA = new WeatherAdaptorAerisapi();
    private WeatherAdaptorYandex wAY = new WeatherAdaptorYandex();
    private WeatherAdaptorApixu wAAp = new WeatherAdaptorApixu();
    private WeatherAdaptorWorldweatheronline wAW = new WeatherAdaptorWorldweatheronline();
    private String cityName;

    public static WeatherAggregator getInstance() {
        if (instance == null) {
            synchronized (WeatherAggregator.class) {
                if (instance == null) {
                    instance = new WeatherAggregator();
                }
            }
        }
        return instance;
    }

    private void getCityName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название города на английском языке: ");
        cityName = in.nextLine();
    }

    public void AVGTemp() {
        getCityName();
        int aerisapiTemp = futureTempAerisapi();
        int yandexTemp = futureTempYandex();
        int apixuTemp = futureTempApixu();
        int worldweatheronlineTemp = futureTempWorldweatheronline();
        int[] temps = {aerisapiTemp, yandexTemp, apixuTemp, worldweatheronlineTemp};
        double avgTemp = Arrays.stream(temps).sum() / temps.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }

    private int futureTempAerisapi() {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> wAA.getTempFromAerisapi(cityName));
        int temp = 0;
        try {
            temp = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return temp;
    }

    private int futureTempYandex() {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() ->wAY.getTempFromYandex(cityName));
        int temp = 0;
        try {
            temp = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return temp;
    }

    private int futureTempApixu() {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> wAAp.getTempFromApixu(cityName));
        int temp = 0;
        try {
            temp = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return temp;
    }
    private int futureTempWorldweatheronline() {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> wAW.getTempFromWorldweatheronline(cityName));
        int temp = 0;
        try {
            temp = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
