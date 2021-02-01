package algorithmanddatastructureudemy.chapter4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkListMain {
    public static void main(String [] args){
employee employee1=new employee("jane","james",1223);
        employee employee2=new employee("sara","lee",23);
                employee employee3=new employee("alina","java",2323);
                employee employee4=new employee("alina","java",2323);
                EmployLinkList employLinkList=new EmployLinkList();
            System.out.println(employLinkList.isEmpty());
            employLinkList.addToFront(employee1);
        employLinkList.addToFront(employee2);
        employLinkList.addToFront(employee3);
        employLinkList.addToFront(employee4);
        System.out.println(employLinkList.getSize());
        employLinkList.printList();

        employLinkList.removeFromFront();
            System.out.println(employLinkList.getSize());



    }
}
