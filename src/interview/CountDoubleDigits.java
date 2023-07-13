package interview;

public class CountDoubleDigits {
    public static int digitsCount(long n) {
        String strN = Long.toString(n);

        int count = 0;

        for(int i = 0; i < strN.length(); i++) {
            if(Character.isDigit(strN.charAt(i))) {
                count++;
            }
        }

        return count;
    }
    public static long numCount(double nu){
        String num=String.valueOf(123.11);
        String[] outPut=num.split("\\.");
      //  System.out.println(outPut[0]);
      //  System.out.println(outPut[1]);
        return Long.valueOf(outPut[1]);
    }

    public static void main(String[] args) {

        System.out.println(digitsCount(numCount(123.11)));

    }
}
