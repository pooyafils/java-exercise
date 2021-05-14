package java9recipes;

public class IteratingOverTheCharacters {
    public static void main(String args[]) {
        String str = "Break down into chars";
        System.out.println(str);
        for(char chr:str.toCharArray()){
            System.out.println(chr);
        }

    //    Use a combination of String helper methods to gain access to the String at a character level.
        //    If you use a String helper method within the context of a loop,
        //    you can easily traverse a String by character. In the following example,
        //    the String named str is broken down using the toCharArray() method .
  
    }
    }
