package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;

import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private WeatherAdaptorAerisapi wAA = new WeatherAdaptorAerisapi();
    private static String cityName = null;
    private double avgTemp, aerisapiTemp = wAA.getTempAerisapi(), accuweatherTemp = 0, aerisweatherTemp = 0, worldweatheronlineTemp = 0;

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
        avgTemp = (aerisapiTemp + accuweatherTemp + aerisweatherTemp + worldweatheronlineTemp)/4;
        return avgTemp;
    }
}
