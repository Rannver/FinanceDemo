package com.example.fx50j.financedemo.Data;

import android.util.Log;

import com.example.fx50j.financedemo.Bean.StockHistoryGsonBean;
import com.google.gson.Gson;

import java.util.List;

/**
 * 股票历史数据的处理的内部类Bean
 */

public class StockHistoryData {
    String res;
    List<StockHistoryGsonBean.ResultBean.TimeChartBean.PBean> TimeCharPBeanList;

    public void SetStockData(String s){
        res = s;
    }

    public void CheckStockData(){
        Gson gson = new Gson();
        StockHistoryGsonBean stockHistoryGsonBean = gson.fromJson(res,StockHistoryGsonBean.class);
        TimeCharPBeanList = stockHistoryGsonBean.getResult().getTimeChart().getP();
        Log.d("历史数据",TimeCharPBeanList.get(0).getPrice());
    }

    public  List<StockHistoryGsonBean.ResultBean.TimeChartBean.PBean> GetStockTimeCharBeanList(){
        return TimeCharPBeanList;
    }
}
