package com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;

public class WeatherAdaptorApixu extends WeatherAdaptor {
    TempFromApixu tempFromApixu = new TempFromApixu();

    private int tempApixu;
    @Override
    public void requestTempAPI() {
        tempApixu = tempFromApixu.getTempFromApixu();
    }
    public double getTempAccuweather() {
        requestTempAPI();
        return tempApixu;
    }
}
