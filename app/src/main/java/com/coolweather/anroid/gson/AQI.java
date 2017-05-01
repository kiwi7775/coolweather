package com.coolweather.anroid.gson;

/**
 * Created by Kiwi7 on 2017/5/1.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
