package ventana2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.FileReader;
import java.util.Iterator;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class BotonJson {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonJson window = new BotonJson();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BotonJson() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("Leer JSON");
		btnNewButton.setBounds(150, 102, 144, 57);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				JSONParser jose = new JSONParser();
				
				try {
					
					Object obj = jose.parse(new FileReader("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana2\\usuario.JSON"));
					JSONObject jsonObject = (JSONObject) obj;
					System.out.println("JSON Leido: " + jsonObject);
					
					JOptionPane.showMessageDialog(null, "Nombre: "+jsonObject.get("Nombre") +"\nApellido: "+jsonObject.get("Apellido")+"\nNacionalidad: "+jsonObject.get("Nacionalidad")+"\nEdad: "+jsonObject.get("Edad"));
				}catch(FileNotFoundException e){
					
				}catch(IOException e){
					
				}catch(ParseException e){
					
				}
				
				
			}
			
		});
		frame.getContentPane().add(btnNewButton);
	}
}
