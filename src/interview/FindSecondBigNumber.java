package interview;

import java.util.Arrays;

public class FindSecondBigNumber {
    public static int getLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])

                {
                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }
            }
        }
        return a[total-1];
    }
    public static int getLargests(int[] a, int total){
        Arrays.sort(a);
        return a[total-1];
    }
    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
    public static void main(String[] args) {
        int[] arr={5,34,12,10};
int a=getLargest(arr,4);
System.out.println(a+"biggest");
findSecondHighest(arr);
    }

}



/*
public class interview.FindSecondBigNumber {


    public static void main(String[] args) {
        int[] arr={1000,5,34,12,20,100};
        int a=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]>arr[j]);
                System.out.println(arr[i]+"-----"+arr[j]);
                if(arr[i]<arr[j]){
                    a=arr[j];
                }
            }
        }
        System.out.println(a+"an");

    }
}
*/






