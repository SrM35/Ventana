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
		//registro();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.login(frame);
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
		textField.setBounds(185, 102, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(39, 105, 135, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(39, 148, 135, 14);
		panel.add(lblNewLabel_1_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(185, 145, 145, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setBounds(39, 204, 177, 23);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
			
		});
		panel.add(btnNewButton);
		
		JButton btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.setBackground(new Color(255, 255, 128));
		btnCrearCuenta.setBounds(226, 204, 177, 23);
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
		
		JLabel lblNewLabel = new JLabel("Registro:");
		lblNewLabel.setForeground(new Color(255, 255, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 0, 188, 40);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(185, 96, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electronico: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setBounds(72, 99, 95, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_1.setBounds(106, 140, 68, 14);
		panel.add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirmar contraseña: ");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_1_1.setBounds(63, 168, 111, 14);
		panel.add(lblNewLabel_1_1_1);
		
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(185, 137, 145, 20);
		String contrasena = textField_1.getText();
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(185, 165, 145, 20);
		String confirmarContrasena = textField_2.getText();
		panel.add(textField_2);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(255, 255, 128));
		btnCancelar.setBounds(230, 227, 89, 23);
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
		lblNewLabel_1_3.setBounds(72, 71, 95, 14);
		panel.add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(185, 68, 145, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Nombres:");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 128));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setBounds(72, 43, 95, 14);
		panel.add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(185, 40, 145, 20);
		panel.add(textField_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 128));
		chckbxNewCheckBox.setBounds(133, 197, 186, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setBounds(131, 227, 89, 23);
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
