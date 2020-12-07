package com.rochdi.oop;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;



public class Dog {
	
	public String name;

	public Dog(String name) {
		this.name = name;	
	}
	

	public void aboyer(String path) {
		System.out.println(this.name + " dit wwaaaarf !");
		try {
			File soundPath = new File(path);
			if (soundPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
//				clip.loop(Clip.LOOP_CONTINUOUSLY);
				JOptionPane.showMessageDialog(null,"Press OK to stop the sound");
				System.out.println("audio played");
			}else {
				System.out.println("Can't find the file");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void manger() {
		System.out.println("Je mange de la viande");
	}
	
	public void aboyer2(String sens) {
		
		if (sens.equalsIgnoreCase("mad")) {
			System.out.println("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! ");
		}
		else if (sens.equalsIgnoreCase("cool")) {
			System.out.println("Je ne suis pas du tout en colère. Iwiw !! awaw !! ");
		}
	}
	
	public void manger2(String qlqc) {
		System.out.println("Je mange "+qlqc);
	}
	
	
	
}
