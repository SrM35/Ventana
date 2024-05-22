package database;
import java.sql.*;
import java.util.Scanner;


public class Conex {
	public boolean validarNombre(String nombre) {
		return false;
	}
	
	public boolean validarContra(int contra) {
		return false;
	}
	
	public Conex() {
		Scanner val = new Scanner(System.in);
		
		try {
			
			System.out.print("Ingrese el usuario: ");
			String nombre = val.nextLine();
		
			String nombredb;
			int contradb;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion;
			conexion=DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Mamarre", "freedb_JuanAntonio", "uYJyg5nZ@9dcs%2");
			Statement stat =conexion.createStatement(); 
			ResultSet rs = stat.executeQuery("SELECT * FROM `USUARIO`");
			
			while(rs.next()) {
				nombredb = rs.getString("nombre");
				contradb = rs.getInt("contraseña");
				
				if(nombre.equals(nombredb)) {
					System.out.print("Contrasenia: ");
					int contra = val.nextInt();
					
					if(nombre.equals(nombredb) && contra == contradb) {
						System.out.println("\nBienvenido usuario " + nombredb);
					} else {
						System.out.println("Datos erroneos");
					}
				}
			}
			
			
			
			conexion.close();
			
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
	
	public static void main(String[] args) {
		Conex con = new Conex();
		
	}

}
