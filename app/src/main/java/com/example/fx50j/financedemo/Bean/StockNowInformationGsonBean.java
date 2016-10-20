package com.example.fx50j.financedemo.Bean;

import java.util.List;

/**
 * Created by FX50J on 2016/10/19.
 */

public class StockNowInformationGsonBean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"ret_code":0,"indexList":[{"yestodayClosePrice":3083.8751,"time":"2016-10-19 15:01:03","tradeNum":182470143,"name":"上证指数","tradeAmount":197481136362,"maxPrice":3096.2228,"code":"sh000001","nowPrice":3084.7189,"todayOpenPrice":3085.749,"minPrice":3076.7705},{"yestodayClosePrice":10797.022,"time":"2016-10-19 15:06:03","tradeNum":20123704758,"name":"深证成指","tradeAmount":2.97956483948377E11,"maxPrice":10824.406,"code":"sz399001","nowPrice":10757.919,"todayOpenPrice":10811.272,"minPrice":10733.691},{"yestodayClosePrice":6958.972,"time":"2016-10-19 15:06:03","tradeNum":1420649089,"name":"中小板指","tradeAmount":2.421993804251E10,"maxPrice":6984.739,"code":"sz399005","nowPrice":6930.135,"todayOpenPrice":6973.523,"minPrice":6915.574},{"yestodayClosePrice":2198.142,"time":"2016-10-19 15:06:03","tradeNum":962204508,"name":"创业板指","tradeAmount":2.047386375974E10,"maxPrice":2201.162,"code":"sz399006","nowPrice":2184.911,"todayOpenPrice":2200.532,"minPrice":2180.469}],"k_pic":{"monthurl":"http://image.sinajs.cn/newchart/hk_stock/monthly/00168.gif","minurl":"http://image.sinajs.cn/newchart/hk_stock/min/00168.gif","weekurl":"http://image.sinajs.cn/newchart/hk_stock/weekly/00168.gif","dayurl":"http://image.sinajs.cn/newchart/hk_stock/daily/00168.gif"},"stockMarket":{"todayMax":"32.150","sellPrice":"31.900","upRate":"0.472","todayMin":"31.650","max52":"39.800","diff_money":"0.15","tradeNum":"1157206","openPrice":"31.650","code":"00168","date":"2016-10-19","nowPrice":"31.900","upPrice":"0.150","min52":"25.350","closePrice":"31.750","time":"16:09","market":"hk","name":"青岛啤酒","ename":"TSINGTAO BREW","buyPrice":"31.850","tradeAmount":"36930708","swing":"1.57","earn":"27.218","diff_rate":"0.47"}}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * ret_code : 0
     * indexList : [{"yestodayClosePrice":3083.8751,"time":"2016-10-19 15:01:03","tradeNum":182470143,"name":"上证指数","tradeAmount":197481136362,"maxPrice":3096.2228,"code":"sh000001","nowPrice":3084.7189,"todayOpenPrice":3085.749,"minPrice":3076.7705},{"yestodayClosePrice":10797.022,"time":"2016-10-19 15:06:03","tradeNum":20123704758,"name":"深证成指","tradeAmount":2.97956483948377E11,"maxPrice":10824.406,"code":"sz399001","nowPrice":10757.919,"todayOpenPrice":10811.272,"minPrice":10733.691},{"yestodayClosePrice":6958.972,"time":"2016-10-19 15:06:03","tradeNum":1420649089,"name":"中小板指","tradeAmount":2.421993804251E10,"maxPrice":6984.739,"code":"sz399005","nowPrice":6930.135,"todayOpenPrice":6973.523,"minPrice":6915.574},{"yestodayClosePrice":2198.142,"time":"2016-10-19 15:06:03","tradeNum":962204508,"name":"创业板指","tradeAmount":2.047386375974E10,"maxPrice":2201.162,"code":"sz399006","nowPrice":2184.911,"todayOpenPrice":2200.532,"minPrice":2180.469}]
     * k_pic : {"monthurl":"http://image.sinajs.cn/newchart/hk_stock/monthly/00168.gif","minurl":"http://image.sinajs.cn/newchart/hk_stock/min/00168.gif","weekurl":"http://image.sinajs.cn/newchart/hk_stock/weekly/00168.gif","dayurl":"http://image.sinajs.cn/newchart/hk_stock/daily/00168.gif"}
     * stockMarket : {"todayMax":"32.150","sellPrice":"31.900","upRate":"0.472","todayMin":"31.650","max52":"39.800","diff_money":"0.15","tradeNum":"1157206","openPrice":"31.650","code":"00168","date":"2016-10-19","nowPrice":"31.900","upPrice":"0.150","min52":"25.350","closePrice":"31.750","time":"16:09","market":"hk","name":"青岛啤酒","ename":"TSINGTAO BREW","buyPrice":"31.850","tradeAmount":"36930708","swing":"1.57","earn":"27.218","diff_rate":"0.47"}
     */

    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        private int ret_code;
        /**
         * monthurl : http://image.sinajs.cn/newchart/hk_stock/monthly/00168.gif
         * minurl : http://image.sinajs.cn/newchart/hk_stock/min/00168.gif
         * weekurl : http://image.sinajs.cn/newchart/hk_stock/weekly/00168.gif
         * dayurl : http://image.sinajs.cn/newchart/hk_stock/daily/00168.gif
         */

        private KPicBean k_pic;
        /**
         * todayMax : 32.150
         * sellPrice : 31.900
         * upRate : 0.472
         * todayMin : 31.650
         * max52 : 39.800
         * diff_money : 0.15
         * tradeNum : 1157206
         * openPrice : 31.650
         * code : 00168
         * date : 2016-10-19
         * nowPrice : 31.900
         * upPrice : 0.150
         * min52 : 25.350
         * closePrice : 31.750
         * time : 16:09
         * market : hk
         * name : 青岛啤酒
         * ename : TSINGTAO BREW
         * buyPrice : 31.850
         * tradeAmount : 36930708
         * swing : 1.57
         * earn : 27.218
         * diff_rate : 0.47
         */

        private StockMarketBean stockMarket;
        /**
         * yestodayClosePrice : 3083.8751
         * time : 2016-10-19 15:01:03
         * tradeNum : 182470143
         * name : 上证指数
         * tradeAmount : 197481136362
         * maxPrice : 3096.2228
         * code : sh000001
         * nowPrice : 3084.7189
         * todayOpenPrice : 3085.749
         * minPrice : 3076.7705
         */

        private List<IndexListBean> indexList;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public KPicBean getK_pic() {
            return k_pic;
        }

        public void setK_pic(KPicBean k_pic) {
            this.k_pic = k_pic;
        }

        public StockMarketBean getStockMarket() {
            return stockMarket;
        }

        public void setStockMarket(StockMarketBean stockMarket) {
            this.stockMarket = stockMarket;
        }

        public List<IndexListBean> getIndexList() {
            return indexList;
        }

        public void setIndexList(List<IndexListBean> indexList) {
            this.indexList = indexList;
        }

        public static class KPicBean {
            private String monthurl;
            private String minurl;
            private String weekurl;
            private String dayurl;

            public String getMonthurl() {
                return monthurl;
            }

            public void setMonthurl(String monthurl) {
                this.monthurl = monthurl;
            }

            public String getMinurl() {
                return minurl;
            }

            public void setMinurl(String minurl) {
                this.minurl = minurl;
            }

            public String getWeekurl() {
                return weekurl;
            }

            public void setWeekurl(String weekurl) {
                this.weekurl = weekurl;
            }

            public String getDayurl() {
                return dayurl;
            }

            public void setDayurl(String dayurl) {
                this.dayurl = dayurl;
            }
        }

        public static class StockMarketBean {
            private String todayMax;
            private String sellPrice;
            private String upRate;
            private String todayMin;
            private String max52;
            private String diff_money;
            private String tradeNum;
            private String openPrice;
            private String code;
            private String date;
            private String nowPrice;
            private String upPrice;
            private String min52;
            private String closePrice;
            private String time;
            private String market;
            private String name;
            private String ename;
            private String buyPrice;
            private String tradeAmount;
            private String swing;
            private String earn;
            private String diff_rate;

            public String getTodayMax() {
                return todayMax;
            }

            public void setTodayMax(String todayMax) {
                this.todayMax = todayMax;
            }

            public String getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(String sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getUpRate() {
                return upRate;
            }

            public void setUpRate(String upRate) {
                this.upRate = upRate;
            }

            public String getTodayMin() {
                return todayMin;
            }

            public void setTodayMin(String todayMin) {
                this.todayMin = todayMin;
            }

            public String getMax52() {
                return max52;
            }

            public void setMax52(String max52) {
                this.max52 = max52;
            }

            public String getDiff_money() {
                return diff_money;
            }

            public void setDiff_money(String diff_money) {
                this.diff_money = diff_money;
            }

            public String getTradeNum() {
                return tradeNum;
            }

            public void setTradeNum(String tradeNum) {
                this.tradeNum = tradeNum;
            }

            public String getOpenPrice() {
                return openPrice;
            }

            public void setOpenPrice(String openPrice) {
                this.openPrice = openPrice;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getNowPrice() {
                return nowPrice;
            }

            public void setNowPrice(String nowPrice) {
                this.nowPrice = nowPrice;
            }

            public String getUpPrice() {
                return upPrice;
            }

            public void setUpPrice(String upPrice) {
                this.upPrice = upPrice;
            }

            public String getMin52() {
                return min52;
            }

            public void setMin52(String min52) {
                this.min52 = min52;
            }

            public String getClosePrice() {
                return closePrice;
            }

            public void setClosePrice(String closePrice) {
                this.closePrice = closePrice;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getMarket() {
                return market;
            }

            public void setMarket(String market) {
                this.market = market;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }

            public String getBuyPrice() {
                return buyPrice;
            }

            public void setBuyPrice(String buyPrice) {
                this.buyPrice = buyPrice;
            }

            public String getTradeAmount() {
                return tradeAmount;
            }

            public void setTradeAmount(String tradeAmount) {
                this.tradeAmount = tradeAmount;
            }

            public String getSwing() {
                return swing;
            }

            public void setSwing(String swing) {
                this.swing = swing;
            }

            public String getEarn() {
                return earn;
            }

            public void setEarn(String earn) {
                this.earn = earn;
            }

            public String getDiff_rate() {
                return diff_rate;
            }

            public void setDiff_rate(String diff_rate) {
                this.diff_rate = diff_rate;
            }
        }

        public static class IndexListBean {
            private double yestodayClosePrice;
            private String time;
            private int tradeNum;
            private String name;
            private long tradeAmount;
            private double maxPrice;
            private String code;
            private double nowPrice;
            private double todayOpenPrice;
            private double minPrice;

            public double getYestodayClosePrice() {
                return yestodayClosePrice;
            }

            public void setYestodayClosePrice(double yestodayClosePrice) {
                this.yestodayClosePrice = yestodayClosePrice;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getTradeNum() {
                return tradeNum;
            }

            public void setTradeNum(int tradeNum) {
                this.tradeNum = tradeNum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getTradeAmount() {
                return tradeAmount;
            }

            public void setTradeAmount(long tradeAmount) {
                this.tradeAmount = tradeAmount;
            }

            public double getMaxPrice() {
                return maxPrice;
            }

            public void setMaxPrice(double maxPrice) {
                this.maxPrice = maxPrice;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public double getNowPrice() {
                return nowPrice;
            }

            public void setNowPrice(double nowPrice) {
                this.nowPrice = nowPrice;
            }

            public double getTodayOpenPrice() {
                return todayOpenPrice;
            }

            public void setTodayOpenPrice(double todayOpenPrice) {
                this.todayOpenPrice = todayOpenPrice;
            }

            public double getMinPrice() {
                return minPrice;
            }

            public void setMinPrice(double minPrice) {
                this.minPrice = minPrice;
            }
        }
    }
}
