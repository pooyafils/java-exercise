package interview;

public class NativeDevelopmentForMapMain {
    public static void main(String[] args) {

        NativeDevelopmentForMap<String, Integer> map = new NativeDevelopmentForMap<>();

        map.put("Alex", 1);
        map.put("Tomy", 2);
        map.put("Anna", 3);

        System.out.println("Alex value is: " + map.get("Alex"));

        map.remove("Alex");

        System.out.println(map);
    }

}
