package interview;

public class FindPairWithMinSumBruteForce {
    public static void findPairWithMinSumBruteForce(int arr[])
    {
        if(arr.length<2)
            return;
        // Suppose 1st two element has minimum sum
        int minimumSum=arr[0]+arr[1];
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                int tempSum=arr[i]+arr[j];

                if(Math.abs(tempSum) < Math.abs(minimumSum))

                {
                    pair1stIndex=i;
                    pair2ndIndex=j;

                    minimumSum=tempSum;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }

    public static void main(String[] args) {
        int arr[]={2,1,-2,-1,3};
        findPairWithMinSumBruteForce(arr);
    }
}
