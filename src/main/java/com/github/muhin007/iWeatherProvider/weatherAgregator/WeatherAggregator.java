package com.github.muhin007.iWeatherProvider.weatherAgregator;

import com.github.muhin007.iWeatherProvider.config.ConfigIWeatherProvider;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigIWeatherProvider.class);
        getCityName();
        WeatherAdaptorApixu weatherAdaptorApixu = context.getBean(WeatherAdaptorApixu.class);
        WeatherAdaptorAerisapi weatherAdaptorAerisapi = context.getBean(WeatherAdaptorAerisapi.class);
        WeatherAdaptorYandex weatherAdaptorYandex = context.getBean(WeatherAdaptorYandex.class);
        WeatherAdaptorWorldweatheronline weatherAdaptorWorldweatheronline = context.getBean(WeatherAdaptorWorldweatheronline.class);
        int[] temps = {weatherAdaptorApixu.getTemp(cityName), weatherAdaptorAerisapi.getTemp(cityName),
                weatherAdaptorYandex.getTemp(cityName), weatherAdaptorWorldweatheronline.getTemp(cityName)};
        double avgTemp = Arrays.stream(temps).sum() / temps.length;
        System.out.println("Средняя температура в городе " + cityName + " : " + avgTemp + "C.");
    }
}
