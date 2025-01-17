package org.example.db;

import org.example.api.WifiApi;
import org.example.model.WifiInfo;

import java.util.List;

public class WifiDb {
    public static void main(String[] args) {
        List<WifiInfo> wifiApiInfo = WifiApi.getWifiApiInfo();
        for (WifiInfo wifiInfo : wifiApiInfo) {
            System.out.println(wifiInfo);
        }
    }
}
