package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Memorama extends JFrame {
	private JFrame frame;
	int tablero[][] = new int[2][4];
	int tablero2[][] = new int[2][4];
	JButton matriz[][];
	int contador = 0;
	int bX, aX, bY, aY;
	int puntos=0;
	Random rand = new Random();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama window = new Memorama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Memorama() {
		initialize();
		numerosAleatorios();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 694, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Puntos: "+puntos);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);

		

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(2, 4, 0, 0));

		// botones

		matriz = new JButton[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = new JButton();
				matriz[i][j].setIcon(new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\ascacascacas.png"));
				matriz[i][j].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						for (int k = 0; k < 2; k++) {
							for (int l = 0; l < 4; l++) {

								if (e.getSource() == matriz[k][l]) {
									if (tablero2[k][l] == 0 && contador != 2) {
										tablero2[k][l] = tablero[k][l]; 
										contador++;
										aX = k;
										aY = l;
										girar(matriz[k][l], aX, aY);

										if (contador == 1) {
											bX = k;
											bY = l;
											girar(matriz[k][l], bX, bY);
											
										}

										if (contador == 2) {
											if (tablero2[aX][aY] == tablero2[bX][bY]) {
												JOptionPane.showMessageDialog(null, "Es par, +1 punto");
												puntos++;
												lblNewLabel.setText("Puntos: "+puntos);
												contador=0;
											} else {
												JOptionPane.showMessageDialog(null, "No es par, lo siento");
												regresar(matriz[aX][aY], matriz[bX][bY]);
												contador=0;
											}
										}

									}
								}
							}
						}

					}

				});
				panel_2.add(matriz[i][j]);
				panel.repaint();
				lblNewLabel.repaint();
			}
		}
		
		JButton btnNewButton_8 = new JButton("Reinicio");
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 4; j++) {
						regresar(matriz[i][j]);
						puntos = 0;
						lblNewLabel.setText("Puntos: "+puntos);
					}
				}
			}

		});
		panel_1.add(btnNewButton_8);
	}
	
	
	
	public void girar(JButton btn, int x, int y) {
		btn.setIcon(new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\"+tablero2[x][y]+".png"));
		btn.setEnabled(false);
	}
	
	public void regresar(JButton btn, JButton btn2) {
		btn.setIcon(new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\ascacascacas.png"));
		btn2.setIcon(new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\ascacascacas.png"));
		btn.setEnabled(true);
		btn2.setEnabled(true);
		
	}
	public void regresar(JButton btn) {
		btn.setIcon(new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\ascacascacas.png"));
		btn.setEnabled(true);
	}

	public void numerosAleatorios() {
		int contador = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				tablero[i][j] = 0;
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				tablero[i][j] = rand.nextInt(4) + 1;

				do {
					contador = 0;
					for (int k = 0; k < 2; k++) {
						for (int l = 0; l < 4; l++) {
							if (tablero[i][j] == tablero[k][l]) {
								contador += 1;
							}
						}
					}

					if (contador == 3) {
						tablero[i][j] = rand.nextInt(4) + 1;
					}
				} while (contador == 3);

			}
		}

	}

}
