package interview;

import java.util.Arrays;

public class FindNumberInString {
    public static String[] numInStr(String[] arr) {
        return Arrays.stream(arr)
                .filter(s -> s.matches(".*[0-9].*"))
                .toArray(String[]::new);
    }
    public static void main(String[] args) {
        String [] arr={"a71","samsung"};
        String [] find=numInStr(arr);
        for (int i=0;i<find.length;i++){
            System.out.println(find[i]);
        }

    }
}
