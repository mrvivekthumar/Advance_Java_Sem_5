<%-- 
    Document   : bookList
    Created on : 15 Oct 2024, 4:08:37 pm
    Author     : hetbh
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookList</title>
    </head>
    <body>
        <c:import url="header.jsp"/>
        <c:set var="books" value="${['Effective Java','Spring Boot','Design Patterns']}"/>
        
        <ul>
        <c:forEach var="book" items="${books}">
            
            </li>
                 <a href="<c:url value='bookDetails.jsp'><c:param name='title' value='${book}'/></c:url>">
                    ${book}
                </a>
            </li></br>
        </c:forEach>
        </ul>    
            
       <c:import url="footer.jsp"/>
    </body>
</html>
