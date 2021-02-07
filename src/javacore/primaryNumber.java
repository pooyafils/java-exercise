package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class primaryNumber {
    public static String primary(int a ) {
        if(a%2==0) {
            return "its primary";
        }
        else{

            return "it's not primaey";
        }
    }
    public static void main(String[]args) {
        System.out.println("----");
        System.out.print(primary(11));
    }



}

