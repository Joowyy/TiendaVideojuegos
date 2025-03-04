package Usuario;

import java.util.Scanner;

public abstract class Cliente {

//	=========================== ATRIBUTOS ===========================
	private String DNI;
	private String nombre;
	private double saldoCuenta;
	
//	=========================== CONSTRUCTORES ===========================
	public Cliente () {
		
	}
	public Cliente (String DNI, String nombre, double saldoCuenta) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldoCuenta = saldoCuenta;
	}
	
//	=========================== GETTERS & SETTERS ===========================
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
//	=========================== METODOS ===========================
	public void disminuirSaldoCuenta() {
		
		Scanner sc = new Scanner (System.in);
		boolean pagado = false;
		
		while (pagado != true) {
		
			System.out.println("Cuanto dinero deseas introducir");
			double saldoUsuario = sc.nextDouble();
			
//			CORRECCION DE ERROR
			if (saldoUsuario <= 0) {
				
				System.out.println("No puedes agregar un saldo negativo bolo!");
				
			} else {
				
				this.saldoCuenta += saldoUsuario;
				
			}
		
		}
		
	}
	
	public void incrementarSaldoCuenta() {
		
	}
	
	public abstract void mostrarCliente();
	
}
