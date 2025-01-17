<%@ page import="org.example.model.WifiInfo" %>
<%@ page import="org.example.db.WifiDb" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.api.WifiApi" %><%--
  Created by IntelliJ IDEA.
  User: sanghyuk
  Date: 2025. 1. 17.
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%

        List<WifiInfo> wifiApiInfo = WifiApi.getWifiApiInfo();
        String result = WifiDb.insertWifiInfo(wifiApiInfo);
    %>
    <h2><%=result%></h2>

   <a href="/">홈으로</a>
</body>
</html>
