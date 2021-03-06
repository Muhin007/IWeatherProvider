package com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.Error;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.XMLReadProcess;

import java.util.concurrent.CompletableFuture;

public class WeatherAdaptorWorldweatheronline implements WeatherAdaptor {

    @Override
    public int getTemp(String cityName) {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            String uri = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=bc27cfec9d314543bdf70006191806&q=" + cityName + "&format=xml&num_of_days=1&lang=ru";
            String output = XMLReadProcess.getString(uri);
            return Integer.parseInt(output.split("<temp_C>")[1].split("</temp_C>")[0]);
        });
        int temp = 0;
        temp = Error.exceptionFuture(future, temp);
        return temp;
    }
}
