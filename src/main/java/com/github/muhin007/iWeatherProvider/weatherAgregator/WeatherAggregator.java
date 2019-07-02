package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.Site;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.SiteSelector;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherAggregator {
    SiteSelector siteSelector = new SiteSelector();

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
        int[] temps = {siteSelector.getWeatherAdaptor(Site.YANDEX).getTemp(cityName), siteSelector.getWeatherAdaptor(Site.AERISAPI).getTemp(cityName),
                siteSelector.getWeatherAdaptor(Site.APIXU).getTemp(cityName), siteSelector.getWeatherAdaptor(Site.WORLDWEATHERONLINE).getTemp(cityName)};
        double avgTemp = Arrays.stream(temps).sum() / temps.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }
}
