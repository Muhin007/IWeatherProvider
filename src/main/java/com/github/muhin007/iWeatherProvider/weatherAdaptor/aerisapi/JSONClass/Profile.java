
package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("tz")
    @Expose
    private String tz;

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public Profile withTz(String tz) {
        this.tz = tz;
        return this;
    }

}
