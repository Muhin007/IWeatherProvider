
package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TempYandex {

    @SerializedName("now")
    @Expose
    private long now;
    @SerializedName("now_dt")
    @Expose
    private String nowDt;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("fact")
    @Expose
    private Fact fact;
    @SerializedName("forecast")
    @Expose
    private Forecast forecast;

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public TempYandex withNow(long now) {
        this.now = now;
        return this;
    }

    public String getNowDt() {
        return nowDt;
    }

    public void setNowDt(String nowDt) {
        this.nowDt = nowDt;
    }

    public TempYandex withNowDt(String nowDt) {
        this.nowDt = nowDt;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public TempYandex withInfo(Info info) {
        this.info = info;
        return this;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public TempYandex withFact(Fact fact) {
        this.fact = fact;
        return this;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public TempYandex withForecast(Forecast forecast) {
        this.forecast = forecast;
        return this;
    }

}
