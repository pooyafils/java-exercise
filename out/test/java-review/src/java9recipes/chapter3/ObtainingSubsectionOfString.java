package java9recipes.chapter3;

public class ObtainingSubsectionOfString {
public static void main(String args[]){
    substringExample();
}

    public static void substringExample(){
        String example="this is the java example for string  class";
        System.out.println(example.substring(0,example.length()));
        System.out.println(example.substring(5,10));
        System.out.println(example.substring(12,20));

    }

}
