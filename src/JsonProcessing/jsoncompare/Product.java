package JsonProcessing.jsoncompare;

public class Product {
    private int id;
    private String name;
    private String des;
    private String category;

    public Product() {
    }

    public Product(int id, String name, String des, String category) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
