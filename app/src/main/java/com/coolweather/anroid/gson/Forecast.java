package com.coolweather.anroid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kiwi7 on 2017/5/1.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperaure;

    @SerializedName("comd")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
