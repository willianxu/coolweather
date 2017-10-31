package com.willian.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by willian on 2017/10/31.
 */

public class Weather {
    public String status;
    public Basic basic;
    @SerializedName("lifestyle")
    public List<LifeStyle> lifeStyles;
    public Now now;
    public Update update;
    @SerializedName("daily_forecast")
    public List<Forecast> forecasts;
}
