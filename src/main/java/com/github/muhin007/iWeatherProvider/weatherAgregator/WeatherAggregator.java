package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.accuweather.WeatherAdaptorAccuweather;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private WeatherAdaptorAerisapi wAA = new WeatherAdaptorAerisapi();
    private WeatherAdaptorYandex wAY = new WeatherAdaptorYandex();
    private WeatherAdaptorAccuweather wAAc = new WeatherAdaptorAccuweather();
    private static String cityName = null;
    private double avgTemp, aerisapiTemp = wAA.getTempAerisapi(), accuweatherTemp = wAAc.getTempAccuweather(), yandexTemp = wAY.getTempFromYandex(), worldweatheronlineTemp = 0;
    double temps[] = {aerisapiTemp, accuweatherTemp, yandexTemp, worldweatheronlineTemp};

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
        System.out.println("Средняя температура в городе " + getCityName() + " : " + getAVGTemp() + "C.");
    }

    public static String getCityName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название города: ");
        cityName = in.nextLine();
        return cityName;
    }

    private double getAVGTemp(){
        System.out.println(aerisapiTemp + " " + accuweatherTemp + " " + yandexTemp + " " + worldweatheronlineTemp); //TODO стереть перед релизом
        avgTemp = Arrays.stream(temps).sum()/temps.length;
        return avgTemp;
    }
}
