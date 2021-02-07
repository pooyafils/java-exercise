package MovieAndTiketList;

public class Movie {
    private int price;
    private String name;

    public Movie(int price,String name) {
        this.name=name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Movie{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
