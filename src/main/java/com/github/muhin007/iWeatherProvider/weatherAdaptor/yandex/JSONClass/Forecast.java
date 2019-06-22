
package com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.JSONClass;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_ts")
    @Expose
    private long dateTs;
    @SerializedName("week")
    @Expose
    private long week;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("moon_code")
    @Expose
    private long moonCode;
    @SerializedName("moon_text")
    @Expose
    private String moonText;
    @SerializedName("parts")
    @Expose
    private List<Part> parts = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Forecast withDate(String date) {
        this.date = date;
        return this;
    }

    public long getDateTs() {
        return dateTs;
    }

    public void setDateTs(long dateTs) {
        this.dateTs = dateTs;
    }

    public Forecast withDateTs(long dateTs) {
        this.dateTs = dateTs;
        return this;
    }

    public long getWeek() {
        return week;
    }

    public void setWeek(long week) {
        this.week = week;
    }

    public Forecast withWeek(long week) {
        this.week = week;
        return this;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Forecast withSunrise(String sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Forecast withSunset(String sunset) {
        this.sunset = sunset;
        return this;
    }

    public long getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(long moonCode) {
        this.moonCode = moonCode;
    }

    public Forecast withMoonCode(long moonCode) {
        this.moonCode = moonCode;
        return this;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public Forecast withMoonText(String moonText) {
        this.moonText = moonText;
        return this;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public Forecast withParts(List<Part> parts) {
        this.parts = parts;
        return this;
    }

}
