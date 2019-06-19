package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    WeatherAdaptorYandex wAY = new WeatherAdaptorYandex();
    private String cityName = null;
    private double avgTemp, yandexTemp = wAY.getTempYandex(), accuweatherTemp = 0, aerisweatherTemp = 0, worldweatheronlineTemp = 0;

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

    public String getCityName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название города: ");
        cityName = in.nextLine();
        return cityName;
    }

    private double getAVGTemp(){
        avgTemp = (yandexTemp + accuweatherTemp + aerisweatherTemp + worldweatheronlineTemp)/4;
        return avgTemp;
    }
}
