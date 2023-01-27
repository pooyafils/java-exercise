package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class StaticMethod {
    int number=10;
    static String name="pooya";
    static int num=120;
    public static void nonstatic() {
        // display(); //error
        System.out.println(" static--- "+name);

    }
    public static void  add() {

        // System.out.print(number); // error
        System.out.println("this is the static method "+num);
    }
    public void display() {
        add();
    }
    public void usesStaticinNonStatic(){
        System.out.println("this is non static method ");
        add();
        int staticInNonStaticMethod=num+number;
        System.out.println("static var in non static method "+staticInNonStaticMethod);
    }
}
