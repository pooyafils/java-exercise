package interview;

public class SortArrayDescendingOrder {
    public static int[] sortDsc(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr);
        return arr;

    }

    public static void main(String[] args) {
        int [] arr = new int [] {5, 2, 8, 7, 1};
     int print[]=   sortDsc(arr);
     for(int i=0;i<print.length;i++){
         System.out.print(print[i]+",");
     }
    }
}
