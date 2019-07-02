package com.github.muhin007.iWeatherProvider.weatherAdaptor;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;

public class SiteSelector {
    public WeatherAdaptor getWeatherAdaptor(Site site) {
        WeatherAdaptor weatherAdaptor = null;
        switch (site) {
            case YANDEX:
                weatherAdaptor = new WeatherAdaptorYandex();
                break;
            case APIXU:
                weatherAdaptor = new WeatherAdaptorApixu();
                break;
            case AERISAPI:
                weatherAdaptor = new WeatherAdaptorAerisapi();
                break;
            case WORLDWEATHERONLINE:
                weatherAdaptor = new WeatherAdaptorWorldweatheronline();
                break;
        }
        return weatherAdaptor;
    }
}
