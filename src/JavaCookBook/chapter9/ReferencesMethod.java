/*
package JavaCookBook.chapter9;

import java.util.*;

import static jdk.internal.net.http.common.Utils.dump;

public class ReferencesMethod {
    static final String[] unsortedNames = {
            "Gosling", "de Raadt", "Torvalds", "Ritchie", "Hopper"
    };
    public static void main(String[] args) {
        String[] names;
// Sort using
// "an Instance Method of an Arbitrary Object of a Particular Type"
        names = unsortedNames.clone();
        Arrays.sort(names, String::compareToIgnoreCase);
        dump(names);
// Equivalent Lambda:
        names = unsortedNames.clone();
        Arrays.sort(names, (str1, str2) -> str1.compareToIgnoreCase(str2));
        dump(names);
// Equivalent old way:
        names = unsortedNames.clone();
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        dump(names);


// Simpest way, using existing comparator
        names = unsortedNames.clone();
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        dump(names);
    }
}
*/
