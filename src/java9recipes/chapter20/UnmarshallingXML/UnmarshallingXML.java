package java9recipes.chapter20.UnmarshallingXML;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallingXML {
    public static void run(String xmlFile, String context) throws JAXBException, FileNotFoundException {
        JAXBContext jc = JAXBContext.newInstance(context);
        Unmarshaller u = jc.createUnmarshaller();

        FileInputStream fis = new FileInputStream(xmlFile);
        Patients patients = (Patients)u.unmarshal(fis);
        for (Patient p: patients.getPatient()) {
            System.out.printf("ID: %s\n", p.getId());
            System.out.printf("NAME: %s\n", p.getName());
            System.out.printf("DIAGNOSIS: %s\n\n", p.getDiagnosis());
        }


    }


    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        if (args.length != 2 ) {
            System.out.printf("Usage: java9recipes.chapter20.UnmarshallingXML.UnmarshallingXML <xmlfile> <context>\n");
            System.exit(1);
        }
        UnmarshallingXML app = new UnmarshallingXML();
        try {
            app.run(args[0], args[1]);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }}
