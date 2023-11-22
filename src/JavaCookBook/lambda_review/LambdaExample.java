package JavaCookBook.lambda_review;

public class LambdaExample {
    @FunctionalInterface
    public interface sumNumbers{
        public int sum(int i,int y);
    }
    public static void main(String args[]){
        //making a object from functional interface
        sumNumbers obj=(i,y)->i+y;
        //init them
       int sum= obj.sum(3,7);
       System.out.println("this is sum of the two numbers with lambda "+sum);
    }
}
