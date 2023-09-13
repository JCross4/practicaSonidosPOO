package control;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import gui.GUI;
import reproduccion.Reproductor;


public class Controlador {
	String filePath1; String filePath2; String filePath3; String filePath4; String filePath5; String filePath6;
	
	public Controlador(String pfilePath1, String pfilePath2, String pfilePath3, String pfilePath4, String pfilePath5, String pfilePath6) {
		filePath1 = pfilePath1; filePath2 = pfilePath2; filePath3 = pfilePath3; filePath4 = pfilePath4; filePath5 = pfilePath5; filePath6 = pfilePath6;
		GUI frame = new GUI();
		frame.setVisible(true);
		try {
			Reproductor rep1 = new Reproductor(filePath1);
			Reproductor rep2 = new Reproductor(filePath2);
			Reproductor rep3 = new Reproductor(filePath3);
			Reproductor rep4 = new Reproductor(filePath4);
			Reproductor rep5 = new Reproductor(filePath5);
			Reproductor rep6 = new Reproductor(filePath6);
			rep1.play();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
	try {
		Controlador control = new Controlador("C:\\Users\\23jic\\eclipse-workspace\\gui\\src\\sunflower-street-drumloop-85bpm-163900.aiff", "C:\\Users\\23jic\\eclipse-workspace\\gui\\src\\sunflower-street-drumloop-85bpm-163900.aiff", "C:\\Users\\23jic\\eclipse-workspace\\gui\\src\\sunflower-street-drumloop-85bpm-163900.aiff", "C:\\Users\\23jic\\eclipse-workspace\\gui\\src\\sunflower-street-drumloop-85bpm-163900.aiff", "C:\\Users\\23jic\\eclipse-workspace\\gui\\src\\sunflower-street-drumloop-85bpm-163900.aiff", "C:\\Users\\23jic\\eclipse-workspace\\gui\\src\\sunflower-street-drumloop-85bpm-163900.aiff");
	}
	catch(Exception ex)
	{
		System.out.println("Error reproduciendo el sonido");
		ex.printStackTrace();
	}
		
	}
}
