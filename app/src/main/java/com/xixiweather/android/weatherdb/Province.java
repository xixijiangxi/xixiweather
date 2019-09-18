package com.xixiweather.android.weatherdb;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;     //默认序号
    private String provinceName;  //省份名字
    private int provinceCode;    //省份代码

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(){
        this.provinceCode = provinceCode;
    }
}
