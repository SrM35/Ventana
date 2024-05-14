package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import modelo.Modelo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Vista extends JFrame {

	public JButton btnNewButton;
	public JTextField textField;
	public JPasswordField pwd;
	public Modelo model;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Vista() {
		this.setBounds(100, 100, 570, 538);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.login();
	}

	public void login() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 255));
		this.getContentPane().add(panel, BorderLayout.CENTER);
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

		pwd = new JPasswordField();
		pwd.setForeground(new Color(255, 255, 128));
		pwd.setHorizontalAlignment(SwingConstants.CENTER);
		pwd.setToolTipText("");
		pwd.setColumns(10);
		pwd.setBackground(new Color(64, 0, 128));
		pwd.setBounds(39, 122, 279, 20);
		panel_1.add(pwd);

		btnNewButton = new JButton("Confimar");
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

	public Modelo getUser() {
		String contrasenia = new String(pwd.getPassword());
		model = new Modelo(textField.getText(), contrasenia);
		return model;
	}

	public void mensajeBueno() {
		JOptionPane.showMessageDialog(null, "Usuario confirmado, bienvenido");
	}

	public void mensajeMalo() {
		JOptionPane.showMessageDialog(null, "Usuario no confirmado, vuelva a intentar");
	}

	public void messages(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
