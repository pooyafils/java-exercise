package interview;

public class reverseString {

    public static String reverseString(String text){
        char[] te=text.toCharArray();
        StringBuilder out = new StringBuilder();
        for(int i=te.length-1;i>=0;i--){
            out.append(te[i]);
            System.out.println(out.toString());
        }
        return out.toString();
    }


    public static void main(String args[]){
reverseString("pooya");
    }
}
