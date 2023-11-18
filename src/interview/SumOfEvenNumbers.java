package interview;

public class SumOfEvenNumbers {
    public static void calculate(int N) {

        int sum = 0;
        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("The sum of all even numbers from 1 to " + N + " is: " + sum);
    }

    public static void main(String[] args) {
        calculate(15);
    }
}
