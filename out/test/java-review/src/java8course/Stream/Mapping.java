package java8course.Stream;

import java.util.stream.Stream;

import java.util.List;
public class Mapping {
    List<Employee> employees=EmployeeUtil.createEmployees();
public void tesMapping(){
    Stream<String> empstream=employees.stream()
            .map(Employee::getName)
            .map(String::toUpperCase);
        empstream.forEach(System.out::println);
}
    public static void main(String [] args) {
    new Mapping().tesMapping();
    }
    }
