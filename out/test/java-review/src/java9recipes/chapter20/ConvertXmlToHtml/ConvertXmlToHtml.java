package java9recipes.chapter20.ConvertXmlToHtml;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConvertXmlToHtml {
    public static void run(String xmlFile, String xslFile, String outputFile)
            throws FileNotFoundException, TransformerConfigurationException,
            TransformerException {
        InputStream xslInputStream=new FileInputStream(xslFile);
        Source xslSource=new StreamSource(xslInputStream);
        TransformerFactory factory=TransformerFactory.newDefaultInstance();
        Transformer transformer=factory.newTransformer(xslSource);
        InputStream xmlInputStream = new FileInputStream(xmlFile);
        StreamSource in = new StreamSource(xmlInputStream);
        StreamResult out = new StreamResult(outputFile);
        transformer.transform(in, out);

    }

    public static void main(String[] args) throws FileNotFoundException, TransformerException {
        run("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\WriteXmlFile\\myobjectxml.xml",
                "C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\ConvertXmlToHtml\\example.xsl",
                "C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\ConvertXmlToHtml\\example.html");
    }
}
