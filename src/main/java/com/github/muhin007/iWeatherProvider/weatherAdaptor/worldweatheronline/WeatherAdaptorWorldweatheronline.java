package com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;

public class WeatherAdaptorWorldweatheronline extends WeatherAdaptor {

    TempFromWorldweatheronline tempFromWorldweatheronline = new TempFromWorldweatheronline();
    private int tempWorldweatheronline;

    @Override
    public void requestTempAPI() {
        tempWorldweatheronline = tempFromWorldweatheronline.getTempWorldweatheronline();
    }

    public double getTempFromWorldweatheronline() {
        requestTempAPI();
        return tempWorldweatheronline;
    }
}
