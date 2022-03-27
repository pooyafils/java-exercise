package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordPresentInText {
public static boolean findWord(String filePath,String word) throws FileNotFoundException {
    File file=new File(filePath);
    Scanner scanner=new Scanner(file);
    while (scanner.hasNextLine()){
        String line=scanner.nextLine();
        System.out.println(line);
        if(line.contains(word)){
            scanner.close();;
            return true;
        }

    }
    scanner.close();
    return false;
}
    public static void main(String[] args) throws FileNotFoundException {
         boolean a=findWord("C:\\Users\\User\\Desktop\\find.txt","java");
         System.out.println(a);
    }
}
