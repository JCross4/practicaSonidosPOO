package reproduccion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Reproductor {
	AudioInputStream audioInputStream;
	Clip clip;
	static String filePath;
	
	public Reproductor(String filePath)
		throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		audioInputStream=AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
	}

public void play() {
	System.out.println("Play");
	clip.start();
}



}