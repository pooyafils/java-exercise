package java9recipes.chapter20.ReadXmlFile;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXmlFile {
    public void cursorReader()throws FileNotFoundException, IOException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try (FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\WriteXmlFile\\myobjectxml.xml")) {
            XMLStreamReader reader = factory.createXMLStreamReader(fis);
            boolean inName = false;
            boolean inDiagnosis = false;
            String id = null;
            String name = null;
            String diagnosis = null;
            while (reader.hasNext()) {
                int event = reader.next();
                switch ((event)) {
                    case XMLStreamConstants.START_ELEMENT:
                        String element = reader.getLocalName();
                        switch (element) {
                            case "patient":
                                id = reader.getAttributeValue(0);
                                break;
                            case "name":
                                inName = true;
                                break;
                            case "diagnosis":
                                inDiagnosis = true;
                                break;
                            default:
                                break;
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        String elementname = reader.getLocalName();
                        if (elementname.equals("patient")) {
                            System.out.printf("Patient: %s\nName: %s\nDiagnosis: %s\n\n", id, name,
                                    diagnosis);
                            id = name = diagnosis = null;
                            inName = inDiagnosis = false;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        if (inName) {
                            name = reader.getText();
                            inName = false;
                        } else if (inDiagnosis) {
                            diagnosis = reader.getText();
                            inDiagnosis = false;
                        }
                        break;
                    default:
                        break;
                }
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, XMLStreamException {
        ReadXmlFile readXmlFile=new ReadXmlFile();
        readXmlFile.cursorReader();
    }
}
