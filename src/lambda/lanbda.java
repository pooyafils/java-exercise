package lambda;

public class lanbda {
    interface pooya{
        int add(int a,int b);

    }
    public static void main(String args[]){
        pooya ob=(int a,int b)->a+b;
        System.out.println(ob.add(2,4));

    }
}
