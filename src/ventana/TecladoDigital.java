package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class TecladoDigital extends JFrame{

	private JFrame frame;
	private JTextField textField;
	Random random = new Random();
	Timer tiempo;
	int segundos = 0;
	int milisegundos = 0;
	
	int indiceAleatorio = random.nextInt(listaPalabras.length);
	
	JLabel lblNewLabel_1 = new JLabel("0.0");
	
	private void cronometro() {
		tiempo = new Timer(10, (ActionEvent e) ->{
			actualizarTiempo();
			actualizarLabel();
		});
	}
	
	private void actualizarTiempo() {
		milisegundos++;
		
		if(milisegundos == 100) {
			milisegundos = 0;
			segundos++;
		}
	}
	
	private void actualizarLabel() {
		String cronometro = segundos+"."+milisegundos;
		lblNewLabel_1.setText(cronometro);
	}
	
	String[] palabras = new String[100];
	private static String[] listaPalabras = {
	        "Hola", "Mundo", "Java", "Programacion", "Computadora",
	        "Tecnologia", "Internet", "Software", "Hardware", "Aplicacion",
	        "Base de datos", "Algoritmo", "Estructura de datos", "Inteligencia artificial",
	        "Aprendizaje automatico", "Ciencia de datos", "Desarrollo web", "Diseño grafico",
	        "Videojuegos", "Musica", "Arte", "Cultura", "Historia", "Geografia",
	        "Matematicas", "Supercalifragilisticoespiralidoso", "Quimica", "Biologia", "Medicina",
	        "Economia", "Politica", "Sociologia", "Psicologia", "Filosofia",
	        "Literatura", "Picafresa", "Teatro", "Cine", "Television",
	        "Deportes", "Juegos", "Pasatiempos", "Viajes", "Aventura",
	        "Naturaleza", "Animales", "Plantas", "Comida", "Bebida",
	        "Moda", "Belleza", "Salud", "Bienestar", "Hogar",
	        "Chirimolla", "Amigos", "Amor", "Relaciones", "Felicidad"
	    };
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TecladoDigital window = new TecladoDigital();
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
	public TecladoDigital() {
		reglas();
		initialize();
		repaint();
		cronometro();
	}

	
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 757, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.BLACK);
		panel_3.add(panel_6_2, BorderLayout.NORTH);
		
		JPanel panel_6_3 = new JPanel();
		panel_6_3.setBackground(Color.BLACK);
		panel_3.add(panel_6_3, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setBorderPainted(true);
		btnNewButton.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton.setBackground(Color.BLACK);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_30 = new JButton("Espacio");
		btnNewButton_30.setForeground(new Color(0, 255, 0));
		btnNewButton_30.setBorderPainted(true);
		btnNewButton_30.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_30.setBackground(Color.BLACK);
		panel_2.add(btnNewButton_30);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_5, BorderLayout.EAST);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_1_1, BorderLayout.CENTER);
		panel_1_1.setLayout(new GridLayout(3, 10, 0, 0));
		
		JButton btnNewButton_1_1 = new JButton("Q");
		btnNewButton_1_1.setForeground(new Color(0, 255, 0));
		btnNewButton_1_1.setBorderPainted(true);
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_1.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("W");
		btnNewButton_1_2.setForeground(new Color(0, 255, 0));
		btnNewButton_1_2.setBorderPainted(true);
		btnNewButton_1_2.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_2.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("E");
		btnNewButton_1_3.setForeground(new Color(0, 255, 0));
		btnNewButton_1_3.setBorderPainted(true);
		btnNewButton_1_3.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_3.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("R");
		btnNewButton_1_4.setForeground(new Color(0, 255, 0));
		btnNewButton_1_4.setBorderPainted(true);
		btnNewButton_1_4.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_4.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_4);
		
		JButton btnNewButton_1 = new JButton("T");
		btnNewButton_1.setForeground(new Color(0, 255, 0));
		btnNewButton_1.setBorderPainted(true);
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_6 = new JButton("Y");
		btnNewButton_1_6.setForeground(new Color(0, 255, 0));
		btnNewButton_1_6.setBorderPainted(true);
		btnNewButton_1_6.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_6.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_5 = new JButton("U");
		btnNewButton_1_5.setForeground(new Color(0, 255, 0));
		btnNewButton_1_5.setBorderPainted(true);
		btnNewButton_1_5.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_5.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_7 = new JButton("I");
		btnNewButton_1_7.setForeground(new Color(0, 255, 0));
		btnNewButton_1_7.setBorderPainted(true);
		btnNewButton_1_7.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_7.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_9 = new JButton("O");
		btnNewButton_1_9.setForeground(new Color(0, 255, 0));
		btnNewButton_1_9.setBorderPainted(true);
		btnNewButton_1_9.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_9.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_8 = new JButton("P");
		btnNewButton_1_8.setForeground(new Color(0, 255, 0));
		btnNewButton_1_8.setBorderPainted(true);
		btnNewButton_1_8.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_8.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_10 = new JButton("A");
		btnNewButton_1_10.setForeground(new Color(0, 255, 0));
		btnNewButton_1_10.setBorderPainted(true);
		btnNewButton_1_10.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_10.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_18 = new JButton("S");
		btnNewButton_1_18.setForeground(new Color(0, 255, 0));
		btnNewButton_1_18.setBorderPainted(true);
		btnNewButton_1_18.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_18.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_18);
		
		JButton btnNewButton_1_12 = new JButton("D");
		btnNewButton_1_12.setForeground(new Color(0, 255, 0));
		btnNewButton_1_12.setBorderPainted(true);
		btnNewButton_1_12.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_12.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_11 = new JButton("F");
		btnNewButton_1_11.setForeground(new Color(0, 255, 0));
		btnNewButton_1_11.setBorderPainted(true);
		btnNewButton_1_11.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_11.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_13 = new JButton("G");
		btnNewButton_1_13.setForeground(new Color(0, 255, 0));
		btnNewButton_1_13.setBorderPainted(true);
		btnNewButton_1_13.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_13.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_15 = new JButton("H");
		btnNewButton_1_15.setForeground(new Color(0, 255, 0));
		btnNewButton_1_15.setBorderPainted(true);
		btnNewButton_1_15.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_15.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_15);
		
		JButton btnNewButton_1_24 = new JButton("J");
		btnNewButton_1_24.setForeground(new Color(0, 255, 0));
		btnNewButton_1_24.setBorderPainted(true);
		btnNewButton_1_24.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_24.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_24);
		
		JButton btnNewButton_1_14 = new JButton("K");
		btnNewButton_1_14.setForeground(new Color(0, 255, 0));
		btnNewButton_1_14.setBorderPainted(true);
		btnNewButton_1_14.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_14.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_14);
		
		JButton btnNewButton_1_16 = new JButton("L");
		btnNewButton_1_16.setForeground(new Color(0, 255, 0));
		btnNewButton_1_16.setBorderPainted(true);
		btnNewButton_1_16.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_16.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_16);
		
		JButton btnNewButton_1_17 = new JButton("Ñ");
		btnNewButton_1_17.setForeground(new Color(0, 255, 0));
		btnNewButton_1_17.setBorderPainted(true);
		btnNewButton_1_17.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_17.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_17);
		
		JButton btnNewButton_1_19 = new JButton("Z");
		btnNewButton_1_19.setForeground(new Color(0, 255, 0));
		btnNewButton_1_19.setBorderPainted(true);
		btnNewButton_1_19.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_19.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_19);
		
		JButton btnNewButton_1_21 = new JButton("X");
		btnNewButton_1_21.setForeground(new Color(0, 255, 0));
		btnNewButton_1_21.setBorderPainted(true);
		btnNewButton_1_21.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_21.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_21);
		
		JButton btnNewButton_1_20 = new JButton("C");
		btnNewButton_1_20.setForeground(new Color(0, 255, 0));
		btnNewButton_1_20.setBorderPainted(true);
		btnNewButton_1_20.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_20.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_20);
		
		JButton btnNewButton_1_22 = new JButton("V");
		btnNewButton_1_22.setForeground(new Color(0, 255, 0));
		btnNewButton_1_22.setBorderPainted(true);
		btnNewButton_1_22.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_22.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_22);
		
		JButton btnNewButton_1_23 = new JButton("B");
		btnNewButton_1_23.setForeground(new Color(0, 255, 0));
		btnNewButton_1_23.setBorderPainted(true);
		btnNewButton_1_23.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_23.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_23);
		
		JButton btnNewButton_1_25 = new JButton("N");
		btnNewButton_1_25.setForeground(new Color(0, 255, 0));
		btnNewButton_1_25.setBorderPainted(true);
		btnNewButton_1_25.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_25.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_25);
		
		JButton btnNewButton_1_26 = new JButton("M");
		btnNewButton_1_26.setForeground(new Color(0, 255, 0));
		btnNewButton_1_26.setBorderPainted(true);
		btnNewButton_1_26.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_26.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_26);
		
		JButton btnNewButton_1_27 = new JButton(", / ;");
		btnNewButton_1_27.setForeground(new Color(0, 255, 0));
		btnNewButton_1_27.setBorderPainted(true);
		btnNewButton_1_27.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_27.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_27);
		
		JButton btnNewButton_1_28 = new JButton(". / :");
		btnNewButton_1_28.setForeground(new Color(0, 255, 0));
		btnNewButton_1_28.setBorderPainted(true);
		btnNewButton_1_28.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_28.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_28);
		
		JButton btnNewButton_1_29 = new JButton("- / _");
		btnNewButton_1_29.setForeground(new Color(0, 255, 0));
		btnNewButton_1_29.setBorderPainted(true);
		btnNewButton_1_29.setBorder(new LineBorder(new Color(0, 255, 0)));
		btnNewButton_1_29.setBackground(Color.BLACK);
		panel_1_1.add(btnNewButton_1_29);
		
		for(int i = 0; i < palabras.length; i++) {
			indiceAleatorio = random.nextInt(listaPalabras.length);
            palabras[i] = listaPalabras[indiceAleatorio];
		}
		
		JLabel lblNewLabel = new JLabel("Escribe : " + palabras[indiceAleatorio]);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		panel_3.add(lblNewLabel);
		
		JTextField textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(0, 255, 0));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setOpaque(false);
		textField_1.setBorder(new LineBorder(new Color(0, 255, 0)));
		textField_1.setColumns(10);
		textField_1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					btnNewButton.setBackground(Color.green);
					String texto = textField_1.getText();
					String textoNew = texto.substring(0, texto.length()-1);
					textField_1.setText(textoNew);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == KeyEvent.VK_SPACE) {
					btnNewButton_30.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+" ");
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					btnNewButton_1_1.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					btnNewButton_1_2.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					btnNewButton_1_3.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					btnNewButton_1_4.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					btnNewButton_1.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'y' || e.getKeyChar() == 'Y') {
					btnNewButton_1_6.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
					btnNewButton_1_5.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
					btnNewButton_1_7.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
					btnNewButton_1_9.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
					btnNewButton_1_8.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				//---------------------------------------------------------------------------------------
				//---------------------------------------------------------------------------------------
				//---------------------------------------------------------------------------------------
				
				else if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					btnNewButton_1_10.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					btnNewButton_1_18.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					btnNewButton_1_12.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'f' || e.getKeyChar() == 'F') {
					btnNewButton_1_11.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'g' || e.getKeyChar() == 'G') {
					btnNewButton_1_13.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
					btnNewButton_1_15.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'j' || e.getKeyChar() == 'J') {
					btnNewButton_1_24.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
					btnNewButton_1_14.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
					btnNewButton_1_16.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'ñ' || e.getKeyChar() == 'Ñ') {
					btnNewButton_1_17.setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				//---------------------------------------------------------------------------------------
				//---------------------------------------------------------------------------------------
				//---------------------------------------------------------------------------------------
				
				else if(e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
					btnNewButton_1_19 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
					btnNewButton_1_21 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					btnNewButton_1_20 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'v' || e.getKeyChar() == 'V') {
					btnNewButton_1_22 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					btnNewButton_1_23 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
					btnNewButton_1_25 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
					btnNewButton_1_26 .setBackground(Color.green);
					String texto = textField_1.getText();
					textField_1.setText(texto+e.getKeyChar());
					textField_1.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					btnNewButton.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == KeyEvent.VK_SPACE) {
					btnNewButton_30.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					btnNewButton_1_1.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					btnNewButton_1_2.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					btnNewButton_1_3.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					btnNewButton_1_4.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					btnNewButton_1.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'y' || e.getKeyChar() == 'Y') {
					btnNewButton_1_6.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
					btnNewButton_1_5.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
					btnNewButton_1_7.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
					btnNewButton_1_9.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
					btnNewButton_1_8.setBackground(Color.black);
					textField_1.repaint();
				}
				
				//---------------------------------------------------------------------------
				//---------------------------------------------------------------------------
				//---------------------------------------------------------------------------
				
				else if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					btnNewButton_1_10 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					btnNewButton_1_18 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					btnNewButton_1_12 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'f' || e.getKeyChar() == 'F') {
					btnNewButton_1_11 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'g' || e.getKeyChar() == 'G') {
					btnNewButton_1_13 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
					btnNewButton_1_15.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'j' || e.getKeyChar() == 'J') {
					btnNewButton_1_24.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
					btnNewButton_1_14.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
					btnNewButton_1_16.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'ñ' || e.getKeyChar() == 'Ñ') {
					btnNewButton_1_17.setBackground(Color.black);
					textField_1.repaint();
				}
				
				//---------------------------------------------------------------------------------------
				//---------------------------------------------------------------------------------------
				//---------------------------------------------------------------------------------------
				
				else if(e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
					btnNewButton_1_19.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
					btnNewButton_1_21 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					btnNewButton_1_20.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'v' || e.getKeyChar() == 'V') {
					btnNewButton_1_22.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					btnNewButton_1_23 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
					btnNewButton_1_25.setBackground(Color.black);
					textField_1.repaint();
				}
				
				else if(e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
					btnNewButton_1_26 .setBackground(Color.black);
					textField_1.repaint();
				}
				
				String textoExtraido = textField_1.getText();
				String palabra = palabras[indiceAleatorio];
				
				if(palabra.length() == textoExtraido.length() && palabra.equals(textoExtraido)) {
					tiempo.stop();
					JOptionPane.showMessageDialog(null, "Correcto, muy bien"+"\n\n"+"Tiempo: " + segundos+"."+milisegundos);
					textField_1.setText("");
					indiceAleatorio = random.nextInt(listaPalabras.length);
					lblNewLabel.setText("Palabra: "+palabras[indiceAleatorio]);
					reinicio();
					lblNewLabel.repaint();
				}
				
				tiempo.start();
			}
			
			
		});
		
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(textField_1, BorderLayout.CENTER);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		panel.add(panel_3_1, BorderLayout.NORTH);
		panel_3_1.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		panel_3_1.add(lblNewLabel_1, BorderLayout.CENTER);
		lblNewLabel_1.repaint();
		
		JPanel panel_6_4 = new JPanel();
		panel_6_4.setBackground(Color.BLACK);
		panel_3_1.add(panel_6_4, BorderLayout.SOUTH);
		
		JPanel panel_6_5 = new JPanel();
		panel_6_5.setBackground(Color.BLACK);
		panel_3_1.add(panel_6_5, BorderLayout.NORTH);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.BLACK);
		panel.add(panel_3_2, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 0, 0));
		panel.add(panel_6, BorderLayout.WEST);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.BLACK);
		panel.add(panel_6_1, BorderLayout.EAST);
	}
	
	
	public void reglas() {
		JOptionPane.showMessageDialog(null, "Instrucciones:"+"\n\n"+"1. Debes de completar las palabras que aparecen en la pantalla en el menor tiempo posible"+"\n"+"2. Tu tiempo en escribir las palabras se capturará"+"\n"+"3. Cuando aciertas una palabra, se te dará una nueva para seguir jugando"+"\n\n"+"Buena suerte!!!", "Bienvenido!!!", 1);
	}
	
	public void reinicio() {
		if(tiempo.isRunning()) {
			tiempo.stop();
		}
		
		segundos = 0;
		milisegundos = 0;
		
		actualizarLabel();
	}

}
