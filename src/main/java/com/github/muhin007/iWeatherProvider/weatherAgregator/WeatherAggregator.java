package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import javax.xml.transform.TransformerConfigurationException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

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

    public String getCityName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название города: ");
        cityName = in.nextLine();
        return cityName;
    }

    public void AVGTemp() {
        getCityName();
        CompletableFuture <Integer> future = new CompletableFuture<>();
        int aerisapiTemp = wAA.getTempAerisapi(cityName);
        int yandexTemp = wAY.getTempFromYandex(cityName);
        int apixuTemp = wAAp.getTempApixu(cityName);
        int worldweatheronlineTemp = 0;
        try {
            worldweatheronlineTemp = wAW.getTempFromWorldweatheronline(cityName);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        int[] temps = {aerisapiTemp,yandexTemp, apixuTemp,  worldweatheronlineTemp};
        double avgTemp = Arrays.stream(temps).sum() / temps.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }
}
