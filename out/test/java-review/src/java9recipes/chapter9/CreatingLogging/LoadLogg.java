package java9recipes.chapter9.CreatingLogging;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

import Comperetor.Number;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoadLogg {
    public static void main(String[] args) {
        LoadLogg loadLogg=new LoadLogg();
        loadLogg.start();
    }

    private void start(){
        oadLoggingConfiguration();
        Logger logger = LoggerFactory.getLogger("recipeLogger");
        logger.info("Logging for the first Time!");
        logger.warn("A warning to be had");
        logger.error("This is an error!");
    }

    private void oadLoggingConfiguration() {
        FileInputStream ins=null;
        try {
            ins=new FileInputStream(new File("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter9\\CreatingLogging\\logging.properties"));
            LogManager.getLogManager().readConfiguration(ins);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
