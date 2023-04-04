package interview;

public class ProveStringIsImmutable {
    public static void main(String args[]) {
        // Your code goes here
        String s1 = "InterviewBit";
        String s2 = s1;

        System.out.println(s1 == s2); //they are equal
        s1 += "Scaler";

        System.out.println(s1 == s2); //not equal
    }
}
