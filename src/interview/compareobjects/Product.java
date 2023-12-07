package interview.compareobjects;

public class Product {
    private int id;
    private String name;
    private String category;
    private String des;

    public Product() {
    }

    public Product(int id, String name, String category, String des) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.des = des;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
