package parser;

import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ParserSAX {
    public static void main(String[] args)
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        factory.setValidating(true);
        factory.setNamespaceAware(false);
        SAXParser parser;

        InputStream xmlData = null;
        try
        {
            xmlData = new FileInputStream("GunScheme.xsd.xml");

            parser = factory.newSAXParser();
            ParserSAX parserSAX = new ParserSAX();
            parser.parse(xmlData, parserSAX);


        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
            // обработки ошибки, файл не найден
        } catch (ParserConfigurationException e)
        {
            e.printStackTrace();
            // обработка ошибки Parser
        } catch (SAXException e)
        {
            e.printStackTrace();
            // обработка ошибки SAX
        } catch (IOException e)
        {
            e.printStackTrace();
            // обработка ошибок ввода
        }


    }
}
}
