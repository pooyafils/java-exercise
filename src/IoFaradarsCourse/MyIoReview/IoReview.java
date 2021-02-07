package IoFaradarsCourse.MyIoReview;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IoReview {
    public static void write() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt",true);
            System.out.println("please inter info");
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
               // int id = in.nextInt();
                 String name=in.next();
                //String familyName=in.next();
                fileWriter.write(name+"\n");
            }
fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void read() {
        try {
            ArrayList<String> strings=new ArrayList<>();

            FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            int chars;
            while ((chars = fileReader.read()) != -1){
                char a=((char)chars);
                String convert=Character.toString(a);
                strings.add(convert);
                System.out.print(a);

            }
     //   System.out.println(strings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  void readWithStringBuliders(){
       ArrayList<String> text=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            BufferedReader br = new BufferedReader(fileReader);

            StringBuilder stringBuilder=new StringBuilder();
            String line=br.readLine();
            while (line !=null){
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                text.add(line);
                line=br.readLine();
            }
            String evrything=stringBuilder.toString();
            System.out.println(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void  readWithStringBulidersAndWrite(){
        try {
            FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            BufferedReader br = new BufferedReader(fileReader);
            FileWriter writer=new FileWriter("\\Users\\User\\Desktop\\New folder\\io\\src\\w.txt",true);

            StringBuilder stringBuilder=new StringBuilder();
            String line=br.readLine();
            while (line !=null){
                stringBuilder.append(line);
                stringBuilder.append("-A");
                stringBuilder.append(System.lineSeparator());
                line=br.readLine();
            }
            String evrything=stringBuilder.toString();
            System.out.println(evrything);
            writer.write(evrything);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readWithStringBuliderAndWriteAndManuplate(){
        try {
            FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            BufferedReader br = new BufferedReader(fileReader);
            FileWriter writer=new FileWriter("\\Users\\User\\Desktop\\New folder\\io\\src\\w.txt",true);

            StringBuilder stringBuilder=new StringBuilder();
            String line=br.readLine();
            while (line !=null){
                int i = line.length();
                if (i!=0) {
                    stringBuilder.append(line);
                    stringBuilder.append(System.lineSeparator());
                }
                //stringBuilder.append("-A");
                line=br.readLine();
            }
            String evrything=stringBuilder.toString();
            System.out.println(evrything);
            writer.write(evrything);

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void main(String [] args){
       // write();
    //read();
          //  readWithStringBuliders();
         //   readWithStringBulidersAndWrite();
            readWithStringBuliderAndWriteAndManuplate();
}
























}
