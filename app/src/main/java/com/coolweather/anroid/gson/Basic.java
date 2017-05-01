package com.coolweather.anroid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kiwi7 on 2017/5/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

