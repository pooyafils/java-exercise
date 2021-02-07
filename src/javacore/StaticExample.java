package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class StaticExample {
    static int num;
    static String name;
    static {
        num=12;
        name="pooya";
    }
    static {
        num=10;
        name="amir";
    }
    public static void main(String args[]) {

        System.out.println(num+" "+name);
        System.out.println("---------------");
        StaticMethod pooya= new StaticMethod();
        StaticMethod.add();
        StaticMethod.nonstatic();
        pooya.usesStaticinNonStatic();
    }
}
