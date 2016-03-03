/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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


