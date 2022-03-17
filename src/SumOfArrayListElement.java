import java.util.ArrayList;

public class SumOfArrayListElement {
   public static void sumOfArray(int [] arr){
       int sum=0;
         for(int i=0;i<arr.length;i++){
             sum=arr[i]+sum;
         }
         System.out.println(sum);
    }
    public static void main(String args[]){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        int a=0;
        for(int i=0;i<arrayList.size();i++){
       a=arrayList.get(i)+a;
   }
   System.out.println(a);
        int [] myArr={1,4,5};
        sumOfArray(myArr);
    }
}
