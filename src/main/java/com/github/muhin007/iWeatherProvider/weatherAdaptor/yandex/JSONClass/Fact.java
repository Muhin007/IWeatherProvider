
package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fact {

    @SerializedName("temp")
    @Expose
    private long temp;
    @SerializedName("feels_like")
    @Expose
    private long feelsLike;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("wind_speed")
    @Expose
    private long windSpeed;
    @SerializedName("wind_gust")
    @Expose
    private double windGust;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mm")
    @Expose
    private long pressureMm;
    @SerializedName("pressure_pa")
    @Expose
    private long pressurePa;
    @SerializedName("humidity")
    @Expose
    private long humidity;
    @SerializedName("daytime")
    @Expose
    private String daytime;
    @SerializedName("polar")
    @Expose
    private boolean polar;
    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("obs_time")
    @Expose
    private long obsTime;

    public long getTemp() {
        return temp;
    }

    public void setTemp(long temp) {
        this.temp = temp;
    }

    public Fact withTemp(long temp) {
        this.temp = temp;
        return this;
    }

    public long getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(long feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Fact withFeelsLike(long feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Fact withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Fact withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public long getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(long windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Fact withWindSpeed(long windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public Fact withWindGust(double windGust) {
        this.windGust = windGust;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Fact withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public long getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(long pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Fact withPressureMm(long pressureMm) {
        this.pressureMm = pressureMm;
        return this;
    }

    public long getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(long pressurePa) {
        this.pressurePa = pressurePa;
    }

    public Fact withPressurePa(long pressurePa) {
        this.pressurePa = pressurePa;
        return this;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Fact withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public Fact withDaytime(String daytime) {
        this.daytime = daytime;
        return this;
    }

    public boolean isPolar() {
        return polar;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
    }

    public Fact withPolar(boolean polar) {
        this.polar = polar;
        return this;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Fact withSeason(String season) {
        this.season = season;
        return this;
    }

    public long getObsTime() {
        return obsTime;
    }

    public void setObsTime(long obsTime) {
        this.obsTime = obsTime;
    }

    public Fact withObsTime(long obsTime) {
        this.obsTime = obsTime;
        return this;
    }

}
