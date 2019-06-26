package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherAggregator {

    private static volatile WeatherAggregator instance = null;
    private WeatherAdaptorAerisapi wAA = new WeatherAdaptorAerisapi();
    private WeatherAdaptorYandex wAY = new WeatherAdaptorYandex();
    private WeatherAdaptorApixu wAAp = new WeatherAdaptorApixu();
    private WeatherAdaptorWorldweatheronline wAW = new WeatherAdaptorWorldweatheronline();
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
        wAY.getTemp(cityName);
        wAAp.getTemp(cityName);
        wAA.getTemp(cityName);
        wAW.getTemp(cityName);
        int[] temps = {wAA.temp.get(0), wAW.temp.get(0), wAAp.temp.get(0), wAY.temp.get(0)};
        double avgTemp = Arrays.stream(temps).sum() / temps.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }
}
