package com.example.fx50j.financedemo.Data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by FX50J on 2016/10/20.
 */

public class StockImageK {
    public static void OnLoadImage(final URL url,final OnLoadImageListener onLoadImageListener){
        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                onLoadImageListener.OnLoadImage((Bitmap) msg.obj,null);
                super.handleMessage(msg);
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                URL imageUrl = url;
                try {
                    HttpURLConnection httpconn = (HttpURLConnection) imageUrl.openConnection();
                    InputStream input = httpconn.getInputStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(input);
                    Message msg = new Message();
                    msg.obj = bitmap;
                    handler.sendMessage(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public interface OnLoadImageListener{
        public void OnLoadImage(Bitmap bitmap,String bitmapPath);
    }
}
