/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalClass;

import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Clase Interna.
 * Esta clase sirve para reproducir un sonido cada vez que pulsamos una tecla
 * 
*/
public class OuterClass {
    private class Inner{
        
        public void play(){
            /**Metodo para reproducuir el sonido*/
        System.out.println("Audio clase interna");
        
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(OuterClass.class.getResource("/sound4.wav"));
            clip.open(inputStream);
            clip.start();
 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
        
        }
   }
   //Accessing he inner class from the method within
    public void cridarInner(){
        /**Llamada a la clase interna*/
      Inner inner = new Inner();
      inner.play();
   }
}

