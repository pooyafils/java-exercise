package javacore;

public class OuterClass {
    public  int i=3;
    private int y=2;
    static int staticvarible=4;
    public int calculate(){
        return i+1;
    }
    public void outerPrint(){
      //  System.out.println(innerClassMethod());
    }
    public class inner{
        public int innerClassMethod(){
            return i+1+y;
        }
        public void print(){
            System.out.println(calculate());
            System.out.println("non static inner class can access to any thing in the outer class"+staticvarible);
        }
    }


    }


