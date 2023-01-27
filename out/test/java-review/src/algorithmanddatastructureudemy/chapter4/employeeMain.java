package algorithmanddatastructureudemy.chapter4;


import java.util.ArrayList;
import java.util.List;

public class employeeMain {
    public static void main(String args[]){
        List<employee> emplyList=new ArrayList<>();
        emplyList.add(new employee("jane","james",1223));
        emplyList.add(new employee("sara","lee",23));
        emplyList.add(new employee("alina","java",2323));
       // emplyList.forEach(System.out::println); //java 8 way for printing
      //  emplyList.forEach(employee -> System.out.println(employee));
        employee[] employeesArray=emplyList.toArray(new employee[ emplyList.size()]);
        for(employee r:employeesArray){
            System.out.println(r);
        }
    }
}
