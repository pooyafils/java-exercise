package Bulider;

/**
 * pooya mahmoodi 9/4/2020
 **/
public class UserBulider {
    private String name;
    private String familyName;
    private int age;
    private String email;

    public UserBulider setName(String name) {
        this.name = name;
        return this;
    }

    public UserBulider setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public UserBulider setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBulider setEmail(String email) {
        this.email = email;
        return this;
    }

    public User builder(){

        return new User(name,familyName,age,email);
    }

    @Override
    public String toString() {
        return "UserBulider{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
