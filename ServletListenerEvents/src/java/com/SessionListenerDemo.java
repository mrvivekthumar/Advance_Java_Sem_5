package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionListenerDemo implements HttpSessionListener {

    public static int count;

    ServletContext context = null;

    public void sessionCreated(HttpSessionEvent se) {
        count++;
        context = se.getSession().getServletContext();
        context.setAttribute("sessionCount", count);
        System.out.println("=====Session Object Created============================");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("=====Session Object Destroyed============================");
        count--;
    }
}
