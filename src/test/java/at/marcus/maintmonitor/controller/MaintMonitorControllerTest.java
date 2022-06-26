package at.marcus.maintmonitor.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

class MaintMonitorControllerTest {

    //https://stackoverflow.com/questions/6467848/how-to-get-http-response-code-for-a-url-in-java
    @Test
    void testGetMessage() throws IOException {
        URL url = new URL("http://localhost:8080/maintMode/");
        HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int code = connection.getResponseCode();
        Assertions.assertEquals(HttpURLConnection.HTTP_OK,code);
    }
}