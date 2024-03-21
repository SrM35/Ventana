package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Memorama extends JFrame{

	public int tablero[][] = {{1,2,3,4},{1,2,3,4}};
	public int status[][] = {{1,2,3,4},{1,2,3,4}};
	
	private JFrame frame;
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
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 716, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_1.add(btnNewButton_8);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(2, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton(" ");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(0,0, btnNewButton_1);
			}
			
		});
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(1,0, btnNewButton);
				
			}
			
		});
		panel_2.add(btnNewButton);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(" ");
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(0,1, btnNewButton_2);
				
			}
			
		});
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton(" ");
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(0,2, btnNewButton_4);
				
			}
			
		});
		
		JButton btnNewButton_3 = new JButton(" ");
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(1,1, btnNewButton_3);
				
			}
			
		});
		panel_2.add(btnNewButton_3);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton(" ");
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(0,3, btnNewButton_6);
				
			}
			
		});
		
		JButton btnNewButton_5 = new JButton(" ");
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(1,2, btnNewButton_5);
				
			}
			
		});
		panel_2.add(btnNewButton_5);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(" ");
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girar(1,3, btnNewButton_7);
				
			}
			
		});
		panel_2.add(btnNewButton_7);
		
	}
	public void girar(int x, int y, JButton btn) {
		status[x][y] = 1;
		btn.setEnabled(false);
		int tarjetas=0;
		
		for(int i = 0; i <2; i++) {
			for(int j = 0; j <4; j++) {
				if(status[i][j] == 1) {
					tarjetas++;
				}
			}
		}
		System.out.println(tarjetas);
		
		if(tarjetas==2) {
			System.out.println("verificar pares");
			int a=0;
			int b=0;
			
			for(int i = 0; i <2; i++) {
				for(int j = 0; j <4; j++) {
					if(status[i][j] == 1) {
						if(a == 0) {
							a = tablero[i][j];
						}else if(b == 0) {
							b = tablero[i][j];
						}
					}
				}
			}
			
			if(a == b && a!=0) {
				System.out.println("pares");
				
				for(int i = 0; i <2; i++) {
					for(int j = 0; j <4; j++) {
						
						if(status[i][j] == 1) {
							status[i][j] = 2;
						}
					}
				}
			} else {
				System.out.println("no pares");
				
				for(int i = 0; i <2; i++) {
					for(int j = 0; j <4; j++) {
						
						if(status[i][j] == 1) {
							status[i][j] = 0;
						}
					}
				}
				
			}
		}
	}

}
