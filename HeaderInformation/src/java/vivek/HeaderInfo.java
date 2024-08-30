/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package vivek;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 *
 * @author thuma
 */
public class HeaderInfo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String title = "Servlet Example: Showing Request Headers";
        out.println("<HTML>");
        out.println("<HEAD><TITLE>" + title + "</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<B>Request Method:</B> " + request.getMethod() + "<BR>");
        out.println("<B>Request URI:</B> " + request.getRequestURI() + "<BR>");
        out.println("<B>Request URL: </ B> " + request.getRequestURL() + " <BR>");
        out.println("<B>Request Protocol:</B> " + request.getProtocol() + "<BR>");
        out.println("<TABLE BORDER=1>");
        out.println("<TR><TH>Header Name</TH><TH>Header Value</TH></TR>");

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            out.println("<tr><td>" + headerName + "</td><td>" + request.getHeader(headerName) + "</td></tr>");
        }
        out.println("</TABLE>");
        out.println("</BODY></HTML>");
    }
}
