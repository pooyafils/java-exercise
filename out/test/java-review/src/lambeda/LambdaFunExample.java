package lambeda;

/**
 * Created by pooya on 4/18/2020.
 */
public class LambdaFunExample {

    interface pooya{
        int operate (int a,int b);
    }
    public static void main(String args[]) {
        pooya ob=(int a,int b)->a+b;
        System.out.print(ob.operate(2,4));
    }
}
