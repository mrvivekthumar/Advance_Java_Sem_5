<%@ taglib prefix="x" uri="jakarta.tags.xml" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<x:parse var="doc">
    <bookstore>
        <book>
            <title>Effective Java</title>
            <author>Fatema Vohra</author>
        </book>
        <book>
            <title>Spring Boot</title>
            <author>Telusko</author>
        </book>
    </bookstore>
</x:parse>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BookStore</title>
    </head>
    <body>
        <h2>Books Available</h2>
        <table border="1" cellpadding="10">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Author</th>
                </tr>
            </thead>
            <tbody>
                <x:forEach select="$doc/bookstore/book" var="book">
                    <tr>
                        <td><x:out select="$book/title"/></td>
                        <td><x:out select="$book/author"/></td>
                    </tr>
                </x:forEach>
            </tbody>
        </table>
    </body>
</html>
