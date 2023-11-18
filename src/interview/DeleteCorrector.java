package interview;

public class DeleteCorrector {
    public static String deleteAt(final String target, final int start, int end) {
        final int targetLen = target.length();
        if (start < 0) {
            throw new IllegalArgumentException("start=" + start);
        }
        if (end > targetLen || end < start) {
            throw new IllegalArgumentException("end=" + end);
        }
        if (start == 0) {
            return end == targetLen ? "" : target.substring(end);
        } else if (end == targetLen) {
            return target.substring(0, start);
        }
        final char[] buffer = new char[targetLen - end + start];
        target.getChars(0, start, buffer, 0);
        target.getChars(end, targetLen, buffer, start);
        return new String(buffer);
    }
    public static void main(String[] args) {
        String deleteString="java language";
        deleteString=deleteAt(deleteString,3,7);
        System.out.println(deleteString);
    }
}
