package designpatterns.adapter;
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Calling the specificRequest method of Adaptee
        adaptee.specificRequest();
    }
}
