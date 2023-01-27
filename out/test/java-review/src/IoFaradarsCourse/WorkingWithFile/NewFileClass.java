package IoFaradarsCourse.WorkingWithFile;

import java.io.File;

public class NewFileClass {
    public static void main(String args[]){
        try{
           File f=new File("C:\\Users\\User\\Desktop\\fileuploads\\newfile.txt");
            File renamefiles=new File("C:\\Users\\User\\Desktop\\fileuploads\\newfilerename.txt");

            //  f.createNewFile();
            f.renameTo(renamefiles);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
