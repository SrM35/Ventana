package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class PacMan {

	private JFrame frame;
	
	int puntos = 0;
	
	//Paredes
	Obstaculo obstaculo = new Obstaculo(10, 10, 10, 210);
	Obstaculo obstaculoAbajo = new Obstaculo(10, 300, 10, 200);
	Obstaculo obstaculo2 = new Obstaculo(10, 10, 544, 10);
	Obstaculo obstaculo3 = new Obstaculo(545, 10, 10, 210);
	Obstaculo obstaculo3Abajo = new Obstaculo(545, 300, 10, 200);
	Obstaculo obstaculo4 = new Obstaculo(10, 494, 545, 10);
	
	Obstaculo obstaculo5 = new Obstaculo(80, 80, 10, 80);
	Obstaculo obstaculo6 = new Obstaculo(80, 80, 80, 10);
	Obstaculo obstaculo7 = new Obstaculo(400, 80, 80, 10);
	Obstaculo obstaculo8 = new Obstaculo(470, 80, 10, 80);
	
	Obstaculo obstaculo9 = new Obstaculo(80, 220, 10, 80);
	Obstaculo obstaculo10 = new Obstaculo(470, 220, 10, 80);
	
	//Jugador
	Player jugador = new Player(270, 240, 35, 35);
	Pastilla pastilla = new Pastilla(270, 45, 15, 15);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacMan window = new PacMan();
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
	public PacMan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		
		
		
		
		JPanel panel_4 = new JPanel() {
			@Override
		        public void paintComponent(Graphics g) {
		            super.paintComponent(g);
		            g.setColor(Color.yellow);
		            g.fillRoundRect(jugador.x, jugador.y,jugador.a, jugador.l, 50, 50);
		            
		            g.setColor(new Color(170, 255, 0));
		            g.fillRoundRect(pastilla.x, pastilla.y, pastilla.a, pastilla.l, 50, 50);
		         
		            
		            g.setColor(new Color(5,0,153));
		            g.fillRect(obstaculo.x, obstaculo.y, obstaculo.a, obstaculo.l);
		            g.fillRect(obstaculoAbajo.x, obstaculoAbajo.y, obstaculoAbajo.a, obstaculoAbajo.l);
		            g.fillRect(obstaculo2.x, obstaculo2.y, obstaculo2.a, obstaculo2.l);
		            g.fillRect(obstaculo3.x, obstaculo3.y, obstaculo3.a, obstaculo3.l);
		            g.fillRect(obstaculo3Abajo.x, obstaculo3Abajo.y, obstaculo3Abajo.a, obstaculo3Abajo.l);
		            g.fillRect(obstaculo4.x, obstaculo4.y, obstaculo4.a, obstaculo4.l);
		            g.fillRect(obstaculo5.x, obstaculo5.y, obstaculo5.a, obstaculo5.l);
		            g.fillRect(obstaculo6.x, obstaculo6.y, obstaculo6.a, obstaculo6.l);
		            g.fillRect(obstaculo7.x, obstaculo7.y, obstaculo7.a, obstaculo7.l);
		            g.fillRect(obstaculo8.x, obstaculo8.y, obstaculo8.a, obstaculo8.l);
		            g.fillRect(obstaculo9.x, obstaculo9.y, obstaculo9.a, obstaculo9.l);
		            g.fillRect(obstaculo10.x, obstaculo10.y, obstaculo10.a, obstaculo10.l);
		            
		        }
		};
		panel_4.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		
		JButton btnStart = new JButton("Restart");
		btnStart.setFont(new Font("Minecraft", Font.PLAIN, 14));
		btnStart.setBackground(Color.YELLOW);
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jugador.x = 270;
				jugador.y = 240;
				puntos = 0;
				panel_4.repaint();
			}

		});
		btnStart.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'd') {
					jugador.x+=10;
					
					if(jugador.x >= 515 && jugador.y <= 210) {
						jugador.x-=10;
					}
					
					if (jugador.x >= 515 && jugador.y >= 270) {
						jugador.x-=10;
					}
					
					if (jugador.x == 600) {
						jugador.x = -50;
					}
					
					
					panel_4.repaint();
				} else if(e.getKeyChar() == 'w') {
					jugador.y-=10;
					
					if(jugador.y <= 19) {
						jugador.y+=10;
					}
					if(jugador.x >= 515 && jugador.y <= 210) {
						jugador.y+=10;
					}
					if(jugador.x <= 10 && jugador.y <= 210) {
						jugador.y+=10;
					}
					
					panel_4.repaint();
				} else if(e.getKeyChar() == 'a') {
					jugador.x-=10;
					
					if(jugador.x <= 19 && jugador.y <= 210) {
						jugador.x+=10;
					}
					
					if(jugador.x <= 19 && jugador.y >= 270) {
						jugador.x+=10;
					}
					
					if (jugador.x == -50) {
						jugador.x = 600;
					}
					
					panel_4.repaint();
				} else if(e.getKeyChar() == 's') {
					jugador.y+=10;
					
					if(jugador.y >= 461) {
						jugador.y-=10;
					}
					
					if(jugador.x <= 10 && jugador.y >= 270) {
						jugador.y-=10;
					}
					
					panel_4.repaint();
				}
				
				if (pastilla.x == jugador.x && pastilla.y+pastilla.l == jugador.y ) {
					puntos++;
					System.out.println(puntos);
				}
				
				System.out.println(jugador.getX()+" " + jugador.getY());
			}

			@Override
			public void keyReleased(KeyEvent e) {

				
			}
			
		});
		
		panel_3.add(btnStart);
		
	}
	
	
}
