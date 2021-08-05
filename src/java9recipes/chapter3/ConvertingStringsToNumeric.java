package java9recipes.chapter3;

public class ConvertingStringsToNumeric {
    public static void main(String args[]){
    //    The Integer class contains the valueOf() and parseInt() methods ,
        //    which are used to convert Strings or int types into integers.
        //    There are two different forms of the Integer class’s

        String one="1";
        String two="2";
        int result=Integer.valueOf(one)+Integer.valueOf(two);
        int sum=Integer.parseInt(one)+Integer.parseInt(two);
        System.out.println(result);

    }
}
