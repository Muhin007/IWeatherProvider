package com.github.muhin007.iWeatherProvider.weatherAgregator;

import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private String cityName = null;
    private double avgTemp, yandexTemp = 1, accuweatherTemp = 2, aerisweatherTemp = 3, worldweatheronlineTemp = 4;

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

    private String getCityName(){
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
