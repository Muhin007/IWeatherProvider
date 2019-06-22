
package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Part {

    @SerializedName("part_name")
    @Expose
    private String partName;
    @SerializedName("temp_min")
    @Expose
    private long tempMin;
    @SerializedName("temp_max")
    @Expose
    private long tempMax;
    @SerializedName("temp_avg")
    @Expose
    private long tempAvg;
    @SerializedName("feels_like")
    @Expose
    private long feelsLike;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("daytime")
    @Expose
    private String daytime;
    @SerializedName("polar")
    @Expose
    private boolean polar;
    @SerializedName("wind_speed")
    @Expose
    private double windSpeed;
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
    @SerializedName("prec_mm")
    @Expose
    private long precMm;
    @SerializedName("prec_period")
    @Expose
    private long precPeriod;
    @SerializedName("prec_prob")
    @Expose
    private long precProb;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Part withPartName(String partName) {
        this.partName = partName;
        return this;
    }

    public long getTempMin() {
        return tempMin;
    }

    public void setTempMin(long tempMin) {
        this.tempMin = tempMin;
    }

    public Part withTempMin(long tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public long getTempMax() {
        return tempMax;
    }

    public void setTempMax(long tempMax) {
        this.tempMax = tempMax;
    }

    public Part withTempMax(long tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    public long getTempAvg() {
        return tempAvg;
    }

    public void setTempAvg(long tempAvg) {
        this.tempAvg = tempAvg;
    }

    public Part withTempAvg(long tempAvg) {
        this.tempAvg = tempAvg;
        return this;
    }

    public long getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(long feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Part withFeelsLike(long feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Part withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Part withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public Part withDaytime(String daytime) {
        this.daytime = daytime;
        return this;
    }

    public boolean isPolar() {
        return polar;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
    }

    public Part withPolar(boolean polar) {
        this.polar = polar;
        return this;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Part withWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public Part withWindGust(double windGust) {
        this.windGust = windGust;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Part withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public long getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(long pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Part withPressureMm(long pressureMm) {
        this.pressureMm = pressureMm;
        return this;
    }

    public long getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(long pressurePa) {
        this.pressurePa = pressurePa;
    }

    public Part withPressurePa(long pressurePa) {
        this.pressurePa = pressurePa;
        return this;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Part withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    public long getPrecMm() {
        return precMm;
    }

    public void setPrecMm(long precMm) {
        this.precMm = precMm;
    }

    public Part withPrecMm(long precMm) {
        this.precMm = precMm;
        return this;
    }

    public long getPrecPeriod() {
        return precPeriod;
    }

    public void setPrecPeriod(long precPeriod) {
        this.precPeriod = precPeriod;
    }

    public Part withPrecPeriod(long precPeriod) {
        this.precPeriod = precPeriod;
        return this;
    }

    public long getPrecProb() {
        return precProb;
    }

    public void setPrecProb(long precProb) {
        this.precProb = precProb;
    }

    public Part withPrecProb(long precProb) {
        this.precProb = precProb;
        return this;
    }

}
