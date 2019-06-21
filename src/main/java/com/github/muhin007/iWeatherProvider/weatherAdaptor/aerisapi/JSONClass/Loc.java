
package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loc {

    @SerializedName("long")
    @Expose
    private double _long;
    @SerializedName("lat")
    @Expose
    private double lat;

    public double getLong() {
        return _long;
    }

    public void setLong(double _long) {
        this._long = _long;
    }

    public Loc withLong(double _long) {
        this._long = _long;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Loc withLat(double lat) {
        this.lat = lat;
        return this;
    }

}
