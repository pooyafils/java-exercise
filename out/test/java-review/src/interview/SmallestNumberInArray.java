package interview;

public class SmallestNumberInArray {
    public static int smallestElementArray(int arr[]){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int [] arr = new int [] {25, 11, 7, 75, 56};

        System.out.println(smallestElementArray(arr));
    }
}
