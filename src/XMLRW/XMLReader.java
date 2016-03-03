
package XMLRW;

import DataStructures.MapClass;
import DataStructures.StackClass;
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
    
    StackClass stack = new StackClass();
    MapClass mapout = new MapClass();
    
    
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
                            String LGrup1 = (eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            System.out.println("Contador: " + LGrup1);
                            
                            Integer nLGrup1 = Integer.parseInt(LGrup1);
                            stack.push(nLGrup1); //led1 esta primer

                    }
            }
            NodeList nListLed2 = doc.getElementsByTagName("LED_Grup2");
            for (int temp = 0; temp < nListLed2.getLength(); temp++) {
                    Node nNode = nListLed2.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            String LGrup2 = (eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            System.out.println("Contador: " + LGrup2);
                                                        
                            Integer nLGrup2 = Integer.parseInt(LGrup2);
                            stack.push(nLGrup2); //led 2 esta primer i led 1 segon
        
                    }
            }
            NodeList nListLuz = doc.getElementsByTagName("Luz");
            for (int temp = 0; temp < nListLuz.getLength(); temp++) {
                    Node nNode = nListLuz.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            String Luz = (eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            System.out.println("Contador: " + Luz);
                            
                            Integer nLuz = Integer.parseInt(Luz);                           
                            stack.push(nLuz); //luz esta esta pimer, led2 segon, led 1 tercer

                    }
            }
            NodeList nListPito = doc.getElementsByTagName("Pito");
            for (int temp = 0; temp < nListPito.getLength(); temp++) {
                    Node nNode = nListPito.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            String Pito = (eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            System.out.println("Contador: " + Pito);
                            
                            int nPito = Integer.parseInt(Pito);
                            mapout.put(nNode.getNodeName(), nPito);

                    }
            }
            NodeList nListBoto = doc.getElementsByTagName("Boto");
            for (int temp = 0; temp < nListBoto.getLength(); temp++) {
                    Node nNode = nListBoto.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            String Boto = (eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            System.out.println("Contador: " + Boto);
                            
                            int nBoto = Integer.parseInt(Boto);
                            mapout.put(nNode.getNodeName(), nBoto);

                    }
            }
            NodeList nListServo = doc.getElementsByTagName("Servo");
            for (int temp = 0; temp < nListServo.getLength(); temp++) {
                    Node nNode = nListServo.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            String Servo = (eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            System.out.println("Contador: " + Servo);
                            
                            int nServo = Integer.parseInt(Servo);
                            mapout.put(nNode.getNodeName(), nServo);
                    }
            }
        }catch (Exception e) {
         System.err.println(e.getMessage());
        }
    }
}


    