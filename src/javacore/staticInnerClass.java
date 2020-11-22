package javacore;

public  class staticInnerClass {
    public int i = 3;
    private int y = 2;
    static int staticvar = 2;

    public int calculate() {
        return i + 1;
    }

    public void outerPrint() {
        //  System.out.println(innerClassMethod());
        //outer class can not access to inner class members not matter static ot non
    }

    static class inner {
        public int innerClassMethod() {
            return staticvar;
        }

        //static inner  class can access to all member of outer class if they are static
    }

}
