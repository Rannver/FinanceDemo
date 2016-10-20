package com.example.fx50j.financedemo.Data;

import android.util.Log;

import com.example.fx50j.financedemo.Bean.StockNowInformationGsonBean;
import com.google.gson.Gson;

/**
 * Created by FX50J on 2016/10/14.
 */

public class StockNowInformationData {

    private String res;
    private StockNowInformationGsonBean.ShowapiResBodyBean.StockMarketBean marketBean;
    private StockNowInformationGsonBean.ShowapiResBodyBean.KPicBean kPicBean;

    public void SetStockDataRes(String s){
        res = s;
    }

    public void CheckStockData_Now(){
        Log.d("Check_res",res);
        Gson gson = new Gson();
        StockNowInformationGsonBean stockNowInformationGsonBean = gson.fromJson(res,StockNowInformationGsonBean.class);
        marketBean = stockNowInformationGsonBean.getShowapi_res_body().getStockMarket();
        kPicBean = stockNowInformationGsonBean.getShowapi_res_body().getK_pic();
    }

    public StockNowInformationGsonBean.ShowapiResBodyBean.StockMarketBean GetStockNowInformation(){
        return marketBean;
    }
    public StockNowInformationGsonBean.ShowapiResBodyBean.KPicBean GetStockImageK(){
        return kPicBean;
    }


}
