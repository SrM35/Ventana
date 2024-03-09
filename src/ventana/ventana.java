package ventana;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class ventana extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem1, menuItem2, menuItem3;
	private JTextField txtJuanCarlos;
	private JTextField txtArcila;
	private JTextField txtDiaz;

	public ventana() {
		// this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setSize(1000, 700);
		// this.setSize(313, 550);
		// this.setSize(700,525);
		// this.setSize(510, 410);
		this.setSize(1200, 700);

		// this.setTitle("Bienvenido");
		// this.setTitle("Calculadora");
		// this.setTitle("User Login");
		this.setTitle("Casa");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setMinimumSize(new Dimension(300, 300));
		this.loadComponents();
		repaint();

	}

	public void loadComponents() {
		// this.calculadora_layout();
		// this.login_2();
		// this.login();
		// this.register();
		// this.MenuVentana();
		// this.admin();
		// this.calculator();
		// this.calculadoraIntereses();
		// this.registroUsuario();
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
		// botones.setBackground(Color.red);
		botones.setLayout(new GridLayout(4, 3));
		calcu.add(botones, BorderLayout.CENTER);

		String btn_texts[] = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "." };

		for (int i = 0; i < btn_texts.length; i++) {
			botones.add(new JButton(btn_texts[i]));
		}

		JPanel actions = new JPanel();
		actions.setLayout(new GridLayout(6, 1));
		// actions.setBackground(Color.green);
		calcu.add(actions, BorderLayout.EAST);

		String actions_texts[] = { "+", "-", "*", "/", "=", "CE" };

		for (int i = 0; i < actions_texts.length; i++) {
			actions.add(new JButton(actions_texts[i]));
		}

		getContentPane().add(calcu);
		repaint();
	}

	public void calculadoraIntereses() {
		JPanel calcu = new JPanel();
		calcu.setLayout(new BorderLayout());
		getContentPane().add(calcu);

		JLabel nose = new JLabel("        ");
		nose.setOpaque(true);
		nose.setBackground(Color.white);
		calcu.add(nose, BorderLayout.EAST);

		JLabel nose2 = new JLabel("       ");
		nose2.setOpaque(true);
		nose2.setBackground(Color.white);
		calcu.add(nose2, BorderLayout.WEST);

		JLabel nose3 = new JLabel("  Interes");
		nose3.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
		nose3.setForeground(Color.RED);
		nose3.setOpaque(true);
		nose3.setBackground(Color.white);
		calcu.add(nose3, BorderLayout.NORTH);

		JPanel nose4 = new JPanel();
		nose4.setBackground(Color.white);
		calcu.add(nose4, BorderLayout.SOUTH);

		JPanel centro = new JPanel();
		centro.setLayout(null);
		centro.setBackground(new Color(131, 255, 113));
		calcu.add(centro, BorderLayout.CENTER);

		JLabel capital = new JLabel("Capital:");
		capital.setFont(new Font("Tahoma", Font.ITALIC, 20));
		capital.setBounds(140, 35, 200, 20);
		centro.add(capital);

		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setFont(new Font("Tahoma", Font.ITALIC, 20));
		tiempo.setBounds(140, 70, 200, 20);
		centro.add(tiempo);

		JLabel tasaInteres = new JLabel("Tasa interes:");
		tasaInteres.setFont(new Font("Tahoma", Font.ITALIC, 20));
		tasaInteres.setBounds(140, 105, 200, 20);
		centro.add(tasaInteres);

		JTextField capitalTxt = new JTextField("1500");
		capitalTxt.setBounds(245, 35, 70, 25);
		centro.add(capitalTxt);

		JTextField tiempoTxt = new JTextField("2");
		tiempoTxt.setBounds(250, 70, 65, 25);
		centro.add(tiempoTxt);

		JTextField tasaInteresTxt = new JTextField("0.1");
		tasaInteresTxt.setBounds(260, 105, 55, 25);
		centro.add(tasaInteresTxt);

		JButton calcular = new JButton("Calcular");
		calcular.setBounds(135, 155, 85, 25);
		calcular.setForeground(Color.white);
		calcular.setBackground(Color.black);
		centro.add(calcular);

		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(240, 155, 85, 25);
		cancelar.setForeground(Color.white);
		cancelar.setBackground(Color.black);
		centro.add(cancelar);

		JLabel calcularInteres = new JLabel("Calcular interes");
		calcularInteres.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		calcularInteres.setBounds(0, 0, 200, 20);
		centro.add(calcularInteres);

		JPanel separacion = new JPanel();
		separacion.setBackground(Color.white);
		separacion.setBounds(0, 200, 500, 25);
		centro.add(separacion);

		JPanel pantalla2 = new JPanel();
		pantalla2.setBounds(0, 200, 500, 160);
		pantalla2.setBackground(new Color(255, 128, 128));
		centro.add(pantalla2);

		JLabel interes = new JLabel("Interes:");
		interes.setFont(new Font("Tahoma", Font.ITALIC, 20));
		interes.setBounds(100, 45, 200, 20);
		pantalla2.add(interes);

		JLabel monto = new JLabel("Monto:");
		monto.setFont(new Font("Tahoma", Font.ITALIC, 20));
		monto.setBounds(100, 90, 200, 20);
		pantalla2.add(monto);

		JTextField interesTxt = new JTextField("315.0000000000002");
		interesTxt.setBounds(200, 45, 150, 25);
		pantalla2.add(interesTxt);

		JTextField montoTxt = new JTextField("1815.0000000000002");
		montoTxt.setBounds(200, 90, 150, 25);
		pantalla2.add(montoTxt);

		repaint();
	}

	public void registroUsuario() {
		getContentPane().setBackground(new Color(0, 255, 0));
		getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("    Registro de Usuarios");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
		getContentPane().add(lblNewLabel_1, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		getContentPane().add(panel, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 255, 0));
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_5.setBounds(10, 0, 325, 311);
		panel_4.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombres:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 26, 127, 28);
		panel_5.add(lblNewLabel);

		JLabel lblDatosGenerales = new JLabel("Datos Generales:");
		lblDatosGenerales.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatosGenerales.setBounds(10, 0, 127, 19);
		panel_5.add(lblDatosGenerales);

		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidoPaterno.setBounds(10, 76, 127, 19);
		panel_5.add(lblApellidoPaterno);

		JLabel lblApellidoPaterno_1 = new JLabel("Apellido Materno:");
		lblApellidoPaterno_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidoPaterno_1.setBounds(10, 114, 127, 28);
		panel_5.add(lblApellidoPaterno_1);

		txtJuanCarlos = new JTextField();
		txtJuanCarlos.setText("Juan Carlos");
		txtJuanCarlos.setBounds(173, 30, 110, 20);
		panel_5.add(txtJuanCarlos);
		txtJuanCarlos.setColumns(10);

		txtArcila = new JTextField();
		txtArcila.setText("Arcila");
		txtArcila.setColumns(10);
		txtArcila.setBounds(173, 75, 110, 20);
		panel_5.add(txtArcila);

		txtDiaz = new JTextField();
		txtDiaz.setText("Diaz");
		txtDiaz.setColumns(10);
		txtDiaz.setBounds(173, 118, 110, 20);
		panel_5.add(txtDiaz);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(173, 161, 110, 20);
		panel_5.add(dateChooser);
		dateChooser.updateUI();

		JLabel lblApellidoPaterno_1_1 = new JLabel("Fecha Nacimiento:");
		lblApellidoPaterno_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidoPaterno_1_1.setBounds(10, 153, 127, 28);
		panel_5.add(lblApellidoPaterno_1_1);

		JLabel lblApellidoPaterno_1_1_1 = new JLabel("Sexo:");
		lblApellidoPaterno_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellidoPaterno_1_1_1.setBounds(43, 182, 38, 28);
		panel_5.add(lblApellidoPaterno_1_1_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(174, 188, 109, 23);
		rdbtnNewRadioButton.setOpaque(false);
		panel_5.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(173, 214, 109, 23);
		rdbtnNewRadioButton_1.setOpaque(false);
		panel_5.add(rdbtnNewRadioButton_1);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);

		JLabel lblApellidoPaterno_1_1_2 = new JLabel("Nacionalidad:");
		lblApellidoPaterno_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellidoPaterno_1_1_2.setBounds(43, 254, 88, 28);
		panel_5.add(lblApellidoPaterno_1_1_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Perú", "Colombia", "México", "Venezuela" }));
		comboBox.setBounds(173, 257, 110, 22);
		panel_5.add(comboBox);
		comboBox.updateUI();

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 128));
		panel_6.setBounds(352, 0, 239, 311);
		panel_4.add(panel_6);
		panel_6.setLayout(null);

		JLabel person2 = new JLabel(new ImageIcon(getClass().getResource("person2.png")));
		person2.setLocation(48, 31);
		person2.setSize(141, 170);
		panel_6.add(person2);

		JLabel lblPerfilDelUsuario = new JLabel("Perfil del Usuario");
		lblPerfilDelUsuario.setBounds(10, 0, 114, 20);
		lblPerfilDelUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6.add(lblPerfilDelUsuario);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(48, 208, 162, 23);
		chckbxNewCheckBox.setOpaque(false);
		panel_6.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha Nacimiento");
		chckbxNewCheckBox_1.setSelected(true);
		chckbxNewCheckBox_1.setBounds(48, 234, 185, 23);
		chckbxNewCheckBox_1.setOpaque(false);
		panel_6.add(chckbxNewCheckBox_1);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 128));
		panel_7.setBounds(10, 322, 325, 193);
		panel_4.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblDatosOpcionales = new JLabel("Datos Opcionales");
		lblDatosOpcionales.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatosOpcionales.setBounds(10, 0, 114, 20);
		panel_7.add(lblDatosOpcionales);

		JScrollPane scroll = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setLocation(20, 72);
		scroll.setSize(114, 98);
		panel_7.add(scroll);

		JTextArea txtrHolaAmigosDe = new JTextArea();
		txtrHolaAmigosDe.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrHolaAmigosDe.setText("Hola amigos de youtube gracias por compartir mis videos");
		scroll.setViewportView(txtrHolaAmigosDe);
		txtrHolaAmigosDe.setLineWrap(true);

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Cantar", "Escuchar Musica", "Leer", "Deportes", "Otros" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(162, 72, 114, 98);

		JScrollPane scroll2 = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll2.setLocation(174, 72);
		scroll2.setSize(114, 98);
		panel_7.add(scroll2);

		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(20, 33, 64, 28);
		panel_7.add(lblDescripcion);

		JLabel lblNewLabel_2_1 = new JLabel("Preferencias:");
		lblNewLabel_2_1.setBounds(174, 33, 114, 28);
		panel_7.add(lblNewLabel_2_1);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 255, 255));
		panel_8.setBounds(345, 322, 246, 193);
		panel_4.add(panel_8);
		panel_8.setLayout(null);

		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.black);
		btnNewButton.setBounds(72, 52, 89, 23);
		panel_8.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(72, 86, 89, 23);
		panel_8.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(72, 120, 89, 23);
		panel_8.add(btnNewButton_2);

		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.decode("#A2F0FF"));
		g2d.fillRect(0, 0, 1200, 700);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(465, 235, 261, 397, 20, 20);
		g2d.setColor(Color.decode("#0081DF"));
		g2d.fillRoundRect(420, 200, 261, 397, 20, 20);
		g2d.setColor(Color.decode("#71C2FF"));
		g2d.fillRoundRect(420, 200, 250, 388, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(422, 200, 260, 397, 20, 20);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(310, 390, 260, 250, 20, 20);
		g2d.setColor(Color.decode("#FF765E"));
		g2d.fillRoundRect(260, 346, 260, 250, 20, 20);
		g2d.setColor(Color.decode("#FFC0B5"));
		g2d.fillRoundRect(260, 346, 249, 238, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(260, 346, 260, 250, 20, 20);
		
		g2d.setColor(Color.decode("#178814"));
		g2d.fillRect(800, 410, 150, 250);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRect(800, 410, 150, 250);
		
		g2d.setColor(Color.decode("#178814"));
		g2d.fillRect(780, 347, 190, 60);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRect(780, 347, 190, 60);
		
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(1000, 390, 260, 250, 20, 20);
		g2d.setColor(Color.decode("#24A63E"));
		g2d.fillRoundRect(1000, 346, 260, 250, 20, 20);
		g2d.setColor(Color.decode("#51D96B"));
		g2d.fillRoundRect(1000, 346, 249, 238, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(1000, 346, 260, 250, 20, 20);
		
		
		g2d.setColor(Color.decode("#C8C8C8"));
		g2d.fillRoundRect(270, 355, 25, 25, 20, 20);
		g2d.fillRoundRect(485, 355, 25, 25, 20, 20);
		g2d.fillRoundRect(270, 562, 25, 25, 20, 20);
		g2d.fillRoundRect(485, 562, 25, 25, 20, 20);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(270, 355, 25, 25, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(485, 355, 25, 25, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(270, 562, 25, 25, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(485, 562, 25, 25, 20, 20);
		
		g2d.setColor(Color.decode("#C8C8C8"));
		g2d.fillRoundRect(1010, 355, 25, 25, 20, 20);
		g2d.fillRoundRect(1010, 562, 25, 25, 20, 20);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(1010, 355, 25, 25, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(1010, 562, 25, 25, 20, 20);
		
		g2d.setColor(Color.decode("#C8C8C8"));
		g2d.fillRoundRect(432, 210, 25, 25, 20, 20);
		g2d.fillRoundRect(648, 210, 25, 25, 20, 20);
		g2d.fillRoundRect(648, 562, 25, 25, 20, 20);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(432, 210, 25, 25, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(648, 210, 25, 25, 20, 20);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(648, 562, 25, 25, 20, 20);
		
		g2d.setColor(Color.decode("#FF9062"));
		g2d.fillRect(50, 250, 70, 70);
		g2d.setColor(Color.black);
		g2d.drawRect(50, 250, 70, 70);
		
		g2d.setColor(Color.decode("#FF9062"));
		g2d.fillRect(1060, 160, 70, 70);
		g2d.setColor(Color.black);
		g2d.drawRect(1060, 160, 70, 70);
		
		g2d.setColor(Color.decode("#FF9062"));
		g2d.fillRect(210, 80, 70, 70);
		g2d.setColor(Color.black);
		g2d.drawRect(210, 80, 70, 70);
		g2d.setColor(Color.decode("#FF9062"));
		g2d.fillRect(284, 80, 70, 70);
		g2d.setColor(Color.black);
		g2d.drawRect(284, 80, 70, 70);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(57, 257, 57, 259);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(113, 257, 113, 259);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(57, 310, 57, 312);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(113, 310, 113, 312);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(218, 88, 218, 90);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(218, 141, 218, 143);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(272, 88, 272, 90);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(272, 141, 272, 143);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(292, 88, 292, 90);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(292, 141, 292, 143);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(346, 88, 346, 90);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(346, 141, 346, 143);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(1068, 167, 1068, 169);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(1068, 220, 1068, 222);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(1122, 167, 1122, 169);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(1122, 220, 1122, 222);
		
		
		
		
		try {
			BufferedImage imagen = ImageIO.read(new File("C:/Users/inghe/eclipse-workspace/Ventana/src/ventana/mario.png"));
			
			g2d.drawImage(imagen, 625, 491, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedImage imagen = ImageIO.read(new File("C:/Users/inghe/eclipse-workspace/Ventana/src/ventana/bush.png"));
			
			g2d.drawImage(imagen, 45, 516, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedImage imagen = ImageIO.read(new File("C:/Users/inghe/eclipse-workspace/Ventana/src/ventana/plant.png"));
			
			g2d.drawImage(imagen, 820, 150, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		g2d.setColor(Color.decode("#F4C7B9"));
		g2d.fillRect(50, 600, 1200, 95);
		
		g2d.setColor(Color.decode("#F39E84"));
		g2d.fillRect(50, 630, 1200, 65);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(52, 600, 1200, 600);
		g2d.drawLine(52, 630, 1200, 630);
		/*
		g2d.setColor(Color.decode("#70FFEB"));
		 g2d.fillRect(0, 0, 900, 600);
		 
		 g2d.setColor(Color.decode("#00CA1B"));
		 g2d.fillRect(0, 350, 900, 300);
		
		 g2d.setColor(Color.decode("#BB9830")); 
		 g2d.fillRect(0, 300, 900, 20);
		 g2d.setColor(Color.decode("#B08300")); 
		 g2d.drawLine(0, 300, 900, 300);
		 g2d.drawLine(0, 320, 900, 320); 
		 int a = 0; 
		 for (int i = 50; i < 900;) {
			 g2d.setColor(Color.decode("#F0C038")); 
			 g2d.fillRect(a, 200, 50, 200);
			 g2d.setColor(Color.decode("#B08300")); 
			 g2d.drawRect(a, 200, 50, 200);
			 a += 60; i += 60; 
			 
		 }
		 
		 g2d.setColor(Color.decode("#FFC900"));
		 g2d.fillRect(240, 160, 360, 260);
		 g2d.setColor(Color.decode("#BB9830"));
		 g2d.drawRect(240, 160, 360, 260);
		 
		 g2d.setColor(Color.decode("#1CFFEE"));
		 g2d.fillRect(440, 225, 100, 100);
		 g2d.setColor(Color.decode("#00C1B2"));
		 g2d.drawRect(440, 225, 100, 100);
		 
		 
		 int xS [] = {220, 420, 620};
		 int yS [] = {160, 60, 160};
		 g2d.setColor(Color.decode("#5B3F00")); 
		 g2d.fillPolygon(xS, yS, 3);
		 g2d.setColor(Color.decode("#936700")); 
		 g2d.fillRect(280, 280, 100, 140);
			 
		 /*
		  
		// Pintura de la casa (arriba)
		int xS[] = { 300, 500, 300, 100 };
		int yS[] = { 200, 200, 300, 300 };
		g2d.setColor(Color.decode("#E8E8E8"));
		g2d.fillPolygon(xS, yS, 4);

		// Pintura de la casa
		int xS2[] = { 100, 650, 500, 300, 300, 100 };
		int yS2[] = { 550, 550, 400, 400, 300, 300 };
		g2d.setColor(Color.decode("#E8E8E8"));
		g2d.fillPolygon(xS2, yS2, 6);

		// pilar (derecha)
		int xS3[] = { 300, 305, 305, 300 };
		int yS3[] = { 300, 298, 360, 360 };
		g2d.setColor(Color.decode("#757575"));
		g2d.fillPolygon(xS3, yS3, 4);

		g2d.setColor(Color.decode("#BCBCBC"));
		g2d.drawLine(700, 300, 500, 300);

		int xS6[] = { 300, 500, 700, 500 };
		int yS6[] = { 300, 200, 200, 300 };
		g2d.setColor(Color.decode("#FAE77E"));
		g2d.fillPolygon(xS6, yS6, 4);

		// Cristal
		g2d.setColor(Color.decode("#9FFFF5"));
		g2d.fillRect(300, 360, 200, 40);
		g2d.setColor(Color.decode("#9FE1DA"));
		g2d.drawLine(380, 360, 300, 400);
		int xS5[] = { 500, 700, 700, 500 };
		int yS5[] = { 360, 260, 300, 400 };
		g2d.setColor(Color.decode("#9FFFF5"));
		g2d.fillPolygon(xS5, yS5, 4);

		int a = 300;
		for (int i = 500; i < 700; i++) {
			g2d.setColor(Color.decode("#B09500"));
			g2d.drawLine(a, 300, i, 200);
			a += 20;
			i += 20;
		}
		// Cristal (borde)
		g2d.setColor(Color.decode("#00DEC6"));
		g2d.drawLine(300, 360, 500, 360);
		g2d.drawLine(300, 400, 500, 400);
		g2d.drawLine(500, 400, 700, 300);
		g2d.drawLine(501, 360, 700, 260);

		// Lineas grises
		g2d.setColor(Color.decode("#BCBCBC"));
		g2d.drawLine(300, 200, 700, 200);
		g2d.drawLine(100, 300, 300, 200);
		g2d.drawLine(100, 300, 500, 300);
		g2d.drawLine(300, 300, 300, 400);
		g2d.drawLine(500, 300, 500, 400);
		g2d.drawLine(380, 360, 700, 200);
		g2d.drawLine(500, 400, 650, 550);
		g2d.drawLine(650, 550, 850, 450);
		g2d.drawLine(850, 450, 700, 300);
		g2d.drawLine(700, 300, 700, 200);

		// pilares
		g2d.setColor(Color.decode("#757575"));
		g2d.fillRect(100, 300, 10, 250);
		g2d.fillRect(290, 300, 10, 250);

		int xS4[] = { 301, 305, 305, 301 };
		int yS4[] = { 361, 361, 397, 399 };
		g2d.setColor(Color.decode("#648E8C"));
		g2d.fillPolygon(xS4, yS4, 4);

		g2d.setColor(Color.decode("#9FE1DA"));
		g2d.drawLine(621, 300, 700, 300);

		g2d.setColor(Color.decode("#B08300"));
		g2d.fillRect(150, 475, 50, 75);

		g2d.setColor(Color.decode("#8C6800"));
		g2d.drawRect(150, 475, 50, 75);
		
		*/

	}
}
