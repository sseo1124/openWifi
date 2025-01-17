package org.example.api;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.example.model.WifiInfo;
import org.example.model.WifiResponse;

import java.io.IOException;
import java.util.List;

public class WifiApi {

    private static final String apiKey = "sample";

    private WifiApi() {}

    public static List<WifiInfo> getWifiApiInfo() {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088"); /*URL*/
        urlBuilder.append("/" + apiKey); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
        urlBuilder.append("/" + "json"); /*요청파일타입 (xml,xmlf,xls,json) */
        urlBuilder.append("/" + "TbPublicWifiInfo"); /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + "1"); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + "4"); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/


        String url = urlBuilder.toString();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = okHttpClient.newCall(request).execute();
            Gson gson = new Gson();
            WifiResponse wifiResponse = gson.fromJson(response.body().string(), WifiResponse.class);
            return wifiResponse.getWifiInfoData().getRow();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

