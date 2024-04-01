package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class EvaluacionUnidad2 {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField textField_1;
	private JTextField txtJhonDoe;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvaluacionUnidad2 window = new EvaluacionUnidad2();
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
	public EvaluacionUnidad2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 443, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 102, 153));
		panel.add(panel_1_1, BorderLayout.NORTH);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(0, 102, 153));
		panel.add(panel_1_1_1, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 102, 153));
		panel.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblsinBaseDe = new JLabel("[Sin Base de datos]");
		lblsinBaseDe.setForeground(Color.WHITE);
		lblsinBaseDe.setFont(new Font("Book Antiqua", Font.BOLD, 10));
		panel_3.add(lblsinBaseDe);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(new Color(0, 102, 153));
		panel_3.add(panel_1_1_1_1, BorderLayout.WEST);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBackground(new Color(0, 102, 153));
		panel_3.add(panel_1_1_1_1_1, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_4.setBounds(10, 11, 407, 82);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(10, 0, 99, 14);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setBounds(20, 26, 70, 14);
		panel_4.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setBounds(100, 23, 86, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Dirección:");
		lblNewLabel_2_1.setBounds(20, 54, 70, 14);
		panel_4.add(lblNewLabel_2_1);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setColumns(10);
		txtCalle.setBounds(100, 51, 86, 20);
		panel_4.add(txtCalle);
		
		textField_1 = new JTextField();
		textField_1.setText("5554433");
		textField_1.setColumns(10);
		textField_1.setBounds(297, 51, 86, 20);
		panel_4.add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Teléfono:");
		lblNewLabel_2_1_1.setBounds(217, 54, 70, 14);
		panel_4.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres:");
		lblNewLabel_2_2.setBounds(217, 26, 70, 14);
		panel_4.add(lblNewLabel_2_2);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setColumns(10);
		txtJhonDoe.setBounds(297, 23, 86, 20);
		panel_4.add(txtJhonDoe);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(10, 104, 407, 68);
		panel_2.add(panel_4_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Datos de factura");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(10, 0, 97, 14);
		panel_4_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("N°Factura:");
		lblNewLabel_2_3.setBounds(10, 31, 70, 14);
		panel_4_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("1");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3_1.setBounds(83, 31, 70, 14);
		panel_4_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Fecha:");
		lblNewLabel_2_3_2.setBounds(227, 31, 70, 14);
		panel_4_1.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("2021/50/21");
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_3_1_1.setBounds(300, 31, 70, 14);
		panel_4_1.add(lblNewLabel_2_3_1_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_4_1_1.setBackground(Color.WHITE);
		panel_4_1_1.setBounds(10, 183, 404, 128);
		panel_2.add(panel_4_1_1);
		
		String titles[] = { "Producto", "Cantidad", "Valor", "Subtotal" };
		String data[][] = { { "Agua", "2", "500", "1000.00"},
							{ "Cereal", "5", "1000", "5000.00"},
							{ "Leche", "2", "300", "600.00"}};
		
		JTable tabla = new JTable(data, titles);
		
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(0, 35, 404, 93);
		panel_4_1_1.add(scroll);
		
		ImageIcon icono = new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\menu.png");
		
		JButton button = new JButton("Ver listado de facturas", icono);
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBorderPainted(false);
		button.setBackground(Color.white);
		button.setBounds(6, 6, 170, 23);
		panel_4_1_1.add(button);
		
		ImageIcon icono2 = new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\mas.png");
		
		JButton btnAadir = new JButton("Añadir", icono2);
		btnAadir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAadir.setBorderPainted(false);
		btnAadir.setBackground(Color.WHITE);
		btnAadir.setBounds(186, 6, 108, 23);
		panel_4_1_1.add(btnAadir);
		
		ImageIcon icono3 = new ImageIcon("C:\\Users\\inghe\\eclipse-workspace\\Ventana\\src\\ventana\\eliminar.png");
		
		JButton btnEliminar = new JButton("Eliminar", icono3);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setBounds(286, 6, 108, 23);
		panel_4_1_1.add(btnEliminar);
		
		textField_2 = new JTextField();
		textField_2.setText("5");
		textField_2.setColumns(10);
		textField_2.setBounds(112, 342, 38, 20);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("% Descuento:");
		lblNewLabel_2_4.setBounds(20, 345, 89, 14);
		panel_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Subtotal:");
		lblNewLabel_2_4_1.setBounds(20, 324, 89, 14);
		panel_2.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("6600.0");
		lblNewLabel_2_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4_1_1.setBounds(112, 324, 89, 14);
		panel_2.add(lblNewLabel_2_4_1_1);
		
		JLabel lblNewLabel_2_4_1_1_1 = new JLabel("1254.0");
		lblNewLabel_2_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4_1_1_1.setBounds(112, 367, 89, 14);
		panel_2.add(lblNewLabel_2_4_1_1_1);
		
		JLabel lblNewLabel_2_4_1_2 = new JLabel("IVA 19%:");
		lblNewLabel_2_4_1_2.setBounds(20, 367, 89, 14);
		panel_2.add(lblNewLabel_2_4_1_2);
		
		JLabel lblNewLabel_2_4_1_1_1_1 = new JLabel("7524.0");
		lblNewLabel_2_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4_1_1_1_1.setBounds(112, 387, 89, 14);
		panel_2.add(lblNewLabel_2_4_1_1_1_1);
		
		JLabel lblNewLabel_2_4_1_2_1 = new JLabel("Subtotal:");
		lblNewLabel_2_4_1_2_1.setBounds(20, 387, 89, 14);
		panel_2.add(lblNewLabel_2_4_1_2_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("     Valor descontado:");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(161, 341, 162, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2_4_1_1_2 = new JLabel("330.0");
		lblNewLabel_2_4_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4_1_1_2.setBounds(308, 345, 89, 14);
		panel_2.add(lblNewLabel_2_4_1_1_2);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(206, 410, 127, 20);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La factura se ha realizado con éxito!", "Información", 1);
				
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLimpiar.setBounds(343, 410, 74, 20);
		panel_2.add(btnLimpiar);
	}
}
