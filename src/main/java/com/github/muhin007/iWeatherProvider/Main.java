package com.github.muhin007.iWeatherProvider;

import com.github.muhin007.iWeatherProvider.weatherAgregator.WeatherAggregator;

public class Main {

    public static void main(String[] args) {
        WeatherAggregator weatherAggregator = WeatherAggregator.getInstance();
        weatherAggregator.AVGTemp();
    }
}