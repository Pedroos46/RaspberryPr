
package XMLRW;


import Exceptions.CustomExceptions;
import Exceptions.CustomExceptions.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author Roger
 */
public class XMLWriter extends CustomExceptions{
    public XMLWriter(){}
    
    public String vActualTime(){
 	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
	  
	   //get current date time with Calendar()
	   Calendar cal = Calendar.getInstance();
	   String DataActual = ((dateFormat.format(cal.getTime())).toString());
        
        return DataActual;
    }
    
    
  
    public void vCarpetaEscriptori()throws ExcepcioCarpetaNoCreada{
        File desktop = new File(System.getProperty("user.home"), "Desktop");
        File theDir = new File(desktop + "\\RaspberryXML");
            theDir.setReadable(true);
            theDir.setWritable(true);
            
                
            if (!theDir.exists()) {
                boolean result = false;

                try{
                    theDir.mkdir();
                    result = true;
                } 
                 catch(SecurityException se){
                  throw new ExcepcioCarpetaNoCreada();
                 }
             /*       Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
    alert1.setTitle("SecurityException llençada");
    alert1.setHeaderText("La carpeta no ha estat creada");
    alert1.setContentText("Vols crearla?");

    Optional<ButtonType> result1 = alert1.showAndWait();
    if (result1.get() == ButtonType.OK){ theDir.mkdir();
    // ... user chose OK
    } else {
    // ... user chose CANCEL or closed the dialog
}
               // throw new CustomExceptions.ExcepcioCarpetaNoCreada();
               }   
                //catch(throw new ExcepcioCarpetaNoCreada();){}*/   
            if(result) {    
                System.out.println("DIR created");  
            }

}
    }

    public void vHistorialAccionsXML(String LedGrup1, String LedGrup1Count, String LedGrup2, 
            String LedGrup2Count, String Luz, String LuzCount, String Pito, String PitoCount, 
            String Boto, String BotoCount, String Servo, String ServoCount){
        
         try {
            File desktop = new File(System.getProperty("user.home"), "Desktop");
            desktop.canRead();
            desktop.canWrite();
            
            String XMLPath = desktop+"\\RaspberryXML\\HistorialAccions.xml";

            
            vCarpetaEscriptori();
            String ActuData = vActualTime();

                     
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.newDocument();
            // root element

            Element rootElement = doc.createElement("Estat_Actual");
            doc.appendChild(rootElement);
            
            
            //Posem la data actual.
            Element data = doc.createElement("Data");
            data.appendChild(
            doc.createTextNode(ActuData));
            rootElement.appendChild(data);

            //Superclase LED VERMELL
            Element ledgrup1 = doc.createElement("LED_Grup1");
            rootElement.appendChild(ledgrup1);


            //Elements de LED VERMELL        
            Element estatgrup1 = doc.createElement("Estat");
            estatgrup1.appendChild(
                doc.createTextNode(LedGrup1));
                ledgrup1.appendChild(estatgrup1);
            
            Element utilitzatgrup1 = doc.createElement("Vegades_utlitzat");
            utilitzatgrup1.appendChild(
                doc.createTextNode(LedGrup1Count));
                ledgrup1.appendChild(utilitzatgrup1);
                
                
            //Superclase LED VERMELL2
            Element ledgrup2 = doc.createElement("LED_Grup2");
            rootElement.appendChild(ledgrup2);


            //Elements de LED VERMELL2      
            Element estatgrup2 = doc.createElement("Estat");
            estatgrup2.appendChild(
                doc.createTextNode(LedGrup2));
                ledgrup2.appendChild(estatgrup2);
            
            Element utilitzatgrup2 = doc.createElement("Vegades_utlitzat");
            utilitzatgrup2.appendChild(
                doc.createTextNode(LedGrup2Count));
                ledgrup2.appendChild(utilitzatgrup2);

            
            //Superclase LUZ
            Element luz = doc.createElement("Luz");
            rootElement.appendChild(luz);


            //Elements de LUZ         
            Element estatluz = doc.createElement("Estat");
            estatluz.appendChild(
                doc.createTextNode(Luz));
                luz.appendChild(estatluz);
            
            Element utilitzatluz = doc.createElement("Vegades_utlitzat");
            utilitzatluz.appendChild(
                doc.createTextNode(LuzCount));
                luz.appendChild(utilitzatluz);
                
                
            //Superclase PITO
            Element pito = doc.createElement("Pito");
            rootElement.appendChild(pito);


            //Elements de PITO         
            Element estatpito = doc.createElement("Estat");
            estatpito.appendChild(
                doc.createTextNode(Pito));
                pito.appendChild(estatpito);
            
            Element utilitzatpito = doc.createElement("Vegades_utlitzat");
            utilitzatpito.appendChild(
                doc.createTextNode(PitoCount));
                pito.appendChild(utilitzatpito);
                
            //Superclase BOTO
            Element boto = doc.createElement("Boto");
            rootElement.appendChild(boto);


            //Elements de ESTAT BOTO        
            Element estatboto = doc.createElement("Estat");
            estatboto.appendChild(
                doc.createTextNode(Boto));
                boto.appendChild(estatboto);
            
            Element utilitzatboto = doc.createElement("Vegades_utlitzat");
            utilitzatboto.appendChild(
                doc.createTextNode(BotoCount));
                boto.appendChild(utilitzatboto);
                
                
            //Superclase SERVO
            Element servo = doc.createElement("Servo");
            rootElement.appendChild(servo);


            //Elements de SERVO         
            Element estatservo = doc.createElement("Estat");
            estatservo.appendChild(
                doc.createTextNode(Servo));
                servo.appendChild(estatservo);
            
            Element utilitzatservo = doc.createElement("Vegades_utlitzat");
            utilitzatservo.appendChild(
                doc.createTextNode(ServoCount));
                servo.appendChild(utilitzatservo);


            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(XMLPath));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(source, result);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
    
    
}

