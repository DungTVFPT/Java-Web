

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="footer">
            
            <a href="#">Create with SimpleSite</a>
            <c:forEach begin="0" end="5" step="1">
                <fmt:formatNumber var="abc" type="number" value="${totalViews % 10}" maxFractionDigits="0"/>
                <span class="view">${abc}</span>
                <fmt:formatNumber var="totalViews" type="number" value="${Math.floor(totalViews / 10)}" maxFractionDigits="0"/>
            </c:forEach>

        </div>
    </body>
</html>
