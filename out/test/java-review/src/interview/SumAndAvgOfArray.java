package interview;

public class SumAndAvgOfArray {
    public static void sumAndAvgOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }
        System.out.println("sum of array "+sum+" avg "+sum/arr.length);
    }

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};

        sumAndAvgOfArray(arr);
    }
}
