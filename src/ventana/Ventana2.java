package ventana;

import java.awt.*;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class Ventana2 extends JFrame{
	public Ventana2() {
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 700);

		this.setTitle("Boton");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setMinimumSize(new Dimension(300, 300));
		this.loadComponents();
		repaint();

	}
	
	public void loadComponents() {
		boton();
	}
	
	public void boton() {
		Random rand = new Random();
		
		JButton boton = new JButton("Puchame!");
		boton.setBounds(225, 500, 200, 90);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int valorX = rand.nextInt(650);
				int valorY = rand.nextInt(650);
				int valorW = rand.nextInt(200);
				int valorH = rand.nextInt(200);
				
				int valorR = rand.nextInt(255);
				int valorG = rand.nextInt(255);
				int valorB = rand.nextInt(255);
				
				JButton btn = new JButton(""+valorR+valorG+valorB);
				btn.setBounds(valorX, valorY, valorW, valorH);
				btn.setBackground(new Color(valorR, valorG, valorB));
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() != null) {
						JOptionPane.showMessageDialog(null, btn.getText());	
						}
						
					}
					
				});
				add(btn);
				btn.updateUI();
				
			}
			
		});
		getContentPane().add(boton);
		
		JPanel fondo = new JPanel();
		fondo.setBounds(0, 0, 700, 700);
		fondo.setBackground(Color.GREEN);
		add(fondo);
	}
	
}
