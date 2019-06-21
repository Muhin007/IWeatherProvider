
package com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.JSONClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Temp {

    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Temp withSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Temp withError(Object error) {
        this.error = error;
        return this;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public Temp withResponse(List<Response> response) {
        this.response = response;
        return this;
    }

}
