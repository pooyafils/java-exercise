package javacore;

public class innerCLassMain {
    public static void main(String args[]) {
        staticInnerClass.inner p=new staticInnerClass.inner();
        System.out.println(p.innerClassMethod());
        System.out.println("non static classes");
        OuterClass out=new OuterClass();
        OuterClass.inner in=out.new inner();
        System.out.println(in.innerClassMethod());
        in.print();
    }
    }
