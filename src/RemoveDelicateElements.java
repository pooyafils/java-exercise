public class RemoveDelicateElements {
    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray(); // or, use charAt(i)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            System.out.println(String.valueOf(ch));
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String test=":java:";
        System.out.println(removeDuplicates(test));
    }
}
