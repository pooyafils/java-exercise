package java9recipes.chapter6;

public class EncapsulatePieceOfFunctionality {
    @FunctionalInterface
    public interface HelloType{
        void hello(String text);
    }
    public static void main(String args[]){
        HelloType helloType=(String a)->{System.out.println("Hello "+a);};
        helloType.hello("Lambda");
    }
}
