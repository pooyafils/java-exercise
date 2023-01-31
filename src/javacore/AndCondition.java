package javacore;

public class AndCondition {
    public static void main(String[] args) {
        int[] test={1,2,3,-5,0,6};
        int sum=0;
        for(int i=0;i<test.length;i++){
            if(test[i]!=-5 && test[i]!=0 ){
               // System.out.println(test[i]);
                sum+=test[i];
            }
        }
        System.out.println("sum is "+sum);
    }
}
