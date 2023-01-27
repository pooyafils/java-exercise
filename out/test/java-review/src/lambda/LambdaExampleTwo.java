package lambda;

import java.util.ArrayList;
import java.util.List;

class LambdaExampleTwo {
    public interface lambda{
        int sum(int sum);
    }
     public static void main(String args[]) {
         List<Integer> poo=new ArrayList<>();
         poo.add(1);
         poo.add(2);
         poo.add(3);
         poo.forEach(i->System.out.println(i+","));
         lambda ob=(int x)->x+1;
         int x=ob.sum(12);
         System.out.println(x);
     }
     }
