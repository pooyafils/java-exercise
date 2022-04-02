package java9recipes.chapter8.ExternalizableProgramSettings;

import java.awt.*;
import java.io.*;

public class ExternalizableExample {
  private void start(){
      ExternalizableProgramSettings settings = new ExternalizableProgramSettings(new Point(10,10),new Dimension(300,200), Color.blue, "The title of the application" );
        saveSettings(settings,"address");

      ExternalizableProgramSettings loadedSettings = losdSitting("address");
      System.out.println("Are settings are equal? :"+loadedSettings.equals(settings));

  }


    private void saveSettings(ExternalizableProgramSettings settings, String filename) {
        try{
            FileOutputStream fos=new FileOutputStream(filename);
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(settings);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        private ExternalizableProgramSettings losdSitting(String filename){
        try{
            FileInputStream fis=new FileInputStream(filename);
            ObjectInputStream ois=new ObjectInputStream(fis);
            return (ExternalizableProgramSettings) ois.readObject();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
