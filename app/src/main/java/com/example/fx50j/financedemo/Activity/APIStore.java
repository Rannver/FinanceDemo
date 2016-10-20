package com.example.fx50j.financedemo.Activity;

import android.app.Application;

import com.baidu.apistore.sdk.ApiStoreSDK;

/**
 * Created by FX50J on 2016/10/11.
 */

public class APIStore extends Application{
    @Override
    public void onCreate() {
        ApiStoreSDK.init(this,"9fc29d5497de5ac40264e96a2096af3e");
        super.onCreate();
    }
}
