package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Gui extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem1, menuItem2, menuItem3;

	public Gui() {
		getContentPane().setBackground(new Color(255, 255, 255));
		// this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setSize(1000, 700);
		// this.setSize(313, 550);
		// this.setSize(700,525);
		this.setSize(510, 410);

		// this.setTitle("Bienvenido");
		// this.setTitle("Calculadora");
		//this.setTitle("User Login");
		this.setTitle("Calculadora de intereses");
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setMinimumSize(new Dimension(300, 300));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(10, 39, 474, 141);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(127, 107, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(237, 107, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setBounds(10, 208, 474, 141);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 14, 46, 14);
		getContentPane().add(lblNewLabel);
		this.loadComponents();
		repaint();

	}

	public void loadComponents() {
		//this.calculadora_layout();
		// this.login_2();
		// this.login();
		// this.register();
		// this.MenuVentana();
		// this.admin();
		// this.calculator();
		this.calculadoraIntereses();
	}

	public void login() {

		JTextField texto = new JTextField();
		texto.setBounds(142, 160, 202, 30);
		getContentPane().add(texto);

		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(142, 230, 202, 30);
		getContentPane().add(contrasena);

		JLabel title = new JLabel("Ingrese su usuario:");
		title.setFont(new Font("Arial", Font.BOLD, 13));
		title.setBounds(182, -5, 300, 300);
		getContentPane().add(title);

		JLabel title1 = new JLabel("Ingrese la contrasena:");
		title1.setFont(new Font("Arial", Font.BOLD, 13));
		title1.setBounds(172, 66, 300, 300);
		getContentPane().add(title1);

		JLabel welcome = new JLabel("Bienvenido/da Usuario");
		welcome.setFont(new Font("Arial", Font.BOLD, 20));
		welcome.setBounds(135, -85, 300, 300);
		getContentPane().add(welcome);

		JButton login_btn = new JButton("Continuar");
		login_btn.setBounds(153, 280, 180, 30);
		getContentPane().add(login_btn);

		/*
		 * JLabel imagen = new JLabel(new
		 * ImageIcon(getClass().getResource("elpepe.png"))); imagen.setBounds(0, 0, 600,
		 * 300); add(imagen);
		 */

		JPanel login = new JPanel();
		login.setSize(this.getWidth()/* / 2 */, this.getHeight());
		login.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(login);
		repaint();
	}

	public void register() {

		JTextField ingresarNombre = new JTextField();
		ingresarNombre.setBounds(530, 135, 300, 30);
		getContentPane().add(ingresarNombre);

		JTextField contra = new JTextField();
		contra.setBounds(530, 210, 300, 30);
		getContentPane().add(contra);

		JLabel tituloRegistro = new JLabel("Registrate");
		tituloRegistro.setFont(new Font("Namecat", Font.BOLD, 40));
		tituloRegistro.setBounds(630, -85, 300, 300);
		getContentPane().add(tituloRegistro);

		JLabel ingresarContra = new JLabel("Ingrese su contrasena:");
		ingresarContra.setFont(new Font("Namecat", Font.ITALIC, 13));
		ingresarContra.setBounds(530, 45, 300, 300);
		getContentPane().add(ingresarContra);

		JLabel ingresarUsuario = new JLabel("Ingrese su nombre de usuario:");
		ingresarUsuario.setFont(new Font("Namecat", Font.ITALIC, 13));
		ingresarUsuario.setBounds(530, -30, 300, 300);
		getContentPane().add(ingresarUsuario);

		JLabel ingresarSexo = new JLabel("Seleccione su sexo:");
		ingresarSexo.setFont(new Font("Namecat", Font.ITALIC, 13));
		ingresarSexo.setBounds(530, 125, 300, 300);
		getContentPane().add(ingresarSexo);

		JLabel direccion = new JLabel("Direccion de domicilio:");
		direccion.setFont(new Font("Namecat", Font.ITALIC, 13));
		direccion.setBounds(530, 215, 300, 300);
		getContentPane().add(direccion);

		JLabel txt_pais = new JLabel("Pais de domicilio:");
		txt_pais.setFont(new Font("Namecat", Font.ITALIC, 13));
		txt_pais.setBounds(530, 260, 300, 300);
		getContentPane().add(txt_pais);

		JButton confirm_btn = new JButton("Confirmar");
		confirm_btn.setBounds(550, 580, 180, 30);
		getContentPane().add(confirm_btn);

		JButton cancel_btn = new JButton("Cancelar");
		cancel_btn.setBounds(750, 580, 180, 30);
		getContentPane().add(cancel_btn);

		String Pais[] = { "Mexico", "Estados Unidos", "Canada", "Colombia", "Venezuela" };

		JComboBox caja = new JComboBox(Pais);
		caja.setBounds(650, 400, 150, 20);
		getContentPane().add(caja);

		JRadioButton tipoM = new JRadioButton("Masculino");
		tipoM.setBounds(530, 285, 100, 30);
		tipoM.setFont(new Font("Namecat", Font.ITALIC, 13));
		tipoM.setOpaque(false);
		getContentPane().add(tipoM);

		JRadioButton tipoF = new JRadioButton("Femenino");
		tipoF.setBounds(620, 285, 100, 30);
		tipoF.setFont(new Font("Namecat", Font.ITALIC, 13));
		tipoF.setOpaque(false);
		getContentPane().add(tipoF);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(tipoM);
		grupo.add(tipoF);

		JPanel registro = new JPanel();
		registro.setSize(this.getWidth(), this.getHeight());
		registro.setLocation(this.getWidth() / 2, 0);
		registro.setBackground(Color.decode("#FAFFA8"));
		getContentPane().add(registro);
		repaint();

	}

	public void MenuVentana() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu = new JMenu("Opciones");

		menuItem1 = new JMenuItem("Configuracion");
		menu.add(menuItem1);

		menuItem2 = new JMenuItem("Ayuda");
		menu.add(menuItem2);

		menuItem3 = new JMenuItem("Visualizacion");
		menu.add(menuItem3);

		menuBar.add(menu);
	}

	public void admin() {
		JLabel texto_Usuario = new JLabel("Usuarios", 0);
		texto_Usuario.setFont(new Font("Namecat", Font.BOLD, 40));
		texto_Usuario.setBounds(350, 0, 300, 100);
		getContentPane().add(texto_Usuario);

		JLabel cuadro = new JLabel("Usuarios disponibles: 26", 0);
		cuadro.setFont(new Font("Namecat", Font.BOLD, 20));
		cuadro.setBounds(100, 100, 300, 100);
		cuadro.setOpaque(true);
		getContentPane().add(cuadro);

		JPanel admin = new JPanel();
		admin.setSize(this.getWidth(), this.getHeight());
		admin.setBackground(Color.decode("#C8FFA8"));
		getContentPane().add(admin);

		String titles[] = { "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" };
		String data[][] = { { "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" },
				{ "No. Control", "Apellidos", "Nombres", "Correo electronico", "CURP" } };

		JTable tabla = new JTable(data, titles);

		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(100, 250, 800, 300);
		getContentPane().add(scroll);
	}

	public void calculator() {

		// 1er fila

		JButton btn_C = new JButton("C");
		btn_C.setBackground(Color.black);
		btn_C.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn_C.setForeground(Color.decode("#D60000"));
		btn_C.setBounds(10, 160, 60, 60);
		getContentPane().add(btn_C);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn7.setBounds(10, 230, 60, 60);
		btn7.setBackground(Color.black);
		btn7.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn4.setBounds(10, 300, 60, 60);
		btn4.setBackground(Color.black);
		btn4.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn1.setBounds(10, 370, 60, 60);
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn1);

		JButton btn_PlusMinus = new JButton("+/-");
		btn_PlusMinus.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn_PlusMinus.setBounds(10, 440, 60, 60);
		btn_PlusMinus.setBackground(Color.black);
		btn_PlusMinus.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn_PlusMinus);

		// 2da fila

		JButton btn_CE = new JButton("CE");
		btn_CE.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btn_CE.setBounds(82, 160, 60, 60);
		btn_CE.setBackground(Color.black);
		btn_CE.setForeground(Color.decode("#8B83FF"));
		getContentPane().add(btn_CE);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn8.setBounds(82, 230, 60, 60);
		btn8.setBackground(Color.black);
		btn8.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn5.setBounds(82, 300, 60, 60);
		btn5.setBackground(Color.black);
		btn5.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn2.setBounds(82, 370, 60, 60);
		btn2.setBackground(Color.black);
		btn2.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn0.setBounds(82, 440, 60, 60);
		btn0.setBackground(Color.black);
		btn0.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn0);

		// 3er fila

		JButton btn_parent = new JButton("( )");
		btn_parent.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btn_parent.setBounds(154, 160, 60, 60);
		btn_parent.setBackground(Color.black);
		btn_parent.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn_parent);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btn9.setBounds(154, 230, 60, 60);
		btn9.setBackground(Color.black);
		btn9.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn6.setBounds(154, 300, 60, 60);
		btn6.setBackground(Color.black);
		btn6.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btn3.setBounds(154, 370, 60, 60);
		btn3.setBackground(Color.black);
		btn3.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btn3);

		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Lemon Milk", Font.BOLD, 20));
		btnDot.setBounds(154, 440, 60, 60);
		btnDot.setBackground(Color.black);
		btnDot.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btnDot);

		// 4ta fila

		JButton btnMod = new JButton("%");
		btnMod.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btnMod.setBounds(226, 160, 60, 60);
		btnMod.setBackground(Color.black);
		btnMod.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btnMod);

		JButton btndiv = new JButton("÷");
		btndiv.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btndiv.setBounds(226, 230, 60, 60);
		btndiv.setBackground(Color.black);
		btndiv.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btndiv);

		JButton btnMulti = new JButton("x");
		btnMulti.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btnMulti.setBounds(226, 300, 60, 60);
		btnMulti.setBackground(Color.black);
		btnMulti.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btnMulti);

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Lemon Milk", Font.BOLD, 18));
		btnPlus.setBounds(226, 370, 60, 60);
		btnPlus.setBackground(Color.black);
		btnPlus.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btnPlus);

		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Lemon Milk", Font.BOLD, 30));
		btnMinus.setBounds(226, 440, 60, 60);
		btnMinus.setBackground(Color.black);
		btnMinus.setForeground(Color.decode("#7FFFE8"));
		getContentPane().add(btnMinus);

		JLabel operation = new JLabel("2 + 2 = 3", 0);
		operation.setBounds(125, 55, 170, 120);
		operation.setFont(new Font("Lemon Milk", Font.BOLD, 30));
		operation.setForeground(Color.decode("#006565"));
		getContentPane().add(operation);

		JPanel screen = new JPanel();
		screen.setBounds(10, 15, 276, 129);
		screen.setBackground(Color.decode("#B0FF8E"));
		getContentPane().add(screen);

		JPanel fondo = new JPanel();
		fondo.setSize(this.getWidth(), this.getHeight());
		fondo.setBackground(Color.BLACK);
		getContentPane().add(fondo);
	}

	public void login_2() {
		JLabel youreNew = new JLabel("Don't have a account?", 0);
		youreNew.setBounds(200, 406, 280, 35);
		youreNew.setForeground(Color.white);
		youreNew.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		getContentPane().add(youreNew);

		JButton loginB = new JButton("Login");
		loginB.setBounds(265, 339, 150, 50);
		loginB.setBackground(Color.decode("#DCCA8A"));
		loginB.setFont(new Font("Segoe UI Black", Font.ITALIC, 13));
		getContentPane().add(loginB);

		JButton signUpB = new JButton("Sign Up");
		signUpB.setBounds(290, 438, 100, 42);
		signUpB.setBackground(Color.decode("#DCCA8A"));
		signUpB.setFont(new Font("Segoe UI Black", Font.ITALIC, 13));
		getContentPane().add(signUpB);

		JLabel person = new JLabel(new ImageIcon(getClass().getResource("person.png")));
		person.setBounds(170, 210, 25, 25);
		person.setBackground(Color.decode("#DCCA8A"));
		person.setOpaque(true);
		getContentPane().add(person);

		JLabel lock = new JLabel(new ImageIcon(getClass().getResource("lock.png")));
		lock.setBounds(170, 295, 25, 25);
		lock.setBackground(Color.decode("#DCCA8A"));
		lock.setOpaque(true);
		getContentPane().add(lock);

		JLabel password = new JLabel("Enter Your Password", 0);
		password.setBounds(125, 260, 280, 35);
		password.setForeground(Color.white);
		password.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		getContentPane().add(password);

		JLabel userName = new JLabel("Enter Your Username", 0);
		userName.setBounds(125, 175, 280, 35);
		userName.setForeground(Color.white);
		userName.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		getContentPane().add(userName);

		JTextField userName_txt = new JTextField();
		userName_txt.setBounds(200, 205, 280, 35);
		getContentPane().add(userName_txt);

		JPasswordField pwr = new JPasswordField();
		pwr.setBounds(200, 290, 280, 35);
		getContentPane().add(pwr);

		JLabel userLogin = new JLabel("User Login", 0);
		userLogin.setForeground(Color.white);
		userLogin.setFont(new Font("Segoe UI Black", Font.ITALIC, 30));
		userLogin.setBounds(190, 18, 300, 50);
		getContentPane().add(userLogin);

		JLabel myAccount = new JLabel("My Account", 0);
		myAccount.setForeground(Color.decode("#DCCA8A"));
		myAccount.setFont(new Font("Segoe UI Black", Font.ITALIC, 40));
		myAccount.setBounds(190, 108, 300, 50);
		getContentPane().add(myAccount);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#3556A0"));
		panel.setBounds(90, 90, 500, 315);
		getContentPane().add(panel);

		JPanel fondo = new JPanel();
		fondo.setBackground(Color.decode("#3E64AE"));
		fondo.setSize(this.getWidth(), this.getHeight());
		getContentPane().add(fondo);

		repaint();
	}

	public void calculadora_layout() {

		JPanel calcu = new JPanel();
		calcu.setBackground(Color.black);
		calcu.setLayout(new BorderLayout());
		calcu.setBounds(0, 0, this.getWidth(), this.getHeight());

		JLabel input = new JLabel("2+2");
		input.setFont(new Font("Segoe UI Black", Font.ITALIC, 50));
		input.setOpaque(true);
		calcu.add(input, BorderLayout.NORTH);

		JPanel botones = new JPanel();
		//botones.setBackground(Color.red);
		botones.setLayout(new GridLayout(4, 3));
		calcu.add(botones, BorderLayout.CENTER);

		String btn_texts[] = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "." };

		for (int i = 0; i < btn_texts.length; i++) {
			botones.add(new JButton(btn_texts[i]));
		}

		JPanel actions = new JPanel();
		actions.setLayout(new GridLayout(6, 1));
		//actions.setBackground(Color.green);
		calcu.add(actions, BorderLayout.EAST);

		String actions_texts[] = { "+", "-", "*", "/", "=", "CE"};

		for (int i = 0; i < actions_texts.length; i++) {
			actions.add(new JButton(actions_texts[i]));
		}

		getContentPane().add(calcu);
		repaint();
	}
	
	public void calculadoraIntereses() {
		
	}
}
