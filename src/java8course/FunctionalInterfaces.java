package java8course;

// Functional Interfaces
public class FunctionalInterfaces {
    // Functional interface
    @FunctionalInterface
    interface Multiplier {
        int multiply(int i, int j);
    };
    // Lambda expression
    Multiplier multiplierLambda = (p, q) -> p*q;
    public static void main(String[] args) {
        FunctionalInterfaces client = new FunctionalInterfaces();
int answer=client.multiplierLambda.multiply(3,2);
System.out.println(answer);
    }

}
