<%-- 
    Document   : searchBooks
    Created on : 15 Oct 2024, 4:08:49 pm
    Author     : hetbh
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="header.jsp"/>
        <c:set var="books" value="Effective Java,Spring Boot,Design Patterns"/>
        <ul>
        <c:forTokens var="book" items="${books}" delims=",">
            <li>
               ${book}
           </li>
        </c:forTokens>
            
        <c:import url="footer.jsp"/>
    </body>
</html>
