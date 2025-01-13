<%@ page import="org.example.model.WifiInfo" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>와이파이 정보 구하기</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #4CAF50; /* Green */
            color: white;
        }
    </style>
</head>
<body>
<h1>와이파이 정보 구하기</h1>
<p>출처: 서울시 공공데이터 (OpenAPI)</p> <%-- 출처 표시 --%>
<form action="WifiServlet" method="post"> <%-- WifiServlet으로 POST 요청 --%>
    <label for="lat">LAT:</label>
    <input type="text" id="lat" name="lat" required>
    <label for="lnt">LNT:</label>
    <input type="text" id="lnt" name="lnt" required>
    <input type="submit" value="조회">
</form>

<table>
    <thead>
    <tr>
<%--        <th>거리(Km)</th>--%>
        <th>관리번호</th>
        <th>자치구</th>
        <th>와이파이명</th>
        <th>도로명주소</th>
        <th>상세주소</th>
        <th>설치위치(층)</th>
        <th>설치유형</th>
        <th>설치기관</th>
        <th>서비스구분</th>
        <th>망종류</th>
        <th>설치년도</th>
        <th>실내외구분</th>
        <th>WIFI접속환경</th>
        <th>Y 좌표</th>
        <th>X 좌표</th>
        <th>작업일자</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<WifiInfo> wifiList = (List<WifiInfo>) request.getAttribute("wifiList");
        if (wifiList != null) {
            for (WifiInfo wifi : wifiList) {
    %>
    <tr>
        <td><%= wifi.getX_SWIFI_MGR_NO() %></td>
        <td><%= wifi.getX_SWIFI_WRDOFC() %></td>
        <td><%= wifi.getX_SWIFI_MAIN_NM() %></td>
        <td><%= wifi.getX_SWIFI_ADRES1() %></td>
        <td><%= wifi.getX_SWIFI_ADRES2() %></td>
        <td><%= wifi.getX_SWIFI_INSTL_FLOOR() %></td>
        <td><%= wifi.getX_SWIFI_INSTL_TY() %></td>
        <td><%= wifi.getX_SWIFI_INSTL_MBY() %></td>
        <td><%= wifi.getX_SWIFI_SVC_SE() %></td>
        <td><%= wifi.getX_SWIFI_CMCWR() %></td>
        <td><%= wifi.getX_SWIFI_CNSTC_YEAR() %></td>
        <td><%= wifi.getX_SWIFI_INOUT_DOOR() %></td>
        <td><%= wifi.getX_SWIFI_REMARS3() %></td>
        <td><%= wifi.getLAT() %></td>
        <td><%= wifi.getLNT() %></td>
        <td><%= wifi.getWORK_DTTM() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="14">위치 정보를 입력한 후에 조회하세요.</td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>