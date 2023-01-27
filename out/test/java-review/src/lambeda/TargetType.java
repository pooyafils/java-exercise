package lambeda;

/**
 * Created by pooya on 4/13/2020.
 */
public class TargetType {
    public static void main(String[] argv) {
        Processor stringProcessor = (String str) -> str.length();
        SecondProcessor secondProcessor = (String str) -> str.length();
        String name = "Java Lambda";
        int length = stringProcessor.getStringLength(name);
        System.out.println(length);
        int lengthtwo =secondProcessor.noName(name);
        System.out.println(lengthtwo);
    }
}
@FunctionalInterface
interface Processor {
    int getStringLength(String str);
}
@FunctionalInterface
interface SecondProcessor {
    int noName(String str);
}

