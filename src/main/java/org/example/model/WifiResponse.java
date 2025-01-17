package org.example.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class WifiResponse {
    @SerializedName("TbPublicWifiInfo")
    private wifiInfoData wifiInfoData;

    public wifiInfoData getWifiInfoData() {
        return wifiInfoData;
    }

    // 내부 클래서
    public class wifiInfoData {
        @SerializedName("list_total_count")
        private int listTotalCount;
        @SerializedName("RESULT")
        private HashMap<String, String> result;
        private List<WifiInfo> row;

        public int getListTotalCount() {
            return listTotalCount;
        }

        public HashMap<String, String> getResult() {
            return result;
        }

        public List<WifiInfo> getRow() {
            return row;
        }
    }



}
