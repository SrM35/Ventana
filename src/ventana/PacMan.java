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
	int x = 250;
	int y = 275;
	
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
		            g.fillRoundRect(x, y, 35, 35, 50, 50);
		            
		        }
		};
		panel_4.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		
		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Minecraft", Font.PLAIN, 14));
		btnStart.setBackground(Color.YELLOW);
		btnStart.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == 'd') {
					x+=2;
					panel_4.repaint();
				} else if(e.getKeyChar() == 'w') {
					y-=2;
					panel_4.repaint();
				} else if(e.getKeyChar() == 'a') {
					x-=2;
					panel_4.repaint();
				} else if(e.getKeyChar() == 's') {
					y+=2;
					panel_4.repaint();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
			
		});
		panel_3.add(btnStart);
		
		JButton btnNewButton = new JButton("Restart");
		btnNewButton.setFont(new Font("Minecraft", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				x = 250;
				y = 275;
				panel_4.repaint();
			}

		});
		panel_3.add(btnNewButton);
	}
	
	
}
