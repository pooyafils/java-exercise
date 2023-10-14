package interview;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int currentMaxSubarraySum = 0;
        int overallMaxSubarraySum = 0;
        for (int element : arr) {
            currentMaxSubarraySum = Math.max(element, currentMaxSubarraySum + element);
            overallMaxSubarraySum = Math.max(overallMaxSubarraySum, currentMaxSubarraySum);
        }

        System.out.println("The maximum subarray sum in the array is: " + overallMaxSubarraySum);
    }
}
