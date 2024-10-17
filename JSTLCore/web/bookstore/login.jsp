<%-- 
    Document   : login
    Created on : 15 Oct 2024, 4:09:11 pm
    Author     : hetbh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Login</title>
</head>
<body>
    <c:import url="header.jsp" />
    <h1>User Login</h1>
    
    <c:choose>
        <c:when test="${not empty param.username}">
            <c:set var="user" value="${param.username}" />
            <p><c:out value="Welcome + ${user}}"/></p>
            <c:redirect url="index.jsp">
                <c:param name="client" value="${user}"/>
            </c:redirect>
        </c:when>
        <c:otherwise>
            <form action="login.jsp" method="post">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" />
                <input type="submit" value="Submit" />
            </form>
        </c:otherwise>
    </c:choose>
    
    <c:import url="footer.jsp" />
</body>
</html>
