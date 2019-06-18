package com.github.muhin007.iWeatherProvider;

import com.github.muhin007.iWeatherProvider.weatherAgregator.WeatherAggregator;

public class Main {

    static WeatherAggregator wA = WeatherAggregator.getInstance();

    public static void main(String[] args) {
       wA.start();
    }
}
