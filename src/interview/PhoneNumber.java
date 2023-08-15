package interview;

public class PhoneNumber {
    public static String textToNum(String phone) {
        phone=phone.replaceAll("[ABC]", "2")
                .replaceAll("[DEF]", "3")
                .replaceAll("[GHI]", "4")
                .replaceAll("[JKL]", "5")
                .replaceAll("[MNO]", "6")
                .replaceAll("[PQRS]","7")
                .replaceAll("[TUV]","8")
                .replaceAll("[WXYZ]","9");
        return phone;
    }

    public static void main(String[] args) {
        System.out.println(textToNum("M"));
    }
}
