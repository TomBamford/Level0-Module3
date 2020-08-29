
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How many shiny objects do you want");
		Integer.parseInt(input);
		int num = Integer.parseInt(input);
		for(int i = 0; i < num; i++) {
			playMisterZee();
		}
		
	
		// 1. Call the method below to play the sound
		// 2. Ask the user how many shiny objects they want
		// 3. Play the sound that many times



	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public static void playMisterZee() {
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
