package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Login_Registro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Registro window = new Login_Registro();
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
	public Login_Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.registro(frame);
	}
	
	private void login(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión:");
		lblNewLabel.setForeground(new Color(255, 255, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(106, 11, 198, 58);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 128));
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(185, 172, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(39, 175, 135, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(39, 218, 135, 14);
		panel.add(lblNewLabel_1_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 128));
		passwordField.setBackground(new Color(0, 0, 128));
		passwordField.setBounds(185, 215, 145, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setBounds(39, 358, 177, 23);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
			
		});
		panel.add(btnNewButton);
		
		JButton btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.setBackground(new Color(255, 255, 128));
		btnCrearCuenta.setBounds(226, 358, 177, 23);
		btnCrearCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panel);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
				registro(frame);
			}
			
		});
		panel.add(btnCrearCuenta);
	}
	
	private void registro(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de usuario:");
		lblNewLabel.setForeground(new Color(255, 255, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 232, 32);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 128));
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(193, 139, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setBounds(80, 142, 95, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_1.setBounds(114, 183, 68, 14);
		panel.add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirmar contraseña: ");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_1_1.setBounds(71, 211, 111, 14);
		panel.add(lblNewLabel_1_1_1);
		
		
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 128));
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setColumns(10);
		textField_1.setBounds(193, 180, 145, 20);
		String contrasena = textField_1.getText();
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 128));
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setColumns(10);
		textField_2.setBounds(193, 208, 145, 20);
		String confirmarContrasena = textField_2.getText();
		panel.add(textField_2);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(255, 255, 128));
		btnCancelar.setBounds(210, 358, 128, 23);
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panel);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
				login(frame);
			}
			
		});
		panel.add(btnCancelar);
		
		JLabel lblNewLabel_1_3 = new JLabel("Apellidos:");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setBounds(80, 114, 95, 14);
		panel.add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(255, 255, 128));
		textField_4.setBackground(new Color(0, 0, 128));
		textField_4.setColumns(10);
		textField_4.setBounds(193, 111, 145, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Nombres:");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setBounds(80, 86, 95, 14);
		panel.add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(255, 255, 128));
		textField_5.setBackground(new Color(0, 0, 128));
		textField_5.setColumns(10);
		textField_5.setBounds(193, 83, 145, 20);
		panel.add(textField_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBackground(new Color(255, 255, 128));
		chckbxNewCheckBox.setBounds(71, 290, 267, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setBounds(72, 358, 128, 23);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (confirmarContrasena.equals(contrasena) && chckbxNewCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(null, "Success");
				}else {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
				
			}
			
		});
		panel.add(btnNewButton);
	}
}
