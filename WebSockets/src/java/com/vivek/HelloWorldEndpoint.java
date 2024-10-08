package com.vivek;


import jakarta.websocket.CloseReason;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/hello")
public class HelloWorldEndpoint {

    @OnMessage
    public String hello(String message) {
        System.out.println("Received : " + message);
        return message;
    }

    @OnOpen

    public void myOnOpen(Session session) {
        System.out.println("WebSocket opened: " + session.getId());
    }

    @
            OnClose
    public void myOnClose(CloseReason reason) {
        System.out.println("Closing a WebSocket due to " + reason.getReasonPhrase());
    }
}
