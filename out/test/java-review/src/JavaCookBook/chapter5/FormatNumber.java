package JavaCookBook.chapter5;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {

    public static void main(String[] args) {
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        numberFormat.setMinimumIntegerDigits(1);
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(4);
        System.out.println(numberFormat.format(1));
        double d = 123456.789;
        NumberFormat nf
                = NumberFormat.getInstance(Locale.ITALY);
        System.out.println("ITALY representation of " + d
                + " : " + nf.format(d));
    }
}
