package parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserSAX {

    public static void main(String argv[]) {

        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean bmodel = false;
                boolean bhandy = false;
                boolean boriginal = false;


                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {

                    System.out.println("Start Element :" + qName);

                    if (qName.equalsIgnoreCase("MODEL")) {
                        bmodel = true;
                    }

                    if (qName.equalsIgnoreCase("HANDY")) {
                        bhandy = true;
                    }

                    if (qName.equalsIgnoreCase("ORIGINAL")) {
                        boriginal = true;
                    }

                }

                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {

                    System.out.println("End Element :" + qName);

                }

                public void characters(char ch[], int start, int length) throws SAXException {

                    if (boriginal) {
                        System.out.println("First Name : " + new String(ch, start, length));
                        boriginal = false;
                    }

                    if (bhandy) {
                        System.out.println("Last Name : " + new String(ch, start, length));
                        bhandy = false;
                    }

                    if (boriginal) {
                        System.out.println("Nick Name : " + new String(ch, start, length));
                        boriginal = false;
                    }

                }

            };

            saxParser.parse("src/main/resources/GunScheme.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}