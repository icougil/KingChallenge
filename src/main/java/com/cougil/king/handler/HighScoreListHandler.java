package com.cougil.king.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

public class HighScoreListHandler implements HttpHandler {
    public HighScoreListHandler(URI requestURI) {
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response = "HighScoreListHandler!";
        System.out.println(response);
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
