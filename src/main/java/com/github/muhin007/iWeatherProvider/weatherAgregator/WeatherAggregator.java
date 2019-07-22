package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.*;

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
        int sum = 0;
        WeatherAdaptor[] weatherAdaptors = {new WeatherAdaptorApixu(), new WeatherAdaptorAerisapi(), new WeatherAdaptorYandex(), new WeatherAdaptorWorldweatheronline()};
        for (WeatherAdaptor weatherAdaptor : weatherAdaptors) {
            sum += weatherAdaptor.getTemp(cityName);
        }
        double avgTemp = sum / weatherAdaptors.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }
}
