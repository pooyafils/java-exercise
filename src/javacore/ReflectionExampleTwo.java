package javacore;

public class ReflectionExampleTwo implements PersonForReflection {

    @Override
    public void display() {
        System.out.println("I am a Student");

    }

    public static void main(String[] args) {
        try{
           ReflectionExampleTwo reflectionExampleTwo=new ReflectionExampleTwo();
           Class obj=reflectionExampleTwo.getClass();

            Class superClass = obj.getSuperclass();
            System.out.println(obj.getName()+" "+superClass.getName());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
