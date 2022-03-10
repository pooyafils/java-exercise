public class FindDuplicateElementInString {
    public static char[] duplicateElement(String text) {

        char[] ch = text.toCharArray();
        char[] duplicate = new char[text.length()];
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    // System.out.println("repeated element is : "+ch[j]);
                    duplicate[j] = ch[j];
                    break;
                }
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
     System.out.println(duplicateElement("pooyaay"));
    }
}
