package java9recipes.chapter9.CreatingExceptionClass;

public class Main {
    public static void main(String[] args) {
        int i=0;
        if(i==0){
            throw new CreatingExceptionClass("error happend");
        }
    }
}
