package JavaCookBook.chapter17;

import java.util.Calendar;

public class ClassInfos {
    public static void main(String[] args) {
        System.out.println("Trying the ClassName.class keyword:");
        System.out.println("Object class: " + Object.class);
        System.out.println("String class: " + String.class);
        System.out.println("String[] class: " + String[].class);
        System.out.println("Calendar class: " + Calendar.class);
        System.out.println("Current class: " + ClassInfos.class);
        System.out.println("Class for int: " + int.class);
        System.out.println();
        System.out.println("Trying the instance.getClass() method:");
        System.out.println("Sir Robin the Brave".getClass());
        System.out.println(Calendar.getInstance().getClass());
    }
}
