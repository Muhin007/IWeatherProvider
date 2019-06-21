package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;

public class WeatherAdaptorAerisapi extends WeatherAdaptor {
    TempFromAerisapi tempFromAerisapi = new TempFromAerisapi();

    private int tempAerisapi;

    @Override
    public void requestTempAPI() {
        tempAerisapi = tempFromAerisapi.getTempFromAerisapi();
    }

    public double getTempAerisapi() {
        requestTempAPI();
        return tempAerisapi;
    }

}
