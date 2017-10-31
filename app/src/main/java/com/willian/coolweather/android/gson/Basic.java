package com.willian.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by willian on 2017/10/31.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;
    @SerializedName("cid")
    public String weatherId;

}
