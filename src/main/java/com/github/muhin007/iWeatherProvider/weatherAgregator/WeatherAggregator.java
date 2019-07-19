package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;

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
        int[] temps = new int[]{new WeatherAdaptorYandex().getTemp(cityName),
                new WeatherAdaptorAerisapi().getTemp(cityName),
                new WeatherAdaptorApixu().getTemp(cityName),
                new WeatherAdaptorWorldweatheronline().getTemp(cityName)};
        double avgTemp = Arrays.stream(temps).sum() / temps.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }
}
