package java8course;


interface Engine{
    default String model(int id){
        return "DEFAULT ENGINE";
    }

}

interface Vehicle {
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}
class Car implements Engine, Vehicle{
      public   String model(int i){
            return Engine.super.model(i);
        }

}
public class MultipleInheritance {
public static void main(String args[]){
    Car c=new Car();
c.model(12);
System.out.println(c);
}
}
