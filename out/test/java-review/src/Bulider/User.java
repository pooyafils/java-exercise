package Bulider;

/**
 * pooya mahmoodi 9/4/2020
 **/
public class User {
    private String name;
    private String familyName;
    private int age;
    private String email;
    private String add;


    public User(String name, String familyName, int age, String email) {
        super();
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
