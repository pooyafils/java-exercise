package java8course.Stream;
import java.util.List;
import java.util.stream.Stream;


//Distinct, Limit and Skip operations
public class DistinctLimitSkip {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testDistinct() {
    Stream<String> employeeNameStream=
            employees.stream().map(
                    Employee::getName)
            .distinct();
            employeeNameStream.forEach(System.out::println);
    }
    private void testLimit() {
        Stream<String> employeeNameStream=
                employees.stream().map(
                        Employee::getName)
                        .limit(3)
                        .distinct();
        employeeNameStream.forEach(System.out::println);
    }

    private void testSkip() {
        Stream<String> employeeNameStream=
                employees.stream().map(
                        Employee::getName)
                .skip(2);
        employeeNameStream.forEach(System.out::println);

    }

    public static void main(String[] args) {
//		new DistinctLimitSkip().testDistinct();
//	new DistinctLimitSkip().testLimit();
	new DistinctLimitSkip().testSkip();
    }

}
