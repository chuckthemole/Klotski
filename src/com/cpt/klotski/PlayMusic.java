package com.cpt.klotski;

//import java.io.FileInputStream;
import java.io.File;
//import java.io.InputStream;

//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

/**
 * Audio file formats: AIFF, AU and WAV
 * 
 * @author chuck
 *
 */
public class PlayMusic {
	//private static InputStream music;
	//private static AudioStream audio;
	private static Media hit;
	private static MediaPlayer mediaPlayer;
	private static Media slide = new Media(new File("Music\\slide.MP3").toURI().toString());
	private static MediaPlayer mp = new MediaPlayer(slide);
	
	public static void playMusic(String filePath) {
		try {
			//String file = "song3.mp3";
			hit = new Media(new File(filePath).toURI().toString());
			mediaPlayer = new MediaPlayer(hit);
			mediaPlayer.play();
			
			//music = new FileInputStream(new File(filePath));
			//audio = new AudioStream(music);
			//AudioPlayer.player.start(audio);
			System.out.println("Playing Music...");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error playing music!");
		}
	}
	
	public static void stop() {
		try {
		//AudioPlayer.player.stop(audio);
		mediaPlayer.stop();
		System.out.println("Music Stopped....");
	
		}
		catch(Exception e) {
			//JOptionPane.showMessageDialog(null, "Can't Stop Music");
		}	
	}
	
	public static void play() {
		try {
		//AudioPlayer.player.start(audio);
		mediaPlayer.play();
		System.out.println("Music Started....");
	
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Can't Stop Music");
		}
	}
	
	public static void playSlide() {
		mp.play();
	}
	
	public static void stopSlide() {
		mp.stop();
	}
}
