package Recursion;

/**
 * pooya mahmoodi 4/3/2021
 **/
public class SumUntilTen {
    public static void main(String args[]){
        System.out.println(sumNum(10));
    }


    public static int sumNum(int a){

        if(a>0){
            return a+sumNum(a-1);
        }
        else {
            return 0;
        }
    }
}
