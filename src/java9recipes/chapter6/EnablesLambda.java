package java9recipes.chapter6;

public class EnablesLambda {
    @FunctionalInterface
    interface  MyText {
        String showText(String s);
    }
    public static void main(String args[]){
       MyText myTexts=(mytext)->{
            String param="";
            param=mytext.toUpperCase();
       return param;

        };
System.out.println(myTexts.showText("java        "));


    }
}

