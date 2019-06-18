package com.github.muhin007.iWeatherProvider.weatherAgregator;

import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private String cityName = null;

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

        System.out.println("Средняя температура в городе " + getCityName() + " : " + "avgCurrentTemperature" + " градусов.");
    }

    private String getCityName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название города: ");
        cityName = in.nextLine();
        return cityName;
    }
}
