package lambeda;

/**
 * Created by pooya on 4/12/2020.
 */
public class LambdaExampleThree {
    @FunctionalInterface
    interface add{
        int sum(int i);
    }
    static int  add_i (add add,int i) {

        return add.sum(i);
    }
    public static void main(String[] args) {
        //add_imlpments((int i)->i));
        //add_i((int v) -> v * v,9);
        System.out.println(add_i((int v) -> v * v,9));
        add isthisway=(n)->n+1;
        isthisway.sum(7);
        add block=(int i)->{
            if (i<10)
                return 0 ;   // how to write block of code
            else
                return i;
        };
        System.out.println("lambda with block "+block.sum(3));
    }
}
