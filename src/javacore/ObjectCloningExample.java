package javacore;

public class ObjectCloningExample implements Cloneable {
    int rollno;
    String name;

    public ObjectCloningExample(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone () throws  CloneNotSupportedException{
        return super.clone();

    }

    @Override
    public String toString() {
        return "ObjectCloningExample{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloningExample s1=new ObjectCloningExample(101,"amit");
        ObjectCloningExample s2=(ObjectCloningExample)s1.clone();
        s1.name="change the name";
        System.out.println(s1);
        System.out.println(s2);
    }
}
