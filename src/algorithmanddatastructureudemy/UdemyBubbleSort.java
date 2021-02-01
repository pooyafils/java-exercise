package algorithmanddatastructureudemy;

import java.util.Arrays;
import java.util.stream.Stream;

public class UdemyBubbleSort {
    public static void main(String [] args){
int []intArray={20,35,-1,-15,55,7};

        for(int lastIndexSorted=intArray.length-1;lastIndexSorted>0;lastIndexSorted--){
           // System.out.println("this is the value of last index sorted"+lastIndexSorted);
                for(int i=0;i<lastIndexSorted;i++){
                    if(intArray[i]>intArray[i+1]){
                        swap(intArray,i,i+1);
                    }
                }
        }
     //   Arrays.stream(intArray).forEach(System.out::print);
        for(int i=0;i<intArray.length;i++){
      //      System.out.print(","+intArray[i]);
        }
    }

    public static void  swap(int[] array,int i,int j){
       if(i==j){
           return;
       }
       int temp=array[i];
       array[i]=array[j];
       // we put what is in j to i
       array[j]=temp;
      // System.out.println(array[i]+" "+array[j]);
    }
}
