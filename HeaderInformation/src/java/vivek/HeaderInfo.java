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
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;

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

//        Paper Question for Question no 3 or (b)
//        String clientBrowser = request.getHeader("User-Agent");
//        String clientIP = request.getRemoteAddr();
//        String methodUsed = request.getMethod();
//        int clientPort = request.getRemotePort();
//        String queryString = request.getQueryString();
//
//        // Set response content type
//        response.setContentType("text/html");
//
//        // Display client information
//        response.getWriter().println("<h2>Client Information</h2>");
//        response.getWriter().println("<p><b>Client Browser:</b> " + clientBrowser + "</p>");
//        response.getWriter().println("<p><b>Client IP Address:</b> " + clientIP + "</p>");
//        response.getWriter().println("<p><b>Method Used for Form Submission:</b> " + methodUsed + "</p>");
//        response.getWriter().println("<p><b>Client Port Number:</b> " + clientPort + "</p>");
//        response.getWriter().println("<p><b>Query String Name and Values:</b> " + queryString + "</p>");

//    Paper Question for Question no 2  (c)    
        String clientIP = request.getRemoteAddr();
        String clientBrowser = request.getHeader("User-Agent");
        String methodUsed = request.getMethod();

        // Try to get hostname from IP address
        String clientHostname = "unknown";
        try {
            clientHostname = InetAddress.getByName(clientIP).getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // Log client details
        System.out.println("Client Hostname: " + clientHostname);
        System.out.println("Client IP Address: " + clientIP);
        System.out.println("Client Browser: " + clientBrowser);
        System.out.println("HTTP Method: " + methodUsed);

        // Get search parameter
        String searchQuery = request.getParameter("search");

        // Set response content type
        response.setContentType("text/html");

        // Display search result (this is a placeholder, no actual search is performed)
        response.getWriter().println("<h2>Search Results for: " + searchQuery + "</h2>");
        response.getWriter().println("<p>Client details have been logged.</p>");
    
    }
}
