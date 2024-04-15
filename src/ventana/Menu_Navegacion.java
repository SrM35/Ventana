package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;

public class Menu_Navegacion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Navegacion window = new Menu_Navegacion();
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
	public Menu_Navegacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Cuenta");

		JMenuItem menuItem1 = new JMenuItem("Iniciar sesion");
		menuItem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
				login(frame);
				
			}
			
		});
		menu.add(menuItem1);

		JMenuItem menuItem2 = new JMenuItem("Registro");
		menuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
				registro(frame);
				
			}
			
		});
		menu.add(menuItem2);

		JMenuItem menuItem3 = new JMenuItem("Recuperacion de cuenta");
		menuItem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
				recuperar(frame);
				
			}
			
		});
		menu.add(menuItem3);
		
		menuBar.add(menu);
		
		//-------------------------------------------------------------------
		//-------------------------------------------------------------------
		
		JMenu menu2 = new JMenu("Usuarios");
		
		JMenuItem menuItem1_2 = new JMenuItem("Alta");
		menu2.add(menuItem1_2);
		
		JMenuItem menuItem2_2 = new JMenuItem("Baja");
		menu2.add(menuItem2_2);
		
		JMenuItem menuItem3_2 = new JMenuItem("Consultar");
		menu2.add(menuItem3_2);
		
		menuBar.add(menu2);
		
		//-------------------------------------------------------------------
		//-------------------------------------------------------------------
		
		JMenu menu3 = new JMenu("Ayuda");
		
		JMenuItem menuItem1_3 = new JMenuItem("¿Como crear un usuario?");
		menuItem1_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "1. Dirijete a la pestaña \"Cuenta\""+"\n"+"2. Selecciona la opcion \"Registro\""+"\n"+"3. Llena los espacios con los datos corresponientes"+"\n"+"4. Cuando hayas terminado de escribir tus datos, presiona en \"Terminar\"", "¿Como crear un usuario?", 1, null);
				
			}
			
		});
		menu3.add(menuItem1_3);
		
		JMenuItem menuItem2_3 = new JMenuItem("¿Como acceder al sistema?");
		menuItem2_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Para ingresar al sistema, se debe iniciar sesión con una cuenta existente."+"\n\n"+"1. Dirijete a la pestaña \"cuenta\""+"\n"+"2. Selecciona la opcion \"Registro\", si ya cuentas con una cuenta, selecciona \"Iniciar sesión\""+"\n"+"(Si no cuentas con una cuenta, dirigete a \"Ayuda\" y \"¿Como crear un usuario?\")", "¿Como acceder al sistema?", 1, null);
				
			}
			
		});
		menu3.add(menuItem2_3);
		
		JMenuItem menuItem3_3 = new JMenuItem("¿Que pasa si olvide mi contraseña?");
		menuItem3_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "No pasa nada, es una situación muy común."+"\n\n"+"1. Dirijete a la pestaña de \"Cuenta\""+"\n"+"2. Selecciona la opción \"Recuperación de cuenta\""+"\n"+"3. Escribe el correo electronico asociado a tu cuenta"+"\n\n"+"Luego de un rato, se te enviará un correo con las instrucciones que debes seguir para recuperar tu cuenta", "¿Que pasa si olvide mi contraseña?", 1, null);
				
			}
			
		});
		menu3.add(menuItem3_3);
		
		menuBar.add(menu3);
		
		this.login(frame);
	}
	
	private void login(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 0, 128));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(97, 136, 356, 236);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 128));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(64, 0, 128));
		textField.setBounds(39, 53, 279, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(39, 28, 279, 25);
		lblNewLabel_1.setOpaque(true);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1_1.setBounds(39, 97, 279, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setForeground(new Color(255, 255, 128));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(64, 0, 128));
		textField_1.setBounds(39, 122, 279, 20);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Confimar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBounds(118, 181, 116, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setBounds(176, 43, 199, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(128, 0, 128));
		lblNewLabel.setOpaque(true);
	}
	
	private void registro(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 0, 128));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(41, 81, 468, 396);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 128));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBackground(new Color(64, 0, 128));
		textField.setBounds(242, 145, 216, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 144, 222, 25);
		lblNewLabel_1.setOpaque(true);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1_1.setBounds(10, 206, 222, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setForeground(new Color(255, 255, 128));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(64, 0, 128));
		textField_1.setBounds(242, 206, 216, 25);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Terminar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBounds(88, 362, 116, 23);
		panel_1.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.YELLOW);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.setBackground(new Color(128, 0, 128));
		btnCancelar.setBounds(279, 363, 116, 23);
		panel_1.add(btnCancelar);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setForeground(new Color(255, 255, 128));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(64, 0, 128));
		textField_2.setBounds(242, 109, 216, 25);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellido(s):");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.YELLOW);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBackground(new Color(128, 0, 128));
		lblNewLabel_1_2.setBounds(10, 108, 222, 25);
		panel_1.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setForeground(new Color(255, 255, 128));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(64, 0, 128));
		textField_3.setBounds(242, 73, 216, 25);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nombre(s):");
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.YELLOW);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBackground(new Color(128, 0, 128));
		lblNewLabel_1_3.setBounds(10, 72, 222, 25);
		panel_1.add(lblNewLabel_1_3);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setForeground(new Color(255, 255, 128));
		passwordField.setColumns(10);
		passwordField.setBackground(new Color(64, 0, 128));
		passwordField.setBounds(242, 242, 216, 25);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirmar contraseña:");
		lblNewLabel_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.YELLOW);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1_1_1.setBounds(10, 242, 222, 25);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setBounds(178, 25, 199, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(128, 0, 128));
		lblNewLabel.setOpaque(true);
	}
	
	private void recuperar(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 0, 128));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(97, 136, 356, 236);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 128));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(64, 0, 128));
		textField.setBounds(39, 150, 279, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(39, 126, 279, 25);
		lblNewLabel_1.setOpaque(true);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Confimar y recuperar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBounds(81, 202, 194, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Para realizar la recuperacion de cuenta debes de");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setBounds(25, 39, 279, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ingresar el correo electronico asociado a la cuenta ");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(Color.YELLOW);
		lblNewLabel_2_1.setBounds(25, 52, 307, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("que deseas recuperar.");
		lblNewLabel_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(Color.YELLOW);
		lblNewLabel_2_1_1.setBounds(25, 64, 279, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel = new JLabel("Recuperación de cuenta");
		lblNewLabel.setBounds(133, 43, 278, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(128, 0, 128));
		lblNewLabel.setOpaque(true);
	}
}
