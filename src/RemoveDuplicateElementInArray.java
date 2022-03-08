public class RemoveDuplicateElementInArray {
    public static char[] removeDuplicateElement(String text) {

        char[] ch = text.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[i]=' ';
                }
                    break;
                }
            }
        return ch;
        }

    public static void main(String[] args) {
//System.out.println(removeDuplicateElement("pooya"));
        StringBuilder output = new StringBuilder();
        char[] charArray =removeDuplicateElement("pooya");

        for(char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        System.out.println(output.toString());
    }
}