package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;

public class WeatherAdaptorYandex extends WeatherAdaptor {
    TempFromYandex tempFromYandex = new TempFromYandex();

    private int tempYandex;

    @Override
    public void requestTempAPI() {
        tempYandex = tempFromYandex.getTempFromYandex();
    }

    public double getTempFromYandex() {
        requestTempAPI();
        return tempYandex;
    }
}
