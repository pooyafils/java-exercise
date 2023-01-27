package IoFaradarsCourse;

import java.io.CharArrayReader;

public class ChareArray {

    public static void main(String [] args){
        try{
            char[] array={'a','w','e'};
            CharArrayReader reader=new CharArrayReader(array);
            int i=0;
            while ((i=reader.read())!=-1){
                char chr=(char) i;
                System.out.print(chr);
            }
        }

        catch (Exception e){

        }
    }

}
