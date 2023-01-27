package interview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {

        String patternt="MM-dd-YYY hh:mm:ss";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(patternt);
        String date=simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
