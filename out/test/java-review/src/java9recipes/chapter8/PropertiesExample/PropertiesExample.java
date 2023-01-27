package java9recipes.chapter8.PropertiesExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    private void start() {
        File file = new File("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter8\\PropertiesExample\\app.properties");
        Properties properties = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            properties = new Properties();
            properties.load(new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter8\\PropertiesExample\\app.properties"));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        boolean shouldWakeUp = false;
        int startCounter = 100;
        String shouldWakeUpProperty = properties.getProperty("ShouldWakeup");
        shouldWakeUp=(shouldWakeUpProperty==null)? false: Boolean.parseBoolean(shouldWakeUpProperty.trim());
        String startCounterProperty = properties.getProperty("StartCounter");
        try{
            startCounter=Integer.parseInt(startCounterProperty);

    } catch (Exception e) {
        System.out.println("Couldn't read startCounter, defaulting to " + startCounter);
    }
        String dateFormatStringProperty = properties.getProperty("DateFormatString", "MMM dd yy");

        System.out.println("Should Wake up? " + shouldWakeUp);
        System.out.println("Start Counter: " + startCounter);
        System.out.println("Date Format String:" + dateFormatStringProperty);

        //setting property
        properties.setProperty("StartCounter", "25");
        try{
            properties.store(new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter8\\PropertiesExample\\app.properties"),"Properties Description");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        properties.list(System.out);
    }

    public static void main(String[] args) {
        PropertiesExample propertiesExample=new PropertiesExample();
        propertiesExample.start();
    }
}
