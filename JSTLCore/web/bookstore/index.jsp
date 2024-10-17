<%-- 
    Document   : index
    Created on : 15 Oct 2024, 3:58:42 pm
    Author     : hetbh
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bookstore</title>
    </head>
    <body>
        <!-- Import header JSP -->
        <p> <c:import url="header.jsp" /><p>

        <!-- Main content -->
        <h1>Welcome to the book store</h1>
        
        <b><c:out value="${param.client}"/></b>
        <ul>
            <li><a href="<c:url value='bookList.jsp'/>">View Books</a></li>
            <li><a href="<c:url value='manageInventory.jsp'/>">Manage Inventory</a></li>
            <li><a href="<c:url value='searchBooks.jsp'/>">Search Books</a></li>
            <li><a href="<c:url value='login.jsp'/>">Log in</a></li>
        </ul>

        <!-- Import footer JSP -->
        <c:import url="footer.jsp" />
    </body>
</html>
