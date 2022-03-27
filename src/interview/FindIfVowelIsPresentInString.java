package interview;

import java.sql.Statement;

public class FindIfVowelIsPresentInString {
    public static boolean vowelIsPresent(String givenString,String vowel){
        if(givenString.contains(vowel)){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
System.out.println(vowelIsPresent("this is","is"));
    }
}
