package java8course.Stream;

import Stream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersStream {
    String email;

    public UsersStream(String email) {
        this.email = email;
    }

    List<Users> users=Users.userUtility();
    public void userDb(int id){
     boolean ans=   users.stream().anyMatch(t-> {
             if(t.getId()==id) return true;
             else return false; });
     System.out.println("boolean result "+ans);
     if (ans=true){
         users.get(id-1).setEmail(email);
         users.forEach(users->System.out.println(users));
     }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

System.out.println("Please Enter the id of user and email"); // id @userEmail

       int id=in.nextInt();
       String email=in.nextLine();
        new UsersStream(email).userDb(id);
    }
    }
