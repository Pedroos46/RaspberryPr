
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

            NodeList nList = doc.getElementsByTagName("LED_Grup1");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;

                            System.out.println("Contador: " + eElement.getAttribute("Vegades_utlitzat"));
                            System.out.println("Contador: " + eElement.getElementsByTagName("Vegades_utlitzat").item(0).getTextContent());
                            

                    }
            }
        }catch (Exception e) {
	e.printStackTrace();
    }
  }

}
    
    

