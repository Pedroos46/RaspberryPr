
package XMLRW;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

/**
 *
 * @author Roger
 */
public class XMLReader {
    public XMLReader(){}
    
    public String hola = "hola";
    
    public void vHistorialAccionsXML(){
        File desktop = new File(System.getProperty("user.home"), "Desktop");
        
        try {

            File fXmlFile = new File(desktop+"\\RaspberryXML\\HistorialAccions.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

       
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nListLed1 = doc.getElementsByTagName("LED_Grup1");
            for (int temp = 0; temp < nListLed1.getLength(); temp++) {
                    Node nNode = nListLed1.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
            NodeList nListLed2 = doc.getElementsByTagName("LED_Grup2");
            for (int temp = 0; temp < nListLed2.getLength(); temp++) {
                    Node nNode = nListLed2.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
            NodeList nListLuz = doc.getElementsByTagName("Luz");
            for (int temp = 0; temp < nListLuz.getLength(); temp++) {
                    Node nNode = nListLuz.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
            NodeList nListPito = doc.getElementsByTagName("Pito");
            for (int temp = 0; temp < nListPito.getLength(); temp++) {
                    Node nNode = nListPito.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
            NodeList nListBoto = doc.getElementsByTagName("Boto");
            for (int temp = 0; temp < nListBoto.getLength(); temp++) {
                    Node nNode = nListBoto.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
            NodeList nListServo = doc.getElementsByTagName("Servo");
            for (int temp = 0; temp < nListServo.getLength(); temp++) {
                    Node nNode = nListServo.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
        }catch (Exception e) {
	e.printStackTrace();
    }
  }

}
    