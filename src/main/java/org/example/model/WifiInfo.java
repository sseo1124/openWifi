package org.example.model;

import com.google.gson.annotations.SerializedName;

public class WifiInfo {

    @SerializedName("X_SWIFI_MGR_NO")
    private String xSwifiMgrNo;
    @SerializedName("X_SWIFI_WRDOFC")
    private String xSwifiWrdofc;
    @SerializedName("X_SWIFI_MAIN_NM")
    private String xSwifiMainNm;
    @SerializedName("X_SWIFI_ADRES1")
    private String xSwifiAdres1;
    @SerializedName("X_SWIFI_ADRES2")
    private String xSwifiAdres2;
    @SerializedName("X_SWIFI_INSTL_FLOOR")
    private String xSwifiInstlFloor;
    @SerializedName("X_SWIFI_INSTL_TY")
    private String xSwifiInstlTy;
    @SerializedName("X_SWIFI_INSTL_MBY")
    private String xSwifiInstlMby;
    @SerializedName("X_SWIFI_SVC_SE")
    private String xSwifiSvcSe;
    @SerializedName("X_SWIFI_CMCWR")
    private String xSwifiCmcwr;
    @SerializedName("X_SWIFI_CNSTC_YEAR")
    private String xSwifiCnstcYear;
    @SerializedName("X_SWIFI_INOUT_DOOR")
    private String xSwifiInOutDoor;
    @SerializedName("X_SWIFI_REMARS3")
    private String xSwifiRemars3;
    @SerializedName("LAT")
    private String lat;
    @SerializedName("LNT")
    private String lnt;
    @SerializedName("WORK_DTTM")
    private String workDttm;


    public String getxSwifiMgrNo() {
        return xSwifiMgrNo;
    }

    public String getxSwifiWrdofc() {
        return xSwifiWrdofc;
    }

    public String getxSwifiMainNm() {
        return xSwifiMainNm;
    }

    public String getxSwifiAdres1() {
        return xSwifiAdres1;
    }

    public String getxSwifiAdres2() {
        return xSwifiAdres2;
    }

    public String getxSwifiInstlFloor() {
        return xSwifiInstlFloor;
    }

    public String getxSwifiInstlTy() {
        return xSwifiInstlTy;
    }

    public String getxSwifiInstlMby() {
        return xSwifiInstlMby;
    }

    public String getxSwifiSvcSe() {
        return xSwifiSvcSe;
    }

    public String getxSwifiCmcwr() {
        return xSwifiCmcwr;
    }

    public String getxSwifiCnstcYear() {
        return xSwifiCnstcYear;
    }

    public String getxSwifiInOutDoor() {
        return xSwifiInOutDoor;
    }

    public String getxSwifiRemars3() {
        return xSwifiRemars3;
    }

    public String getLat() {
        return lat;
    }

    public String getLnt() {
        return lnt;
    }

    public String getWorkDttm() {
        return workDttm;
    }

    @Override
    public String toString() {
        return "WifiInfo{" +
                "xSwifiMgrNo='" + xSwifiMgrNo + '\'' +
                ", xSwifiWrdofc='" + xSwifiWrdofc + '\'' +
                ", xSwifiMainNm='" + xSwifiMainNm + '\'' +
                ", xSwifiAdres1='" + xSwifiAdres1 + '\'' +
                ", xSwifiAdres2='" + xSwifiAdres2 + '\'' +
                ", xSwifiInstlFloor='" + xSwifiInstlFloor + '\'' +
                ", xSwifiInstlTy='" + xSwifiInstlTy + '\'' +
                ", xSwifiInstlMby='" + xSwifiInstlMby + '\'' +
                ", xSwifiSvcSe='" + xSwifiSvcSe + '\'' +
                ", xSwifiCmcwr='" + xSwifiCmcwr + '\'' +
                ", xSwifiCnstcYear='" + xSwifiCnstcYear + '\'' +
                ", xSwifiInOutDoor='" + xSwifiInOutDoor + '\'' +
                ", xSwifiRemars3='" + xSwifiRemars3 + '\'' +
                ", lat='" + lat + '\'' +
                ", lnt='" + lnt + '\'' +
                ", workDttm='" + workDttm + '\'' +
                '}';
    }
}


