package com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;

public class WeatherAdaptorWorldweatheronline{
    private WeatherAdaptorApixu wAA = new WeatherAdaptorApixu();

    public int getTempFromWorldweatheronline(String cityName) {
        String uri = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=bc27cfec9d314543bdf70006191806&q=" + cityName + "&format=xml&num_of_days=1&lang=ru";
        String output = wAA.getString(uri);
        return Integer.parseInt(output.split("<temp_C>")[1].split("</temp_C>")[0]);
    }
}
