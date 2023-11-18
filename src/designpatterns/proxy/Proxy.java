package designpatterns.proxy;

class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        // Lazy initialization of RealSubject
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        // Additional behavior before forwarding the request
        System.out.println("Proxy: Performing pre-processing.");

        // Forward the request to the RealSubject
        realSubject.request();

        // Additional behavior after forwarding the request
        System.out.println("Proxy: Performing post-processing.");
    }
}