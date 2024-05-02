package ventana;

import java.awt.*;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
		System.out.println("20");
		JPanel fondo = new JPanel();
		fondo.setBounds(0, 0, 700, 700);
		fondo.setLayout(null);
		fondo.setBackground(Color.GREEN);
		fondo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				int valorR = rand.nextInt(255);
				int valorG = rand.nextInt(255);
				int valorB = rand.nextInt(255);
				fondo.setBackground(new Color(valorR,valorG,valorB));
				repaint();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorR = rand.nextInt(255);
				int valorG = rand.nextInt(255);
				int valorB = rand.nextInt(255);
				int valorW = rand.nextInt(200);
				int valorH = rand.nextInt(200);
				
				JButton btn = new JButton(""+valorR+", "+valorG+", "+valorB);
				btn.setBounds(e.getX(), e.getY(), valorW, valorH);
				btn.setBackground(new Color(valorR, valorG, valorB));
				fondo.add(btn);
				btn.repaint();
			}
		});
		
		add(fondo);
		
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
				
				JButton btn = new JButton(""+valorR+", "+valorG+", "+valorB);
				btn.setBounds(valorX, valorY, valorW, valorH);
				btn.setBackground(new Color(valorR, valorG, valorB));
				btn.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
						fondo.remove(btn);
						fondo.repaint();
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						
					}
					
				});
				fondo.add(btn);
				btn.updateUI();
			}
			
		});
		
		KeyListener tecla = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					fondo.removeAll();
					fondo.repaint();
					
				}else if(e.getKeyChar() == 'w') {
					Component arreglo[] = fondo.getComponents();
					
					for(int i = 0; i < arreglo.length; i++) {
						if(arreglo[i].getClass().toString().equals("class javax.swing.JButton")) {
							JButton link = (JButton) arreglo[i];
							
							link.setSize(link.getWidth()+5, link.getHeight()+5);
							repaint();
							revalidate();
						}
					}
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		addKeyListener(tecla);
		
		fondo.add(boton);
	}
	
}
