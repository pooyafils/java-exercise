package javacore.objectdetactor;

public class Product {
    private int price;
    private String name;
    private String producer;

    public Product(int price, String name, String producer) {
        this.price = price;
        this.name = name;
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
