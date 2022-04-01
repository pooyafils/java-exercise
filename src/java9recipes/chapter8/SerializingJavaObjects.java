package java9recipes.chapter8;

import java.io.*;

public class SerializingJavaObjects {
    private void start() throws IOException {
        ProgramSettings settings = new ProgramSettings(11,10,"blue");
saveSetting(settings,"C:\\Users\\User\\Desktop\\find.txt");
        ProgramSettings loadedSettings = loadSettings("C:\\Users\\User\\Desktop\\find.txt");
        if(loadedSettings!=null){
            System.out.println("Are settings are equal? :"+loadedSettings.equals(settings));
        }

    }
    private void saveSetting(ProgramSettings programSettings,String filename) throws IOException {
        try{
            FileOutputStream fos= new FileOutputStream(filename);
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(programSettings);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private ProgramSettings loadSettings(String filename) {
        try{
            FileInputStream fis=new FileInputStream(filename);
            ObjectInputStream ois=new ObjectInputStream(fis);
            ProgramSettings programSettings=(ProgramSettings)ois.readObject();
            System.out.println(programSettings.getColor()+" "+programSettings.getDimension()+" "+programSettings.getPoint());
            return programSettings;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SerializingJavaObjects serializingJavaObjects=new SerializingJavaObjects();
        try {
            serializingJavaObjects.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
