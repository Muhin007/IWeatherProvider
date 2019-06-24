package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private WeatherAdaptorAerisapi wAA = new WeatherAdaptorAerisapi();
    private WeatherAdaptorYandex wAY = new WeatherAdaptorYandex();
    private WeatherAdaptorApixu wAAp = new WeatherAdaptorApixu();
    public static String cityName;
    private double avgTemp, aerisapiTemp = wAA.getTempAerisapi(), apixuTemp = wAAp.getTempApixu(), yandexTemp = wAY.getTempFromYandex(), worldweatheronlineTemp = 0;
    double temps[] = {aerisapiTemp, apixuTemp, yandexTemp, worldweatheronlineTemp};

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

    public void start(){
        readCityName();
        System.out.println("Средняя температура в городе " + cityName + " : " + getAVGTemp() + "C.");
    }

    private static void readCityName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название города: ");
        cityName = in.nextLine();
    }

    private double getAVGTemp(){
        System.out.println(aerisapiTemp + " " + apixuTemp + " " + yandexTemp + " " + worldweatheronlineTemp); //TODO стереть перед релизом
        avgTemp = Arrays.stream(temps).sum()/temps.length;
        return avgTemp;
    }
}
