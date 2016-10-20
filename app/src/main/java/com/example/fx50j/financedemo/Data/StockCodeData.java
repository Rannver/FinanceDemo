package com.example.fx50j.financedemo.Data;

import android.util.Log;

import com.example.fx50j.financedemo.Bean.StockCodeGsonBean;
import com.google.gson.Gson;

import java.util.List;

/**
 * 用于处理返回的Json格式字符串的内部类
 */

public class StockCodeData {

    private String res;
    private List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> listBeanList;

    public void SetStockData(String s){
        res = s;
    }

    public void CheckStockData(){
        Gson CodeGson =new Gson();
        StockCodeGsonBean stockCodeGsonBean = CodeGson.fromJson(res,StockCodeGsonBean.class);
        StockCodeGsonBean.ShowapiResBodyBean showapiResBodyBean = stockCodeGsonBean.getShowapi_res_body();
        List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> list = showapiResBodyBean.getList();
        Log.d("st", String.valueOf(list.size()));
        for (int a=0;a<list.size();a++){
            StockCodeGsonBean.ShowapiResBodyBean.ListBean listBean = list.get(a);
            String code = listBean.getCode();
            Log.d("staus",code);
            listBeanList = list;
        }
    }

    public List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> ShowStockCode(){
        return listBeanList;
    }

    public String ShowStockFirstCode(){
        StockCodeGsonBean.ShowapiResBodyBean.ListBean listBean = listBeanList.get(0);
        String code = listBean.getCode();
        return code;
    }

}
