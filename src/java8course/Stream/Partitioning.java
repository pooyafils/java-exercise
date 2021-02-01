package java8course.Stream;

import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;



// Partitioning streams
public class Partitioning {

    List<Employee> employees = EmployeeUtil.createDetailedEmployees();

    private void partitionByExecutives() {
   Map<Boolean,List<Employee>> empPartion=     employees.stream().collect(Collectors.partitioningBy(Employee::isExecutive));
System.out.println(empPartion);
    }

    private void partitioningAndGrouping() {
        Map<Boolean, Map<String, List<Employee>>> execEmployees =
                employees.stream()
                        .collect(partitioningBy((Employee::isExecutive), groupingBy(Employee::getDepartment)));

        for(Boolean b: execEmployees.keySet()){
            System.out.println(b+" --> "+execEmployees.get(b));
        }

    }

    private void partitioningMultiLevel() {


    }

    public static void main(String[] args) {
        new Partitioning().partitionByExecutives();
        new Partitioning().partitioningAndGrouping();
        new Partitioning().partitioningMultiLevel();
    }
}
