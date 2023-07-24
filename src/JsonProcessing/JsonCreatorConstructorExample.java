package JsonProcessing;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonCreatorConstructorExample {
 /*           <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.9.3</version>
        </dependency>*/
    public static void main(String[] args) throws IOException {
        System.out.println("-- writing --");
        Employee employee = new Employee("Trish", "Admin");
        //convert to json
        String jsonString = toJson(employee);
        System.out.println(jsonString);
        System.out.println("-- reading --");
        Employee e = toEmployee(jsonString);
        System.out.println(e);
    }

    private static Employee toEmployee(String jsonData) throws IOException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(jsonData, Employee.class);
    }

    private static String toJson(Employee employee) throws IOException {
        ObjectMapper om = new ObjectMapper();
        return om.writeValueAsString(employee);
    }

    private static class Employee {
        private String name;
        private String dept;

        @JsonCreator
        public Employee(@JsonProperty("name") String name, @JsonProperty("dept") String dept) {
            System.out.println("'constructor invoked'");
            this.name = name;
            this.dept = dept;
        }

        public String getName() {
            return name;
        }

        public String getDept() {
            return dept;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    '}';
        }
    }
}