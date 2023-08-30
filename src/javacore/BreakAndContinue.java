package javacore;

public class BreakAndContinue {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i == 3) {
                break; // This will terminate the loop when i becomes 5
            }
            System.out.println(i);
        }
        System.out.println(" ended");

    }
}
