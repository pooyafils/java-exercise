package JavaCore;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * pooya mahmoodi 11/11/2020
 **/
public class InnerClassNonStatic {
    public int i=3;
    private int y=2;
    static int stativvar=4;
    public int OuterClassSum(){
        return y;
    }
    public void printOuter(){
       // System.out.println(nonStaticCalculate()); outer class can't access to inner class members
    }
    public class NonStaticInner{
        public int nonStaticCalculate() {
            return i + y; //it can access to both private and public member
        }
        public void printInner(){
            System.out.println(OuterClassSum());
        }
        public void print(){
            System.out.println(OuterClassSum());
            System.out.println(" non static inner class can to all members of outer class if even thet are" +
                    "static " +stativvar);
        }
    }
}
