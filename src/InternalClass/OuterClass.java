/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalClass;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Roger
 */
public class OuterClass {
    private class Inner{
        
        public void print(){	   
        System.out.println("Hola, soc una clase interna :)");
        
        try {
        Clip clip = AudioSystem.getClip();
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
        OuterClass.class.getResourceAsStream("@resources/sound4.mp3"));
        clip.open(inputStream);
        clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
        
        }
   }
   //Accessing he inner class from the method within
    public void cridarInner(){
      Inner inner = new Inner();
      inner.print();
   }
}

