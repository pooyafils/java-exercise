package JavaCookBook.chapter3;

public class StringBuilders {

    public static void main(String[] args) {
        String s1="hello"+","+"world";
        System.out.println(s1);
        StringBuilder sb2=new StringBuilder();
        sb2.append("hello");
        sb2.append("()");
        String pooya=sb2.toString();
        System.out.println(pooya);
    }

}
