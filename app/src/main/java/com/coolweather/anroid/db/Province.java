package com.coolweather.anroid.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Kiwi7 on 2017/4/20.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
