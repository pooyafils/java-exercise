package MovieAndTiketList;

public class Acter {
   private int price;
   private String Name;

    public Acter(int price, String name) {
        this.price = price;
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Acter{" +
                "price=" + price +
                ", Name='" + Name + '\'' +
                '}';
    }
}
