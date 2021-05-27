package java9recipes.chapter6.compareobjects;

public class CompareObjects {
    public static void main(String args[]) {

        Book a = new Book(1, "java");
        Book b = new Book(1, "spring");
        Book c = new Book(1, "java");
        if (a == b) {
            System.out.println("1. i used == and they are equal");
        }
        if (a == c) {
            System.out.println("2. i used == and they are equal");

        }
        if(a.equals(c)){
            System.out.println("3. i used equal method and they equal");
        }
     
    }
}
