package ma.fnine.soap_server.server;

import jakarta.xml.ws.Endpoint;
import ma.fnine.soap_server.webservice.ProductWebService;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        System.out.println("Server is running... at " + url);
        Endpoint.publish(url, new ProductWebService());
    }
}
