/**
 * Esta clse clase cuenta con dos excepciones que se usan en el XMLWritter en caso de que la carpets no exista.
 *
 */
package Exceptions;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 *
 * @author Roger
 */
public class CustomExceptions// extends Exception
{
 //   public CustomExceptions(){}


 protected class ExcepcioCarpetaNoCreada extends Exception {

     public ExcepcioCarpetaNoCreada() {
     }
	String missatge = "La carpeta no ha estat creada correctament";
       
	public String getMessage() {
		return missatge;
	}}

protected class ExcepcioCarpetaSensePermisos  extends Exception{
	String missatge = "No tens permisos per guardar les dades en la carpeta";

	public String getMessage() {
		return missatge;
	}}


}


