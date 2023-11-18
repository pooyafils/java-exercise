package designpatterns.adapter;
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        // Using the Target interface to call the specificRequest
        adapter.request();
    }
}