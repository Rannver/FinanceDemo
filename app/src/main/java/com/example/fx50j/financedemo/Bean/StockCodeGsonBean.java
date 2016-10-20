package com.example.fx50j.financedemo.Bean;

import java.util.List;

/**
 * Created by FX50J on 2016/10/13.
 */

public class StockCodeGsonBean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"list":[{"code":"002739","market":"sz","name":"万达院线"},{"code":"300168","market":"sz","name":"万达信息"}],"ret_code":0}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * list : [{"code":"002739","market":"sz","name":"万达院线"},{"code":"300168","market":"sz","name":"万达信息"}]
     * ret_code : 0
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
         * code : 002739
         * market : sz
         * name : 万达院线
         */

        private List<ListBean> list;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String code;
            private String market;
            private String name;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
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
        }
    }
}
