package interview;

public interface StaticMethodInInterface {
    void myMethod();
    default void log(String s ){
        System.out.println(s);
    }
    static int mynum(int i){
        return i;
    }
   // static int count();
   // since java 8 we can have static method
}
