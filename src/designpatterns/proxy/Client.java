package designpatterns.proxy;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        // Client interacts with the proxy
        proxy.request();
    }
}