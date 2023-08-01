package interview;

public class StringInOrder {
    public static boolean isInOrder(String s) {
        String[] r=s.split("");
        java.util.Arrays.sort(r);
        return String.join("", r).equals(s);
    }

    public static void main(String[] args) {
        System.out.println(isInOrder("abc"));
    }
}
