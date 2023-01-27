package javacore;

import javax.swing.*;

public class main {
    public static void main(String[]args) {
        InheritancePolymorphism inheritancePolymorphism
                =new InheritancePolymorphism(12,45,12);
        System.out.println("this nis a supper class object and call method "+inheritancePolymorphism.numbersOfReadingWord());
        System.out.println("this nis a supper class object and call method "+inheritancePolymorphism.kiddCanRead());
        System.out.println("--------------------");
        Teen ob=new Teen(12,45,12);
        System.out.println("subclass");
        ob.numberTeenCanRead();
System.out.println("sub class can inh method from super class "+ob.kiddCanRead());

        System.out.println("example of Polymorphism");
        InheritancePolymorphism inheritancePolymorphism2=new Polymorphism(12,45,12);
        System.out.println("java is smart enough to understand i mean kiddCanRead() in the Polymorphism");
        System.out.println(inheritancePolymorphism2.kiddCanRead());
    }
    }
