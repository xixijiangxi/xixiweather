package com.xixiweather.android.weatherdb;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;    //默认序号
    private String countyName;    //县名字
    private String weatherId;    //天气id
    private int cityId;     //关联的城市id

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }

}
