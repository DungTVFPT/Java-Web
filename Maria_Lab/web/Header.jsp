
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header">
            <div class="title">Maria Bagnarelli's Cafe</div>
            <div class="subtitle">Welcome to my website</div>
        </div>
        <div class="menu">
            <ul class="nav">
                <li><a class="${activeMenu}" href="HomeControl">Home</a></li>
                <li><a class="${activeList}" href="ListCakeControl">About my Cakes</a></li>
                <li><a class="${activeInfor}" href="LocationControl">Find Maria's Cafe</a></li>
            </ul>
        </div>
    </body>
</html>
