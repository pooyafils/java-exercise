package IoFaradarsCourse.MyIoReview;

import java.io.FileOutputStream;

public class OutPutStream {

    public static void main(String args[]){

        try{
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\writefaradars.txt");
            fileOutputStream.write(33);
            fileOutputStream.close();
            System.out.println("write is done");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
