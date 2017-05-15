package com.jiangda.qiucheng.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by qiucheng on 2017/5/15.
 */

public class Province extends DataSupport {//LitePal中的每一个实体类都必须要继承自DataSupport类
    private int id; //每个实体类该有的字段
    private String provinceName;//记录省的名字
    private int provinceCode;//记录省的代号

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
}
