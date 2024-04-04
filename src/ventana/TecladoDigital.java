package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TecladoDigital extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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
		initialize();
		repaint();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("[Palabra]");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Borrar");
		
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_30 = new JButton("Espacio");
		panel_2.add(btnNewButton_30);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.GRAY);
		panel_1.add(panel_1_1, BorderLayout.CENTER);
		panel_1_1.setLayout(new GridLayout(3, 10, 0, 0));
		
		JButton btnNewButton_1_1 = new JButton("Q");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					btnNewButton_1_1.setBackground(Color.red);
					btnNewButton_1_1.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					btnNewButton_1_1.setBackground(Color.white);
					btnNewButton_1_1.repaint();
				}
			}
			
		});
		panel_1_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("W");
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					btnNewButton_1_2.setBackground(Color.red);
					btnNewButton_1_2.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					btnNewButton_1_2.setBackground(Color.white);
					btnNewButton_1_2.repaint();
				}
			}
			
		});
		panel_1_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("E");
		btnNewButton_1_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					btnNewButton_1_3.setBackground(Color.red);
					btnNewButton_1_3.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					btnNewButton_1_3.setBackground(Color.white);
					btnNewButton_1_3.repaint();
				}
			}
			
		});
		panel_1_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("R");
		btnNewButton_1_4.setBackground(new Color(255, 255, 255));
		btnNewButton_1_4.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					btnNewButton_1_4.setBackground(Color.red);
					btnNewButton_1_4.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					btnNewButton_1_4.setBackground(Color.white);
					btnNewButton_1_4.repaint();
				}
			}
			
		});
		panel_1_1.add(btnNewButton_1_4);
		
		JButton btnNewButton_1 = new JButton("T");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					btnNewButton_1.setBackground(Color.red);
					btnNewButton_1.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					btnNewButton_1.setBackground(Color.white);
					btnNewButton_1.repaint();
				}
			}
			
		});
		panel_1_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_6 = new JButton("Y");
		btnNewButton_1_6.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_5 = new JButton("U");
		btnNewButton_1_5.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_7 = new JButton("I");
		btnNewButton_1_7.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_9 = new JButton("O");
		btnNewButton_1_9.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_8 = new JButton("P");
		btnNewButton_1_8.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_10 = new JButton("A");
		btnNewButton_1_10.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_18 = new JButton("S");
		btnNewButton_1_18.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_18);
		
		JButton btnNewButton_1_12 = new JButton("D");
		btnNewButton_1_12.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_11 = new JButton("F");
		btnNewButton_1_11.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_13 = new JButton("G");
		btnNewButton_1_13.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_15 = new JButton("H");
		btnNewButton_1_15.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_15);
		
		JButton btnNewButton_1_24 = new JButton("J");
		btnNewButton_1_24.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_24);
		
		JButton btnNewButton_1_14 = new JButton("K");
		btnNewButton_1_14.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_14);
		
		JButton btnNewButton_1_16 = new JButton("L");
		btnNewButton_1_16.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_16);
		
		JButton btnNewButton_1_17 = new JButton("Ñ");
		btnNewButton_1_17.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_17);
		
		JButton btnNewButton_1_19 = new JButton("Z");
		btnNewButton_1_19.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_19);
		
		JButton btnNewButton_1_21 = new JButton("X");
		btnNewButton_1_21.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_21);
		
		JButton btnNewButton_1_20 = new JButton("C");
		btnNewButton_1_20.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_20);
		
		JButton btnNewButton_1_22 = new JButton("V");
		btnNewButton_1_22.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_22);
		
		JButton btnNewButton_1_23 = new JButton("B");
		btnNewButton_1_23.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_23);
		
		JButton btnNewButton_1_25 = new JButton("N");
		btnNewButton_1_25.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_25);
		
		JButton btnNewButton_1_26 = new JButton("M");
		btnNewButton_1_26.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_26);
		
		JButton btnNewButton_1_27 = new JButton(", / ;");
		btnNewButton_1_27.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_27);
		
		JButton btnNewButton_1_28 = new JButton(". / :");
		btnNewButton_1_28.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_28);
		
		JButton btnNewButton_1_29 = new JButton("- / _");
		btnNewButton_1_29.setBackground(new Color(255, 255, 255));
		panel_1_1.add(btnNewButton_1_29);
	}
}
