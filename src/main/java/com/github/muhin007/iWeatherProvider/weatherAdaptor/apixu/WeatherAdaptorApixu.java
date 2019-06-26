package com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.Error;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.XMLReadProcess;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WeatherAdaptorApixu implements WeatherAdaptor {
    public List<Integer> temp = new ArrayList<>();

    @Override
    public int getTemp(String cityName) {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            String uri = "http://api.apixu.com/v1/current.xml?key=d85bbc64aab34428894192757192306&q=" + cityName;
            String output = XMLReadProcess.getString(uri);
            int temp = Integer.parseInt(output.split("<temp_c>")[1].split("</temp_c>")[0]);
            writeTemp(temp);
            return temp;
        });
        int temp = 0;
        temp = Error.exceptionFuture(future, temp);
        writeTemp(temp);
        return temp;
    }

    @Override
    public void writeTemp(int cityTemp) {
        temp.add(cityTemp);
    }
}
