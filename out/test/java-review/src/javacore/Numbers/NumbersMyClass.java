package JavaCore.Numbers;

import java.util.Random;

public  class  NumbersMyClass {
       public static  int number = 10;

    public static int creatingRandom(int a,int b){
        Random random=new Random();
        number=random.nextInt(b-a)+a;
        return number;
    }
    public static int numbers(){
        return number;
    }
    public static void OddNumbers(int a){
        if (a%2==1){
            System.out.println("this is a  odd");
        }
        else {
            System.out.println("this is even ");
        }
    }
}
