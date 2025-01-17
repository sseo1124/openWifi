package org.example.db;

import org.example.api.WifiApi;
import org.example.model.WifiInfo;

import java.sql.*;
import java.util.List;

public class WifiDb {
    private WifiDb() {

    }

    public static String insertWifiInfo(List<WifiInfo> wifiInfoList) {

        // DB 연결
        String url = "jdbc:mariadb://127.0.0.1:3306/openwifi_db";
        String userId = "openwifi";
        String password = "openwifi";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url, userId, password);

            String sql = "INSERT INTO seoul_openwifi (X_SWIFI_MGR_NO, X_SWIFI_WRDOFC, X_SWIFI_MAIN_NM, X_SWIFI_ADRES1, X_SWIFI_ADRES2, " +
                    "X_SWIFI_INSTL_FLOOR, X_SWIFI_INSTL_TY, X_SWIFI_INSTL_MBY, X_SWIFI_SVC_SE, X_SWIFI_CMCWR, " +
                    "X_SWIFI_CNSTC_YEAR, X_SWIFI_INOUT_DOOR, X_SWIFI_REMARS3, LAT, LNT, WORK_DTTM) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(sql);

            for (WifiInfo wifiInfo : wifiInfoList) {
                preparedStatement.setString(1, wifiInfo.getxSwifiMgrNo());
                preparedStatement.setString(2, wifiInfo.getxSwifiWrdofc());
                preparedStatement.setString(3, wifiInfo.getxSwifiMainNm());
                preparedStatement.setString(4, wifiInfo.getxSwifiAdres1());
                preparedStatement.setString(5, wifiInfo.getxSwifiAdres2());
                preparedStatement.setString(6, wifiInfo.getxSwifiInstlFloor());
                preparedStatement.setString(7, wifiInfo.getxSwifiInstlTy());
                preparedStatement.setString(8, wifiInfo.getxSwifiInstlMby());
                preparedStatement.setString(9, wifiInfo.getxSwifiSvcSe());
                preparedStatement.setString(10, wifiInfo.getxSwifiCmcwr());
                preparedStatement.setString(11, wifiInfo.getxSwifiCnstcYear());
                preparedStatement.setString(12, wifiInfo.getxSwifiInOutDoor());
                preparedStatement.setString(13, wifiInfo.getxSwifiRemars3());
                preparedStatement.setDouble(14, wifiInfo.getLat());
                preparedStatement.setDouble(15, wifiInfo.getLnt());
                preparedStatement.setString(16, wifiInfo.getWorkDttm());

                preparedStatement.addBatch();
            }
            int[] affectedRows = preparedStatement.executeBatch();
            return String.valueOf(affectedRows.length) + "개의 WIFI 정보를 정상적으로 저장하였습니다";

        } catch (BatchUpdateException e) {
            String s = "중복된 데이터를 불러옴";
            return s;

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return "0";
    }

}
