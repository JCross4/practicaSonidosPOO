package gui;

import javax.swing.*;
import reproduccion.Reproductor;
import java.awt.*;

public class GUI extends JFrame {
	private JTextArea textArea;
	private JButton button1; private JButton button2; private JButton button3; private JButton button4; private JButton button5; private JButton button6;
	
	public GUI(Reproductor rep1, Reproductor rep2, Reproductor rep3, Reproductor rep4, Reproductor rep5, Reproductor rep6) {
		setTitle("Sonidos DJ");
        setSize(500, 600); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        JLabel label = new JLabel("Sonidos");
        label.setFont(new Font("Arial", Font.BOLD, 18)); // Set font and size
        label.setForeground(Color.red); // Set text color
        label.setBounds(200, 10, 100, 40);

        // Add label to the frame's content pane
        getContentPane().setLayout(null);
        getContentPane().add(label);
        
        textArea = new JTextArea();
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        Rectangle textAreaBounds = new Rectangle(50, 60, 380, 450);
        textArea.setBounds(textAreaBounds);
        textArea.setEditable(false);
        
        JButton button1 = new JButton("Sonido 1"); JButton button2 = new JButton("Sonido 2"); JButton button3 = new JButton("Sonido 3"); JButton button4 = new JButton("Sonido 4"); JButton button5 = new JButton("Sonido 5"); JButton button6 = new JButton("Sonido 6");
        button1.setBounds(100, 150, 125, 75);
        button2.setBounds(260, 150, 125, 75);
        button3.setBounds(100, 250, 125, 75);
        button4.setBounds(260, 250, 125, 75);
        button5.setBounds(100, 350, 125, 75);
        button6.setBounds(260, 350, 125, 75);
        
     // Add buttons to the frame's content pane
        getContentPane().add(button1); getContentPane().add(button2); getContentPane().add(button3); getContentPane().add(button4); getContentPane().add(button5); getContentPane().add(button6);
        
        // Add text area to the frame's content pane
        getContentPane().add(textArea);    
        
        // Set null layout
        getContentPane().setLayout(null);
        
        button1.addActionListener(e -> reproducir(rep1));
        button2.addActionListener(e -> reproducir(rep2));
        button3.addActionListener(e -> reproducir(rep3));
        button4.addActionListener(e -> reproducir(rep4));
        button5.addActionListener(e -> reproducir(rep5));
        button6.addActionListener(e -> reproducir(rep6));
    }

	
	public void reproducir(Reproductor rep) {
		rep.play();
	}

}