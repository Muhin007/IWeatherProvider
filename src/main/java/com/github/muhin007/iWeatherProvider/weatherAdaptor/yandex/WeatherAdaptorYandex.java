package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;

public class WeatherAdaptorYandex extends WeatherAdaptor {
    private double tempYandex;

    @Override
    public void requestTempAPI() {
        tempYandex = 10;
    }

    public double getTempYandex() {
        requestTempAPI();
        return tempYandex;
    }

}
