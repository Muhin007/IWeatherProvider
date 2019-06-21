
package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Period {

    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("validTime")
    @Expose
    private String validTime;
    @SerializedName("dateTimeISO")
    @Expose
    private String dateTimeISO;
    @SerializedName("maxTempC")
    @Expose
    private long maxTempC;
    @SerializedName("maxTempF")
    @Expose
    private long maxTempF;
    @SerializedName("minTempC")
    @Expose
    private long minTempC;
    @SerializedName("minTempF")
    @Expose
    private long minTempF;
    @SerializedName("avgTempC")
    @Expose
    private long avgTempC;
    @SerializedName("avgTempF")
    @Expose
    private long avgTempF;
    @SerializedName("tempC")
    @Expose
    private Object tempC;
    @SerializedName("tempF")
    @Expose
    private Object tempF;
    @SerializedName("pop")
    @Expose
    private long pop;
    @SerializedName("precipMM")
    @Expose
    private double precipMM;
    @SerializedName("precipIN")
    @Expose
    private long precipIN;
    @SerializedName("iceaccum")
    @Expose
    private Object iceaccum;
    @SerializedName("iceaccumMM")
    @Expose
    private Object iceaccumMM;
    @SerializedName("iceaccumIN")
    @Expose
    private Object iceaccumIN;
    @SerializedName("maxHumidity")
    @Expose
    private long maxHumidity;
    @SerializedName("minHumidity")
    @Expose
    private long minHumidity;
    @SerializedName("humidity")
    @Expose
    private long humidity;
    @SerializedName("uvi")
    @Expose
    private long uvi;
    @SerializedName("pressureMB")
    @Expose
    private long pressureMB;
    @SerializedName("pressureIN")
    @Expose
    private double pressureIN;
    @SerializedName("sky")
    @Expose
    private long sky;
    @SerializedName("snowCM")
    @Expose
    private long snowCM;
    @SerializedName("snowIN")
    @Expose
    private long snowIN;
    @SerializedName("feelslikeC")
    @Expose
    private long feelslikeC;
    @SerializedName("feelslikeF")
    @Expose
    private long feelslikeF;
    @SerializedName("minFeelslikeC")
    @Expose
    private long minFeelslikeC;
    @SerializedName("minFeelslikeF")
    @Expose
    private long minFeelslikeF;
    @SerializedName("maxFeelslikeC")
    @Expose
    private long maxFeelslikeC;
    @SerializedName("maxFeelslikeF")
    @Expose
    private long maxFeelslikeF;
    @SerializedName("avgFeelslikeC")
    @Expose
    private long avgFeelslikeC;
    @SerializedName("avgFeelslikeF")
    @Expose
    private long avgFeelslikeF;
    @SerializedName("dewpointC")
    @Expose
    private long dewpointC;
    @SerializedName("dewpointF")
    @Expose
    private long dewpointF;
    @SerializedName("maxDewpointC")
    @Expose
    private long maxDewpointC;
    @SerializedName("maxDewpointF")
    @Expose
    private long maxDewpointF;
    @SerializedName("minDewpointC")
    @Expose
    private long minDewpointC;
    @SerializedName("minDewpointF")
    @Expose
    private long minDewpointF;
    @SerializedName("avgDewpointC")
    @Expose
    private long avgDewpointC;
    @SerializedName("avgDewpointF")
    @Expose
    private long avgDewpointF;
    @SerializedName("windDirDEG")
    @Expose
    private long windDirDEG;
    @SerializedName("windDir")
    @Expose
    private String windDir;
    @SerializedName("windDirMaxDEG")
    @Expose
    private long windDirMaxDEG;
    @SerializedName("windDirMax")
    @Expose
    private String windDirMax;
    @SerializedName("windDirMinDEG")
    @Expose
    private long windDirMinDEG;
    @SerializedName("windDirMin")
    @Expose
    private String windDirMin;
    @SerializedName("windGustKTS")
    @Expose
    private long windGustKTS;
    @SerializedName("windGustKPH")
    @Expose
    private long windGustKPH;
    @SerializedName("windGustMPH")
    @Expose
    private long windGustMPH;
    @SerializedName("windSpeedKTS")
    @Expose
    private long windSpeedKTS;
    @SerializedName("windSpeedKPH")
    @Expose
    private long windSpeedKPH;
    @SerializedName("windSpeedMPH")
    @Expose
    private long windSpeedMPH;
    @SerializedName("windSpeedMaxKTS")
    @Expose
    private long windSpeedMaxKTS;
    @SerializedName("windSpeedMaxKPH")
    @Expose
    private long windSpeedMaxKPH;
    @SerializedName("windSpeedMaxMPH")
    @Expose
    private long windSpeedMaxMPH;
    @SerializedName("windSpeedMinKTS")
    @Expose
    private long windSpeedMinKTS;
    @SerializedName("windSpeedMinKPH")
    @Expose
    private long windSpeedMinKPH;
    @SerializedName("windSpeedMinMPH")
    @Expose
    private long windSpeedMinMPH;
    @SerializedName("windDir80mDEG")
    @Expose
    private long windDir80mDEG;
    @SerializedName("windDir80m")
    @Expose
    private String windDir80m;
    @SerializedName("windDirMax80mDEG")
    @Expose
    private long windDirMax80mDEG;
    @SerializedName("windDirMax80m")
    @Expose
    private String windDirMax80m;
    @SerializedName("windDirMin80mDEG")
    @Expose
    private long windDirMin80mDEG;
    @SerializedName("windDirMin80m")
    @Expose
    private String windDirMin80m;
    @SerializedName("windGust80mKTS")
    @Expose
    private long windGust80mKTS;
    @SerializedName("windGust80mKPH")
    @Expose
    private long windGust80mKPH;
    @SerializedName("windGust80mMPH")
    @Expose
    private long windGust80mMPH;
    @SerializedName("windSpeed80mKTS")
    @Expose
    private long windSpeed80mKTS;
    @SerializedName("windSpeed80mKPH")
    @Expose
    private long windSpeed80mKPH;
    @SerializedName("windSpeed80mMPH")
    @Expose
    private long windSpeed80mMPH;
    @SerializedName("windSpeedMax80mKTS")
    @Expose
    private long windSpeedMax80mKTS;
    @SerializedName("windSpeedMax80mKPH")
    @Expose
    private long windSpeedMax80mKPH;
    @SerializedName("windSpeedMax80mMPH")
    @Expose
    private long windSpeedMax80mMPH;
    @SerializedName("windSpeedMin80mKTS")
    @Expose
    private long windSpeedMin80mKTS;
    @SerializedName("windSpeedMin80mKPH")
    @Expose
    private long windSpeedMin80mKPH;
    @SerializedName("windSpeedMin80mMPH")
    @Expose
    private long windSpeedMin80mMPH;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("weatherCoded")
    @Expose
    private List<Object> weatherCoded = null;
    @SerializedName("weatherPrimary")
    @Expose
    private String weatherPrimary;
    @SerializedName("weatherPrimaryCoded")
    @Expose
    private String weatherPrimaryCoded;
    @SerializedName("cloudsCoded")
    @Expose
    private String cloudsCoded;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("isDay")
    @Expose
    private boolean isDay;
    @SerializedName("sunrise")
    @Expose
    private long sunrise;
    @SerializedName("sunriseISO")
    @Expose
    private String sunriseISO;
    @SerializedName("sunset")
    @Expose
    private long sunset;
    @SerializedName("sunsetISO")
    @Expose
    private String sunsetISO;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Period withTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public Period withValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }

    public void setDateTimeISO(String dateTimeISO) {
        this.dateTimeISO = dateTimeISO;
    }

    public Period withDateTimeISO(String dateTimeISO) {
        this.dateTimeISO = dateTimeISO;
        return this;
    }

    public long getMaxTempC() {
        return maxTempC;
    }

    public void setMaxTempC(long maxTempC) {
        this.maxTempC = maxTempC;
    }

    public Period withMaxTempC(long maxTempC) {
        this.maxTempC = maxTempC;
        return this;
    }

    public long getMaxTempF() {
        return maxTempF;
    }

    public void setMaxTempF(long maxTempF) {
        this.maxTempF = maxTempF;
    }

    public Period withMaxTempF(long maxTempF) {
        this.maxTempF = maxTempF;
        return this;
    }

    public long getMinTempC() {
        return minTempC;
    }

    public void setMinTempC(long minTempC) {
        this.minTempC = minTempC;
    }

    public Period withMinTempC(long minTempC) {
        this.minTempC = minTempC;
        return this;
    }

    public long getMinTempF() {
        return minTempF;
    }

    public void setMinTempF(long minTempF) {
        this.minTempF = minTempF;
    }

    public Period withMinTempF(long minTempF) {
        this.minTempF = minTempF;
        return this;
    }

    public long getAvgTempC() {
        return avgTempC;
    }

    public void setAvgTempC(long avgTempC) {
        this.avgTempC = avgTempC;
    }

    public Period withAvgTempC(long avgTempC) {
        this.avgTempC = avgTempC;
        return this;
    }

    public long getAvgTempF() {
        return avgTempF;
    }

    public void setAvgTempF(long avgTempF) {
        this.avgTempF = avgTempF;
    }

    public Period withAvgTempF(long avgTempF) {
        this.avgTempF = avgTempF;
        return this;
    }

    public Object getTempC() {
        return tempC;
    }

    public void setTempC(Object tempC) {
        this.tempC = tempC;
    }

    public Period withTempC(Object tempC) {
        this.tempC = tempC;
        return this;
    }

    public Object getTempF() {
        return tempF;
    }

    public void setTempF(Object tempF) {
        this.tempF = tempF;
    }

    public Period withTempF(Object tempF) {
        this.tempF = tempF;
        return this;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public Period withPop(long pop) {
        this.pop = pop;
        return this;
    }

    public double getPrecipMM() {
        return precipMM;
    }

    public void setPrecipMM(double precipMM) {
        this.precipMM = precipMM;
    }

    public Period withPrecipMM(double precipMM) {
        this.precipMM = precipMM;
        return this;
    }

    public long getPrecipIN() {
        return precipIN;
    }

    public void setPrecipIN(long precipIN) {
        this.precipIN = precipIN;
    }

    public Period withPrecipIN(long precipIN) {
        this.precipIN = precipIN;
        return this;
    }

    public Object getIceaccum() {
        return iceaccum;
    }

    public void setIceaccum(Object iceaccum) {
        this.iceaccum = iceaccum;
    }

    public Period withIceaccum(Object iceaccum) {
        this.iceaccum = iceaccum;
        return this;
    }

    public Object getIceaccumMM() {
        return iceaccumMM;
    }

    public void setIceaccumMM(Object iceaccumMM) {
        this.iceaccumMM = iceaccumMM;
    }

    public Period withIceaccumMM(Object iceaccumMM) {
        this.iceaccumMM = iceaccumMM;
        return this;
    }

    public Object getIceaccumIN() {
        return iceaccumIN;
    }

    public void setIceaccumIN(Object iceaccumIN) {
        this.iceaccumIN = iceaccumIN;
    }

    public Period withIceaccumIN(Object iceaccumIN) {
        this.iceaccumIN = iceaccumIN;
        return this;
    }

    public long getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(long maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public Period withMaxHumidity(long maxHumidity) {
        this.maxHumidity = maxHumidity;
        return this;
    }

    public long getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(long minHumidity) {
        this.minHumidity = minHumidity;
    }

    public Period withMinHumidity(long minHumidity) {
        this.minHumidity = minHumidity;
        return this;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Period withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    public long getUvi() {
        return uvi;
    }

    public void setUvi(long uvi) {
        this.uvi = uvi;
    }

    public Period withUvi(long uvi) {
        this.uvi = uvi;
        return this;
    }

    public long getPressureMB() {
        return pressureMB;
    }

    public void setPressureMB(long pressureMB) {
        this.pressureMB = pressureMB;
    }

    public Period withPressureMB(long pressureMB) {
        this.pressureMB = pressureMB;
        return this;
    }

    public double getPressureIN() {
        return pressureIN;
    }

    public void setPressureIN(double pressureIN) {
        this.pressureIN = pressureIN;
    }

    public Period withPressureIN(double pressureIN) {
        this.pressureIN = pressureIN;
        return this;
    }

    public long getSky() {
        return sky;
    }

    public void setSky(long sky) {
        this.sky = sky;
    }

    public Period withSky(long sky) {
        this.sky = sky;
        return this;
    }

    public long getSnowCM() {
        return snowCM;
    }

    public void setSnowCM(long snowCM) {
        this.snowCM = snowCM;
    }

    public Period withSnowCM(long snowCM) {
        this.snowCM = snowCM;
        return this;
    }

    public long getSnowIN() {
        return snowIN;
    }

    public void setSnowIN(long snowIN) {
        this.snowIN = snowIN;
    }

    public Period withSnowIN(long snowIN) {
        this.snowIN = snowIN;
        return this;
    }

    public long getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(long feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Period withFeelslikeC(long feelslikeC) {
        this.feelslikeC = feelslikeC;
        return this;
    }

    public long getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(long feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Period withFeelslikeF(long feelslikeF) {
        this.feelslikeF = feelslikeF;
        return this;
    }

    public long getMinFeelslikeC() {
        return minFeelslikeC;
    }

    public void setMinFeelslikeC(long minFeelslikeC) {
        this.minFeelslikeC = minFeelslikeC;
    }

    public Period withMinFeelslikeC(long minFeelslikeC) {
        this.minFeelslikeC = minFeelslikeC;
        return this;
    }

    public long getMinFeelslikeF() {
        return minFeelslikeF;
    }

    public void setMinFeelslikeF(long minFeelslikeF) {
        this.minFeelslikeF = minFeelslikeF;
    }

    public Period withMinFeelslikeF(long minFeelslikeF) {
        this.minFeelslikeF = minFeelslikeF;
        return this;
    }

    public long getMaxFeelslikeC() {
        return maxFeelslikeC;
    }

    public void setMaxFeelslikeC(long maxFeelslikeC) {
        this.maxFeelslikeC = maxFeelslikeC;
    }

    public Period withMaxFeelslikeC(long maxFeelslikeC) {
        this.maxFeelslikeC = maxFeelslikeC;
        return this;
    }

    public long getMaxFeelslikeF() {
        return maxFeelslikeF;
    }

    public void setMaxFeelslikeF(long maxFeelslikeF) {
        this.maxFeelslikeF = maxFeelslikeF;
    }

    public Period withMaxFeelslikeF(long maxFeelslikeF) {
        this.maxFeelslikeF = maxFeelslikeF;
        return this;
    }

    public long getAvgFeelslikeC() {
        return avgFeelslikeC;
    }

    public void setAvgFeelslikeC(long avgFeelslikeC) {
        this.avgFeelslikeC = avgFeelslikeC;
    }

    public Period withAvgFeelslikeC(long avgFeelslikeC) {
        this.avgFeelslikeC = avgFeelslikeC;
        return this;
    }

    public long getAvgFeelslikeF() {
        return avgFeelslikeF;
    }

    public void setAvgFeelslikeF(long avgFeelslikeF) {
        this.avgFeelslikeF = avgFeelslikeF;
    }

    public Period withAvgFeelslikeF(long avgFeelslikeF) {
        this.avgFeelslikeF = avgFeelslikeF;
        return this;
    }

    public long getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(long dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Period withDewpointC(long dewpointC) {
        this.dewpointC = dewpointC;
        return this;
    }

    public long getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(long dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Period withDewpointF(long dewpointF) {
        this.dewpointF = dewpointF;
        return this;
    }

    public long getMaxDewpointC() {
        return maxDewpointC;
    }

    public void setMaxDewpointC(long maxDewpointC) {
        this.maxDewpointC = maxDewpointC;
    }

    public Period withMaxDewpointC(long maxDewpointC) {
        this.maxDewpointC = maxDewpointC;
        return this;
    }

    public long getMaxDewpointF() {
        return maxDewpointF;
    }

    public void setMaxDewpointF(long maxDewpointF) {
        this.maxDewpointF = maxDewpointF;
    }

    public Period withMaxDewpointF(long maxDewpointF) {
        this.maxDewpointF = maxDewpointF;
        return this;
    }

    public long getMinDewpointC() {
        return minDewpointC;
    }

    public void setMinDewpointC(long minDewpointC) {
        this.minDewpointC = minDewpointC;
    }

    public Period withMinDewpointC(long minDewpointC) {
        this.minDewpointC = minDewpointC;
        return this;
    }

    public long getMinDewpointF() {
        return minDewpointF;
    }

    public void setMinDewpointF(long minDewpointF) {
        this.minDewpointF = minDewpointF;
    }

    public Period withMinDewpointF(long minDewpointF) {
        this.minDewpointF = minDewpointF;
        return this;
    }

    public long getAvgDewpointC() {
        return avgDewpointC;
    }

    public void setAvgDewpointC(long avgDewpointC) {
        this.avgDewpointC = avgDewpointC;
    }

    public Period withAvgDewpointC(long avgDewpointC) {
        this.avgDewpointC = avgDewpointC;
        return this;
    }

    public long getAvgDewpointF() {
        return avgDewpointF;
    }

    public void setAvgDewpointF(long avgDewpointF) {
        this.avgDewpointF = avgDewpointF;
    }

    public Period withAvgDewpointF(long avgDewpointF) {
        this.avgDewpointF = avgDewpointF;
        return this;
    }

    public long getWindDirDEG() {
        return windDirDEG;
    }

    public void setWindDirDEG(long windDirDEG) {
        this.windDirDEG = windDirDEG;
    }

    public Period withWindDirDEG(long windDirDEG) {
        this.windDirDEG = windDirDEG;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Period withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public long getWindDirMaxDEG() {
        return windDirMaxDEG;
    }

    public void setWindDirMaxDEG(long windDirMaxDEG) {
        this.windDirMaxDEG = windDirMaxDEG;
    }

    public Period withWindDirMaxDEG(long windDirMaxDEG) {
        this.windDirMaxDEG = windDirMaxDEG;
        return this;
    }

    public String getWindDirMax() {
        return windDirMax;
    }

    public void setWindDirMax(String windDirMax) {
        this.windDirMax = windDirMax;
    }

    public Period withWindDirMax(String windDirMax) {
        this.windDirMax = windDirMax;
        return this;
    }

    public long getWindDirMinDEG() {
        return windDirMinDEG;
    }

    public void setWindDirMinDEG(long windDirMinDEG) {
        this.windDirMinDEG = windDirMinDEG;
    }

    public Period withWindDirMinDEG(long windDirMinDEG) {
        this.windDirMinDEG = windDirMinDEG;
        return this;
    }

    public String getWindDirMin() {
        return windDirMin;
    }

    public void setWindDirMin(String windDirMin) {
        this.windDirMin = windDirMin;
    }

    public Period withWindDirMin(String windDirMin) {
        this.windDirMin = windDirMin;
        return this;
    }

    public long getWindGustKTS() {
        return windGustKTS;
    }

    public void setWindGustKTS(long windGustKTS) {
        this.windGustKTS = windGustKTS;
    }

    public Period withWindGustKTS(long windGustKTS) {
        this.windGustKTS = windGustKTS;
        return this;
    }

    public long getWindGustKPH() {
        return windGustKPH;
    }

    public void setWindGustKPH(long windGustKPH) {
        this.windGustKPH = windGustKPH;
    }

    public Period withWindGustKPH(long windGustKPH) {
        this.windGustKPH = windGustKPH;
        return this;
    }

    public long getWindGustMPH() {
        return windGustMPH;
    }

    public void setWindGustMPH(long windGustMPH) {
        this.windGustMPH = windGustMPH;
    }

    public Period withWindGustMPH(long windGustMPH) {
        this.windGustMPH = windGustMPH;
        return this;
    }

    public long getWindSpeedKTS() {
        return windSpeedKTS;
    }

    public void setWindSpeedKTS(long windSpeedKTS) {
        this.windSpeedKTS = windSpeedKTS;
    }

    public Period withWindSpeedKTS(long windSpeedKTS) {
        this.windSpeedKTS = windSpeedKTS;
        return this;
    }

    public long getWindSpeedKPH() {
        return windSpeedKPH;
    }

    public void setWindSpeedKPH(long windSpeedKPH) {
        this.windSpeedKPH = windSpeedKPH;
    }

    public Period withWindSpeedKPH(long windSpeedKPH) {
        this.windSpeedKPH = windSpeedKPH;
        return this;
    }

    public long getWindSpeedMPH() {
        return windSpeedMPH;
    }

    public void setWindSpeedMPH(long windSpeedMPH) {
        this.windSpeedMPH = windSpeedMPH;
    }

    public Period withWindSpeedMPH(long windSpeedMPH) {
        this.windSpeedMPH = windSpeedMPH;
        return this;
    }

    public long getWindSpeedMaxKTS() {
        return windSpeedMaxKTS;
    }

    public void setWindSpeedMaxKTS(long windSpeedMaxKTS) {
        this.windSpeedMaxKTS = windSpeedMaxKTS;
    }

    public Period withWindSpeedMaxKTS(long windSpeedMaxKTS) {
        this.windSpeedMaxKTS = windSpeedMaxKTS;
        return this;
    }

    public long getWindSpeedMaxKPH() {
        return windSpeedMaxKPH;
    }

    public void setWindSpeedMaxKPH(long windSpeedMaxKPH) {
        this.windSpeedMaxKPH = windSpeedMaxKPH;
    }

    public Period withWindSpeedMaxKPH(long windSpeedMaxKPH) {
        this.windSpeedMaxKPH = windSpeedMaxKPH;
        return this;
    }

    public long getWindSpeedMaxMPH() {
        return windSpeedMaxMPH;
    }

    public void setWindSpeedMaxMPH(long windSpeedMaxMPH) {
        this.windSpeedMaxMPH = windSpeedMaxMPH;
    }

    public Period withWindSpeedMaxMPH(long windSpeedMaxMPH) {
        this.windSpeedMaxMPH = windSpeedMaxMPH;
        return this;
    }

    public long getWindSpeedMinKTS() {
        return windSpeedMinKTS;
    }

    public void setWindSpeedMinKTS(long windSpeedMinKTS) {
        this.windSpeedMinKTS = windSpeedMinKTS;
    }

    public Period withWindSpeedMinKTS(long windSpeedMinKTS) {
        this.windSpeedMinKTS = windSpeedMinKTS;
        return this;
    }

    public long getWindSpeedMinKPH() {
        return windSpeedMinKPH;
    }

    public void setWindSpeedMinKPH(long windSpeedMinKPH) {
        this.windSpeedMinKPH = windSpeedMinKPH;
    }

    public Period withWindSpeedMinKPH(long windSpeedMinKPH) {
        this.windSpeedMinKPH = windSpeedMinKPH;
        return this;
    }

    public long getWindSpeedMinMPH() {
        return windSpeedMinMPH;
    }

    public void setWindSpeedMinMPH(long windSpeedMinMPH) {
        this.windSpeedMinMPH = windSpeedMinMPH;
    }

    public Period withWindSpeedMinMPH(long windSpeedMinMPH) {
        this.windSpeedMinMPH = windSpeedMinMPH;
        return this;
    }

    public long getWindDir80mDEG() {
        return windDir80mDEG;
    }

    public void setWindDir80mDEG(long windDir80mDEG) {
        this.windDir80mDEG = windDir80mDEG;
    }

    public Period withWindDir80mDEG(long windDir80mDEG) {
        this.windDir80mDEG = windDir80mDEG;
        return this;
    }

    public String getWindDir80m() {
        return windDir80m;
    }

    public void setWindDir80m(String windDir80m) {
        this.windDir80m = windDir80m;
    }

    public Period withWindDir80m(String windDir80m) {
        this.windDir80m = windDir80m;
        return this;
    }

    public long getWindDirMax80mDEG() {
        return windDirMax80mDEG;
    }

    public void setWindDirMax80mDEG(long windDirMax80mDEG) {
        this.windDirMax80mDEG = windDirMax80mDEG;
    }

    public Period withWindDirMax80mDEG(long windDirMax80mDEG) {
        this.windDirMax80mDEG = windDirMax80mDEG;
        return this;
    }

    public String getWindDirMax80m() {
        return windDirMax80m;
    }

    public void setWindDirMax80m(String windDirMax80m) {
        this.windDirMax80m = windDirMax80m;
    }

    public Period withWindDirMax80m(String windDirMax80m) {
        this.windDirMax80m = windDirMax80m;
        return this;
    }

    public long getWindDirMin80mDEG() {
        return windDirMin80mDEG;
    }

    public void setWindDirMin80mDEG(long windDirMin80mDEG) {
        this.windDirMin80mDEG = windDirMin80mDEG;
    }

    public Period withWindDirMin80mDEG(long windDirMin80mDEG) {
        this.windDirMin80mDEG = windDirMin80mDEG;
        return this;
    }

    public String getWindDirMin80m() {
        return windDirMin80m;
    }

    public void setWindDirMin80m(String windDirMin80m) {
        this.windDirMin80m = windDirMin80m;
    }

    public Period withWindDirMin80m(String windDirMin80m) {
        this.windDirMin80m = windDirMin80m;
        return this;
    }

    public long getWindGust80mKTS() {
        return windGust80mKTS;
    }

    public void setWindGust80mKTS(long windGust80mKTS) {
        this.windGust80mKTS = windGust80mKTS;
    }

    public Period withWindGust80mKTS(long windGust80mKTS) {
        this.windGust80mKTS = windGust80mKTS;
        return this;
    }

    public long getWindGust80mKPH() {
        return windGust80mKPH;
    }

    public void setWindGust80mKPH(long windGust80mKPH) {
        this.windGust80mKPH = windGust80mKPH;
    }

    public Period withWindGust80mKPH(long windGust80mKPH) {
        this.windGust80mKPH = windGust80mKPH;
        return this;
    }

    public long getWindGust80mMPH() {
        return windGust80mMPH;
    }

    public void setWindGust80mMPH(long windGust80mMPH) {
        this.windGust80mMPH = windGust80mMPH;
    }

    public Period withWindGust80mMPH(long windGust80mMPH) {
        this.windGust80mMPH = windGust80mMPH;
        return this;
    }

    public long getWindSpeed80mKTS() {
        return windSpeed80mKTS;
    }

    public void setWindSpeed80mKTS(long windSpeed80mKTS) {
        this.windSpeed80mKTS = windSpeed80mKTS;
    }

    public Period withWindSpeed80mKTS(long windSpeed80mKTS) {
        this.windSpeed80mKTS = windSpeed80mKTS;
        return this;
    }

    public long getWindSpeed80mKPH() {
        return windSpeed80mKPH;
    }

    public void setWindSpeed80mKPH(long windSpeed80mKPH) {
        this.windSpeed80mKPH = windSpeed80mKPH;
    }

    public Period withWindSpeed80mKPH(long windSpeed80mKPH) {
        this.windSpeed80mKPH = windSpeed80mKPH;
        return this;
    }

    public long getWindSpeed80mMPH() {
        return windSpeed80mMPH;
    }

    public void setWindSpeed80mMPH(long windSpeed80mMPH) {
        this.windSpeed80mMPH = windSpeed80mMPH;
    }

    public Period withWindSpeed80mMPH(long windSpeed80mMPH) {
        this.windSpeed80mMPH = windSpeed80mMPH;
        return this;
    }

    public long getWindSpeedMax80mKTS() {
        return windSpeedMax80mKTS;
    }

    public void setWindSpeedMax80mKTS(long windSpeedMax80mKTS) {
        this.windSpeedMax80mKTS = windSpeedMax80mKTS;
    }

    public Period withWindSpeedMax80mKTS(long windSpeedMax80mKTS) {
        this.windSpeedMax80mKTS = windSpeedMax80mKTS;
        return this;
    }

    public long getWindSpeedMax80mKPH() {
        return windSpeedMax80mKPH;
    }

    public void setWindSpeedMax80mKPH(long windSpeedMax80mKPH) {
        this.windSpeedMax80mKPH = windSpeedMax80mKPH;
    }

    public Period withWindSpeedMax80mKPH(long windSpeedMax80mKPH) {
        this.windSpeedMax80mKPH = windSpeedMax80mKPH;
        return this;
    }

    public long getWindSpeedMax80mMPH() {
        return windSpeedMax80mMPH;
    }

    public void setWindSpeedMax80mMPH(long windSpeedMax80mMPH) {
        this.windSpeedMax80mMPH = windSpeedMax80mMPH;
    }

    public Period withWindSpeedMax80mMPH(long windSpeedMax80mMPH) {
        this.windSpeedMax80mMPH = windSpeedMax80mMPH;
        return this;
    }

    public long getWindSpeedMin80mKTS() {
        return windSpeedMin80mKTS;
    }

    public void setWindSpeedMin80mKTS(long windSpeedMin80mKTS) {
        this.windSpeedMin80mKTS = windSpeedMin80mKTS;
    }

    public Period withWindSpeedMin80mKTS(long windSpeedMin80mKTS) {
        this.windSpeedMin80mKTS = windSpeedMin80mKTS;
        return this;
    }

    public long getWindSpeedMin80mKPH() {
        return windSpeedMin80mKPH;
    }

    public void setWindSpeedMin80mKPH(long windSpeedMin80mKPH) {
        this.windSpeedMin80mKPH = windSpeedMin80mKPH;
    }

    public Period withWindSpeedMin80mKPH(long windSpeedMin80mKPH) {
        this.windSpeedMin80mKPH = windSpeedMin80mKPH;
        return this;
    }

    public long getWindSpeedMin80mMPH() {
        return windSpeedMin80mMPH;
    }

    public void setWindSpeedMin80mMPH(long windSpeedMin80mMPH) {
        this.windSpeedMin80mMPH = windSpeedMin80mMPH;
    }

    public Period withWindSpeedMin80mMPH(long windSpeedMin80mMPH) {
        this.windSpeedMin80mMPH = windSpeedMin80mMPH;
        return this;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Period withWeather(String weather) {
        this.weather = weather;
        return this;
    }

    public List<Object> getWeatherCoded() {
        return weatherCoded;
    }

    public void setWeatherCoded(List<Object> weatherCoded) {
        this.weatherCoded = weatherCoded;
    }

    public Period withWeatherCoded(List<Object> weatherCoded) {
        this.weatherCoded = weatherCoded;
        return this;
    }

    public String getWeatherPrimary() {
        return weatherPrimary;
    }

    public void setWeatherPrimary(String weatherPrimary) {
        this.weatherPrimary = weatherPrimary;
    }

    public Period withWeatherPrimary(String weatherPrimary) {
        this.weatherPrimary = weatherPrimary;
        return this;
    }

    public String getWeatherPrimaryCoded() {
        return weatherPrimaryCoded;
    }

    public void setWeatherPrimaryCoded(String weatherPrimaryCoded) {
        this.weatherPrimaryCoded = weatherPrimaryCoded;
    }

    public Period withWeatherPrimaryCoded(String weatherPrimaryCoded) {
        this.weatherPrimaryCoded = weatherPrimaryCoded;
        return this;
    }

    public String getCloudsCoded() {
        return cloudsCoded;
    }

    public void setCloudsCoded(String cloudsCoded) {
        this.cloudsCoded = cloudsCoded;
    }

    public Period withCloudsCoded(String cloudsCoded) {
        this.cloudsCoded = cloudsCoded;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Period withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public boolean isIsDay() {
        return isDay;
    }

    public void setIsDay(boolean isDay) {
        this.isDay = isDay;
    }

    public Period withIsDay(boolean isDay) {
        this.isDay = isDay;
        return this;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public Period withSunrise(long sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public String getSunriseISO() {
        return sunriseISO;
    }

    public void setSunriseISO(String sunriseISO) {
        this.sunriseISO = sunriseISO;
    }

    public Period withSunriseISO(String sunriseISO) {
        this.sunriseISO = sunriseISO;
        return this;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public Period withSunset(long sunset) {
        this.sunset = sunset;
        return this;
    }

    public String getSunsetISO() {
        return sunsetISO;
    }

    public void setSunsetISO(String sunsetISO) {
        this.sunsetISO = sunsetISO;
    }

    public Period withSunsetISO(String sunsetISO) {
        this.sunsetISO = sunsetISO;
        return this;
    }

}
