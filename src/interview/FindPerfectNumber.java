package interview;

public class FindPerfectNumber {
    public static boolean checkPerfect(int num) {
        int sum = 1;
        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        return sum==num;
    }
}
