package java8course.Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;


public class Grouping {

    List<Employee> employees = EmployeeUtil.createDetailedEmployees();

    //grouping by department
    private void groupingByDepartment() {
        Map<String,List<Employee>> desEmployee=employees.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment()));
        System.out.println(desEmployee);
    }

    //grouping by city
    private void groupingByCity() {
        Map<String,List<Employee>> desEmployee=employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(desEmployee);
    }

    // multi level grouping by
    private void groupingByDepartmentAndExec() {
        Map<String, Map<String, List<Employee>>> deptAndCityEmployees =
                employees.stream()
                        .collect(groupingBy((Employee::getDepartment), groupingBy(Employee::getCity)));
        System.out.println(deptAndCityEmployees);

    }

    // Grouping by list
    private void groupingByList() {
    }

    // Grouping by count
    private void groupingByCount() {
    }

    public static void main(String[] args) {
        new Grouping().groupingByDepartment();
        new Grouping().groupingByCity();
        new Grouping().groupingByDepartmentAndExec();
        new Grouping().groupingByList();
        new Grouping().groupingByCount();
    }
}
