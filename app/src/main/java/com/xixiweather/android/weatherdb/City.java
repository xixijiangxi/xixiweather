package com.xixiweather.android.weatherdb;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;    //默认序号
    private String cityName;    //城市名字
    private int cityCode;    //城市代码
    private int provinceId;      //关联的省份id

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

}
