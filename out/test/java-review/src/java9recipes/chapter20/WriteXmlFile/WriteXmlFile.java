package java9recipes.chapter20.WriteXmlFile;
import javax.sql.rowset.spi.XmlWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WriteXmlFile {
    public void run() throws FileNotFoundException, XMLStreamException,
            IOException {
        List<Patient> patients = new ArrayList<>();
        Patient p1 = new Patient();
        Patient p2 = new Patient();
        Patient p3 = new Patient();
        p1.setId(BigInteger.valueOf(1));
        p1.setName("p1 name");
        p1.setDiagnosis("p1 ds");
        p2.setId(BigInteger.valueOf(2));
        p2.setName("p2 name");
        p2.setDiagnosis("p2 ds");
        p3.setId(BigInteger.valueOf(3));
        p3.setName("p3 name");
        p3.setDiagnosis("p33 ds");
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        try {
            FileOutputStream fos = new FileOutputStream
                    ("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\WriteXmlFile\\myobjectxml.xml");
            XMLStreamWriter writer = factory.createXMLStreamWriter(fos, "UTF-8");
            writer.writeStartDocument();
            writer.writeCharacters("\n");
            writer.writeStartElement("patients");
            writer.writeCharacters("\n");
            for (Patient p : patients) {
                writer.writeCharacters("\t");
                writer.writeStartElement("patient");
                writer.writeAttribute("id", String.valueOf(p.getId()));
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("name");
                writer.writeCharacters(p.getName());
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("diagnosis");
                writer.writeCharacters(p.getDiagnosis());
                writer.writeEndElement();
                writer.writeCharacters("\n\t");
                writer.writeEndElement();
                writer.writeCharacters("\n");
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, XMLStreamException {
        WriteXmlFile writeXmlFile=new WriteXmlFile();
        writeXmlFile.run();
    }
}