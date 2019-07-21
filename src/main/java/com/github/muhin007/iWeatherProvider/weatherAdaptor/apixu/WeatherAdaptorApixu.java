package com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.Error;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.XMLReadProcess;

import java.util.concurrent.CompletableFuture;

public class WeatherAdaptorApixu implements WeatherAdaptor {

    @Override
    public int getTemp(String cityName) {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            String uri = "http://api.apixu.com/v1/current.xml?key=d85bbc64aab34428894192757192306&q=" + cityName;
            String output = XMLReadProcess.getString(uri);
            int temp = Integer.parseInt(output.split("<temp_c>")[1].split("</temp_c>")[0]);
            return temp;
        });
        int temp = 0;
        temp = Error.exceptionFuture(future, temp);
        return temp;
    }
}
