package com.example.fx50j.financedemo.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fx50j.financedemo.Adpter.TextViewContext;
import com.example.fx50j.financedemo.Bean.StockCodeGsonBean;
import com.example.fx50j.financedemo.Bean.StockNowInformationGsonBean;
import com.example.fx50j.financedemo.Data.StockCodeData;
import com.example.fx50j.financedemo.Data.StockNowInformationData;
import com.example.fx50j.financedemo.R;
import com.show.api.ShowApiRequest;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {


    protected Handler Handler_Code = new Handler();
    protected Handler Handler_Stock = new Handler();
    protected Handler Handler_GetStock = new Handler();

    @InjectView(R.id.ed_input)
    EditText edInput;
    @InjectView(R.id.btu_check)
    Button btuCheck;
    @InjectView(R.id.tv_context)
    TextView tvContext;
    @InjectView(R.id.tv_StockName)
    TextView tvStockName;
    @InjectView(R.id.tv_NowPrice)
    TextView tvNowPrice;
    @InjectView(R.id.tv_Time)
    TextView tvTime;
    @InjectView(R.id.tv_OpenPrice)
    TextView tvOpenPrice;
    @InjectView(R.id.tv_TodayMax)
    TextView tvTodayMax;
    @InjectView(R.id.tv_TradeNum)
    TextView tvTradeNum;
    @InjectView(R.id.tv_TodayMin)
    TextView tvTodayMin;
    @InjectView(R.id.tv_ClosePrice)
    TextView tvClosePrice;
    @InjectView(R.id.tv_TradeAmount)
    TextView tvTradeAmount;
    @InjectView(R.id.im_minK)
    ImageView imMinK;

    private String CODE;
    private String MARKET;
    private String STOCKNAME, NOWPRICE, TIME, OPENPRICE, TODAYMAX, TRADENUM, TODAYMIN, CLOSEPRICE, TRADEAMOUNT,MINK,DAYK,WEEKK,MONTHK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        btuCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String context;
                int flag;
                final String name;

                context = edInput.getText().toString();
                Log.d("context", context);
                tvContext.setText(context);

                TextViewContext textViewContext = new TextViewContext();
                textViewContext.TextInputCheck(context);
                name = textViewContext.ShowStockName();
                flag = textViewContext.ShowStockFlag();

                switch (flag) {
                    case 1:
                        //查询股票详细信息
                        CheckStockImformation(name);
                        break;
                    case 2:
                        //查询股票代码
                        CheckStockCode(name);
                        break;
                    case 3:
                        //显示命令行有误
                        ShowStockNull();
                }


            }
        });
    }

    //查询股票代码
    private void CheckStockCode(final String name) {
        new Thread() {
            @Override
            public void run() {
                String appid = "19283";
                String secret = "b11338eeb2424a408a5b8a2e47557021";
                final String res = new ShowApiRequest("http://route.showapi.com/131-43", appid, secret)
                        .addTextPara("name", name)
                        .post();
                Log.d("context", res);
                Handler_Code.post(new Thread() {
                    @Override
                    public void run() {
                        List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> list;
                        String code = "";
                        list = StockDataShow_Code(res);
                        for (int position = 0; position < list.size(); position++) {
                            StockCodeGsonBean.ShowapiResBodyBean.ListBean listBean = list.get(position);
                            code = code + listBean.getName() + "的股票代码：" + listBean.getCode() + "\n";
                        }
                        tvStockName.setText(code);
                        super.run();
                    }
                });
                super.run();
            }
        }.start();
    }


    //查询股票信息
    private void CheckStockImformation(final String s) {

        new Thread() {
            @Override
            public void run() {
                String appid = "19283";
                String secret = "b11338eeb2424a408a5b8a2e47557021";
                final String res_code = new ShowApiRequest("http://route.showapi.com/131-43", appid, secret)
                        .addTextPara("name", s)
                        .post();
                Log.d("Im_res_code", res_code);
                List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> list;
                StockCodeGsonBean.ShowapiResBodyBean.ListBean listBean;
                list = StockDataShow_Code(res_code);
                listBean = list.get(0);
                CODE = listBean.getCode();
                MARKET = listBean.getMarket();
                Log.d("Code", CODE);
                Log.d("Matket", MARKET);
                GetStockInformation(CODE);
                Handler_Stock.post(new Thread() {
                    @Override
                    public void run() {
                            ShowStockInformation();
                        super.run();
                    }
                });
                super.run();
            }
        }.start();

    }


    //case3时显示查询错误的提示语
    private void ShowStockNull() {
        String res = "命令行有误，请重新输入";
        tvStockName.setText(res);
    }

    //显示股票代码（股票代码查询途径）
    private List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> StockDataShow_Code(String s) {

        List<StockCodeGsonBean.ShowapiResBodyBean.ListBean> list;

        StockCodeData stockCodeData = new StockCodeData();
        stockCodeData.SetStockData(s);
        stockCodeData.CheckStockData();
        list = stockCodeData.ShowStockCode();
        Log.d("MainActivity", String.valueOf(list.size()));

        return list;

    }

    private void GetStockInformation(final String code) {

        String appid = "19283";
        String secret = "b11338eeb2424a408a5b8a2e47557021";
        final String res_NowStock = new ShowApiRequest("http://route.showapi.com/131-44", appid, secret)
                .addTextPara("code", code)
                .post();
        Log.d("Im_res_code", res_NowStock);
        StockNowInformationData stockNowInformationData = new StockNowInformationData();
        StockNowInformationGsonBean.ShowapiResBodyBean.StockMarketBean marketbean;

        stockNowInformationData.SetStockDataRes(res_NowStock);
        stockNowInformationData.CheckStockData_Now();
        marketbean = stockNowInformationData.GetStockNowInformation();
        GetStockNowInformation(marketbean);
    }


    private void GetStockNowInformation(StockNowInformationGsonBean.ShowapiResBodyBean.StockMarketBean marketbean) {

        STOCKNAME = marketbean.getName() + " " + CODE;
        NOWPRICE = "当前价格：" + marketbean.getNowPrice();
        TIME = marketbean.getTime();
        OPENPRICE = "开盘价：" + marketbean.getOpenPrice();
        TODAYMAX = "最高价：" + marketbean.getTodayMax();
        TRADENUM = "成交量：" + marketbean.getTradeNum();
        TODAYMIN = "最低价：" + marketbean.getTodayMin();
        CLOSEPRICE = "昨日收盘:" + marketbean.getClosePrice();
        TRADEAMOUNT = "成交金额：" + marketbean.getTradeAmount();

    }

    private void ShowStockInformation(){

        //显示文本部分
        tvStockName.setText(STOCKNAME);
        tvNowPrice.setText(NOWPRICE);
        tvTime.setText(TIME);
        tvOpenPrice.setText(OPENPRICE);
        tvTodayMax.setText(TODAYMAX);
        tvTradeNum.setText(TRADENUM);
        tvTodayMin.setText(TODAYMIN);
        tvClosePrice.setText(CLOSEPRICE);
        tvTradeAmount.setText(TRADEAMOUNT);

        //显示K线图
    }


}
