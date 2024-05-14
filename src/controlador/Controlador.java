package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{

	private Vista view;
	private Modelo model;
	
	public Controlador(Vista view, Modelo model) {
		this.model = model;
		this.view = view;
		this.view.btnNewButton.addActionListener(this);
	}
	
	public void iniciar() {
		view.setTitle("Login");
		view.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		model.setUsuario(view.textField.getText());
		String contrasenia = new String(view.pwd.getPassword());
		
		try {
			model=view.getUser();
            if(checkUser(model)){
                view.mensajeBueno();
            }else {
                view.mensajeMalo();
                view.pwd.setText("");
                view.textField.setText("");
            }                
        } catch (Exception e1) {
            view.messages(e1.getStackTrace().toString());
        }
	}

	public boolean checkUser(Modelo user){
    	return user.getUsuario().equals("Juan") && user.getContrasenia().equals("20448990");	
    } 
}
