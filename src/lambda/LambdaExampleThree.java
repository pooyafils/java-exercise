package lambda;

public class LambdaExampleThree {
    @FunctionalInterface
    interface add{
        int sum(int i);
    }
    static int add_i(add add,int i){
        return add.sum(i);
    }
    public static void main(String args[]) {
        System.out.println(add_i((int v)->v*v,9));

        add isthisway=(n)->n+1;
        System.out.println(isthisway.sum(7));
    }
    }
