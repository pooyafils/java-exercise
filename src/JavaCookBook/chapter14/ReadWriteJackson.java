package JavaCookBook.chapter14;

public class ReadWriteJackson {
    public static void main(String[] args) {
       // ObjectMapper mapper = new ObjectMapper();
        String jsonInput =
                "{\"id\":0,\"firstName\":\"Robin\",\"lastName\":\"Wilson\"}";
      //  Person q = mapper.readValue(jsonInput, Person.class);
     //   System.out.println("Read and parsed Person from JSON: " + q);
        Person p = new Person("Roger", "Rabbit");
        System.out.print("Person object " + p +" as JSON = ");
     //   mapper.writeValue(System.out, p);
    }

}
