package com.example.fx50j.financedemo.Adpter;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by FX50J on 2016/10/11.
 */

public class TextViewContext extends AppCompatActivity {

    private int FLAG;
    private String STOCK_NAME = "";

    public void TextInputCheck(String s) {

        if (FlagString(TextCheckStock(s))) {
            FLAG = 1;
        } else if(FlagString(TextCheckCode(s))){
            FLAG = 2;
        }
        else{
            FLAG = 3;
        }

    }

    public String ShowStockName(){
        return STOCK_NAME;
    }

    public int ShowStockFlag(){
        return FLAG;
    }

    private boolean FlagString(String s) {
        if (s != null) {
            return true;
        } else {
            return false;
        }
    }

    private String TextCheckStock(String s) {
        String key_stock = "股票";
        String key_price = "价格";
        String key_market = "行情";
        String key_code = "股票代码";
        String name = "";
        if (s != null && (s.contains(key_stock)||s.contains(key_market)||s.contains(key_price))&&!s.contains(key_code)) {

            name = s.substring(0, s.indexOf("的"));
            STOCK_NAME =name;

        } else {

            name = null;
            STOCK_NAME =name;

        }
        return name;
    }

    private String TextCheckCode(String s) {
        String key = "股票代码";
        String name  = "";
        if(s!=null&&s.contains(key)){
            name = s.substring(0,s.indexOf("的"));
            STOCK_NAME =name;
        }else {
            name = null;
            STOCK_NAME =name;
        }
        return name;
    }

}
