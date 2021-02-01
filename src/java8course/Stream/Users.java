package java8course.Stream;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private int id;
    private String name;
    private String email;

    public Users(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StreamExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static List<Users> userUtility(){
        List<Users> user=new ArrayList<>();
        Users user1=new Users(1,"pooya","pooya@");
        user.add(user1);
        Users user2=new Users(2,"sara","sara@");
        user.add(user2);
        Users user3=new Users(3,"amanda","amanda@");
        user.add(user3);
        Users user4=new Users(4,"alex","alex@");
        user.add(user4);

        return user;
    }

}
