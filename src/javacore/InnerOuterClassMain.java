package JavaCore;

/**
 * pooya mahmoodi 11/11/2020
 **/
public class InnerOuterClassMain {
    public static void main(String args[]){
        System.out.println("---iniislizing a class with static inner class");
        InnerClassStatic.staticInner Sinner=new  InnerClassStatic.staticInner();
        System.out.println( Sinner.innerClassCalculate());
        System.out.println("---iniislizing a class with non static inner class");

       InnerClassNonStatic outer=new InnerClassNonStatic();
       InnerClassNonStatic.NonStaticInner inn=outer.new NonStaticInner();
       System.out.println(inn.nonStaticCalculate());
       inn.print();
    }
}
