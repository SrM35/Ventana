package ventana;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Blala extends JFrame{

	private JFrame frame;
	Random random = new Random();
	int indiceAleatorio = random.nextInt(listaPalabras.length);
	
	String[] palabras = new String[100];
	private static String[] listaPalabras = {
	        "Hola", "Mundo", "Java", "Programacion", "Computadora",
	        "Tecnologia", "Internet", "Software", "Hardware", "Aplicacion",
	        "Base de datos", "Algoritmo", "Estructura de datos", "Inteligencia artificial",
	        "Aprendizaje automatico", "Ciencia de datos", "Desarrollo web", "Diseño grafico",
	        "Videojuegos", "Musica", "Arte", "Cultura", "Historia", "Geografia",
	        "Matematicas", "Fisica", "Quimica", "Biologia", "Medicina",
	        "Economia", "Politica", "Sociologia", "Psicologia", "Filosofia",
	        "Literatura", "Poesia", "Teatro", "Cine", "Television",
	        "Deportes", "Juegos", "Pasatiempos", "Viajes", "Aventura",
	        "Naturaleza", "Animales", "Plantas", "Comida", "Bebida",
	        "Moda", "Belleza", "Salud", "Bienestar", "Hogar",
	        "Familia", "Amigos", "Amor", "Relaciones", "Felicidad"
	    };
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blala window = new Blala();
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
	public Blala() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(129, 58, 164, 126);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		for(int i = 0; i < palabras.length; i++) {
			indiceAleatorio = random.nextInt(listaPalabras.length);
            palabras[i] = listaPalabras[indiceAleatorio];
            System.out.println(palabras[i]);
		}
		
		JLabel lblNewLabel = new JLabel("Palabra: " + palabras[indiceAleatorio]);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(165, 210, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiceAleatorio = random.nextInt(listaPalabras.length);
				lblNewLabel.setText("Palabra: "+palabras[indiceAleatorio]);
			}
		});
		frame.getContentPane().add(btnNewButton);
	}
}
