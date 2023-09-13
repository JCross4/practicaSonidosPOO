package gui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
	private JTextArea textArea;
	private JButton button1; private JButton button2; private JButton button3; private JButton button4; private JButton button5; private JButton button6;
	
	public GUI() {
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
    }
	
	public void crearVentana() {
		SwingUtilities.invokeLater(() -> {
			GUI frame = new GUI();
	        frame.setVisible(true);
	    });
	}
	
	public void decirAccion(String hora, String accion) {
		textArea.append("\n" + hora + " " + accion);
	}

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
		
	}
}