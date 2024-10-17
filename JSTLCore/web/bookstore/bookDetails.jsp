<%-- 
    Document   : bookDetails
    Created on : 15 Oct 2024, 4:23:11 pm
    Author     : hetbh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="header.jsp" />
        <h1>Book Details</h1>
        <c:set var="title" value="${param.title}"/>
        
        <c:choose>
            <c:when test="${empty title}">
                <c:redirect url="bookList.jsp"/>
            </c:when>
            <c:otherwise>
                <c:if test="${title eq 'Effective Java'}">
                    <p>Title : Effective Java</p>
                    <p>Author : Fatema</p>
                </c:if>
                <c:if test="${title eq 'Spring Boot'}">
                    <p>Title : Spring Boot</p>
                    <p>Author : Telusko</p>
                </c:if>
                <c:if test="${title eq 'Design Patterns'}">
                    <p>Title : Design Patterns</p>
                    <p>Author : Harshad Prajapati</p>
                </c:if>
            </c:otherwise>
        </c:choose>
        <c:import url="footer.jsp"/>
    </body>
</html>
