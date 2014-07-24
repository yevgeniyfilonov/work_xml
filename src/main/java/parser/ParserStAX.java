package parser;

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class ParserStAX {

    public static void main(String[] args) throws XMLStreamException {

        List<Employee> empList = null;

        Employee currEmp = null;

        String tagContent = null;

        XMLInputFactory factory = XMLInputFactory.newInstance();

        XMLStreamReader reader =

                factory.createXMLStreamReader(
                        ClassLoader.getSystemResourceAsStream("src/main/resources/GunScheme.xml"));


        while (reader.hasNext()) {

            int event = reader.next();


            switch (event) {

                case XMLStreamConstants.START_ELEMENT:

                    if ("gun".equals(reader.getLocalName())) {

                        currEmp = new Employee();

                        currEmp.id = reader.getAttributeValue(0);

                    }

                    if ("gun".equals(reader.getLocalName())) {

                        empList = new ArrayList<>();

                    }

                    break;


                case XMLStreamConstants.CHARACTERS:

                    tagContent = reader.getText().trim();

                    break;


                case XMLStreamConstants.END_ELEMENT:

                    switch (reader.getLocalName()) {
                        case "gun":
                            empList.add(currEmp);
                            break;

                        case "model":
                            currEmp.model = tagContent;
                            break;

                        case "handy":
                            currEmp.handy = tagContent;
                            break;

                        case "original":
                            currEmp.original = tagContent;
                            break;

                        case "range":
                            currEmp.range = tagContent;
                            break;

                        case "sightingrange":
                            currEmp.sightingrange = tagContent;
                            break;

                        case "cage":
                            currEmp.cage = tagContent;
                            break;

                        case "optics":
                            currEmp.optics = tagContent;
                            break;

                        case "material":
                            currEmp.material = tagContent;
                            break;
                    }

                    break;


                case XMLStreamConstants.START_DOCUMENT:

                    empList = new ArrayList<>();

                    break;

            }


        }


        //Print the employee list populated from XML

        for (Employee emp : empList) {

            System.out.println(emp);

        }


    }

}

class Employee {

    String id;
    String model;
    String handy;
    String original;
    String range;
    String sightingrange;
    String cage;
    String optics;
    String material;


    @Override

    public String toString() {

        return model + " " + handy + "(" + id + ") " + original + " " + range + " " + sightingrange + " " + cage + " " + optics + " " + material;

    }

}
