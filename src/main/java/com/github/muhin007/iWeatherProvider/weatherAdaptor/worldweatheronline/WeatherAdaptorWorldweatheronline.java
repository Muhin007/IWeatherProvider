package com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.WeatherAdaptor;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.helper.XMLReadProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WeatherAdaptorWorldweatheronline implements WeatherAdaptor {
    public List<Integer> temp = new ArrayList<>();

    @Override
    public int getTemp(String cityName) {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            String uri = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=bc27cfec9d314543bdf70006191806&q=" + cityName + "&format=xml&num_of_days=1&lang=ru";
            String output = XMLReadProcess.getString(uri);
            int temp = Integer.parseInt(output.split("<temp_C>")[1].split("</temp_C>")[0]);
            writeTemp(temp);
            return temp;
        });
        int temp = 0;
        try {
            temp = future.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ошибка получения данных от сайта. Попробуйте позднее.");
            e.printStackTrace();
        }
        writeTemp(temp);
        return temp;
    }

    @Override
    public void writeTemp(int cityTemp) {
        temp.add(cityTemp);
    }
}
