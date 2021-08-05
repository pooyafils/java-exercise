package javacore;

/**
 * pooya mahmoodi 11/11/2020
 **/
public class InnerClassStatic {
    int x=3;
    int y=2;
    static int staticVarible=2;
    public int outerClassCalculate(){
        return x;
    }
    public void outerPrint(){
       // System.out.println(innerClassCalculate()); error
        //outer class can not access to inner class members no mater inner class is static or non ststic
    }
    static class staticInner{
        public int innerClassCalculate(){
            return staticVarible;
            // statice inner class can access to all members of outer class if they are static
        }
    }
}
