package interview;

public class ComplexNumberExercise {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.5, 3.0);
        ComplexNumber num2 = new ComplexNumber(1.2, -4.5);

        System.out.println("Complex number 1: " + num1);
        System.out.println("Complex number 2: " + num2);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum of the complex numbers: " + sum);

        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference of the complex numbers: " + difference);

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Product of the complex numbers: " + product);
    }
}