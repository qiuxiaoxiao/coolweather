package com.jiangda.qiucheng.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by qiucheng on 2017/5/15.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private int countyId;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public int getCountyId(){
        return countyId;
    }
    public void setCountyId(int countyId){
        this.countyId = countyId;
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
