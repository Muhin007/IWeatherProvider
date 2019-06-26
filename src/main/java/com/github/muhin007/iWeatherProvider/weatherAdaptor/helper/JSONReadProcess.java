package com.github.muhin007.iWeatherProvider.weatherAdaptor.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONReadProcess {
    public static String performRequest(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = null;
        try {
            assert url != null;
            http = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert http != null;
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert http != null;
            http.disconnect();
        }
        return sb.toString();
    }
}
