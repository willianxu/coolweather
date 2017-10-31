package com.willian.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by willian on 2017/10/31.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String info;
}
