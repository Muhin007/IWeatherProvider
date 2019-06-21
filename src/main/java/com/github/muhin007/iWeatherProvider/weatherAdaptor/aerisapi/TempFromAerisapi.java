package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Period;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Response;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass.Temp;
import com.github.muhin007.iWeatherProvider.weatherAgregator.WeatherAggregator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TempFromAerisapi {
    private static String city = WeatherAggregator.getCityName();
    private int tempFromAerisapi;

    public int getTempFromAerisapi() {
        parsingTempFromAerisapi();
        return tempFromAerisapi;
    }

    private void parsingTempFromAerisapi() {
        String request = "https://api.aerisapi.com/forecasts/" + city + ",?format=json&filter=day&limit=1&client_id=a04yWLdF5v83ZGGqanosb&client_secret=2moGBj8LBRIlJdhaufg9qCxN7IPLCokJ3OjamuKK";
        String result = performRequest(request);
        ObjectMapper mapper = new ObjectMapper();
        Temp temp = null;
        try {
            temp = mapper.readValue(result, Temp.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Response response : temp.getResponse()) {
            for (Period period : response.getPeriods()) {
                tempFromAerisapi = (int) period.getMaxTempC();
            }
        }
    }

    private static String performRequest(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = null;
        try {
            http = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            http.disconnect();
        }
        return sb.toString();
    }
}
